package com.feevx.ravan.faceappsample.di.component;

import android.app.Application;


import com.feevx.ravan.faceappsample.App;
import com.feevx.ravan.faceappsample.di.modules.ActivityModule;
import com.feevx.ravan.faceappsample.di.modules.AppModule;
import com.feevx.ravan.faceappsample.di.modules.FragmentModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * ‍ Spelled 💫  by 🧙 maester ravan on 02/08/2018 in Arcane Castle ✨🏰✨
 **/

@Singleton
@Component(modules = {ActivityModule.class, FragmentModule.class, AppModule.class})
public interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }
    void inject(App app);

}
