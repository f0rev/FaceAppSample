package com.feevx.ravan.faceappsample.di.modules;

import com.feevx.ravan.faceappsample.ui.MainActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * ‍ Spelled 💫  by 🧙 maester ravan on 02/08/2018 in Arcane Castle ✨🏰✨
 **/

@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector(modules = {FragmentModule.class})
    abstract MainActivity contributeMainActivity();

}