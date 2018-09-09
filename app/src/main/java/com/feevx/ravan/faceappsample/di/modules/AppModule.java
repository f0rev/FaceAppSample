package com.feevx.ravan.faceappsample.di.modules;


import android.app.Application;
import android.arch.persistence.room.Room;

import com.feevx.ravan.faceappsample.api.PhotoService;
import com.feevx.ravan.faceappsample.configs.Constant;
import com.feevx.ravan.faceappsample.db.PhotosDatabase;
import com.feevx.ravan.faceappsample.db.dao.PhotoDao;
import com.feevx.ravan.faceappsample.repositories.PhotoRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * ‍ Spelled 💫  by 🧙 maester ravan on 02/08/2018 in Arcane Castle ✨🏰✨
 **/

@Module(includes = ViewModelModule.class)
public class AppModule {

//    @Provides
//    @Singleton
//    Context provideContext(Application application) {
//        return application;
//    }

    //database injection
    @Provides
    @Singleton
    PhotosDatabase provideDatabase(Application application) {
        return Room.databaseBuilder(application,
                PhotosDatabase.class, "PhotosDatabase.db")
                .build();
    }

    @Provides
    @Singleton
    PhotoDao provideUserDao(PhotosDatabase database) { return database.photoDao(); }


    //repository injection
    @Provides
    @Singleton
    PhotoRepository providePhotoRepository(PhotoService photoService, PhotoDao photoDao) {
        return new PhotoRepository(photoService, photoDao);
    }

    @Provides
    Gson provideGson() { return new GsonBuilder().create(); }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient() {
        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        okHttpClient.connectTimeout(Constant.TIMEOUT_IN_SEC, TimeUnit.SECONDS);
        okHttpClient.readTimeout(Constant.TIMEOUT_IN_SEC, TimeUnit.SECONDS);
        return okHttpClient.build();
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(Constant.ENDPOINT)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .build();
    }

    @Provides
    @Singleton
    PhotoService provideApiWebservice(Retrofit restAdapter) {
        return restAdapter.create(PhotoService.class);
    }

}
