package com.feevx.ravan.faceappsample.repositories;

import android.arch.lifecycle.LiveData;
import android.util.Log;

import com.feevx.ravan.faceappsample.api.PhotoService;
import com.feevx.ravan.faceappsample.api.response.EntriesItem;
import com.feevx.ravan.faceappsample.api.response.YandexPhotoResponse;
import com.feevx.ravan.faceappsample.db.dao.PhotoDao;
import com.feevx.ravan.faceappsample.db.entity.PhotoEntity;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

public class PhotoRepository {

    private final PhotoService photoService;
    private final PhotoDao photoDao;

    @Inject
    public PhotoRepository(PhotoService photoService, PhotoDao photoDao) {
        this.photoService = photoService;
        this.photoDao = photoDao;
    }

    public LiveData<List<PhotoEntity>> getPhotos() {
        Single<Response<YandexPhotoResponse>> resultObservable = photoService.getPhotosFromApi();
        resultObservable
                .doOnSubscribe(t -> {

                })
                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(response -> consumeResponse(response),
                        throwable -> Log.i("Repository", throwable.getMessage()));


        return photoDao.getAll();
    }

    private void consumeResponse(Response<YandexPhotoResponse> response) {
        if (!response.isSuccessful())
            Log.i("Repository", "not respond");
        else {
            List<PhotoEntity> photoEntities = new ArrayList<>();
            List<EntriesItem> entriesItems = response.body().getEntries();
            for (EntriesItem entriesItem : entriesItems) {
                if (entriesItem.getImg().getOrig() != null && entriesItem.getImg().getM() != null) {
                    photoEntities.add(new PhotoEntity(entriesItem.getId(), entriesItem.getImg().getOrig().getHref(),
                            entriesItem.getImg().getM().getHref()));
                }

            }
            photoDao.savePhotoEntities(photoEntities);

        }
    }
}
