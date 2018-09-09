package com.feevx.ravan.faceappsample.di.modules;


import com.feevx.ravan.faceappsample.ui.photolist.PhotosListFragment;
import com.feevx.ravan.faceappsample.ui.photodetails.PhotoDetailsFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * ‍ Spelled 💫  by 🧙 maester ravan on 02/08/2018 in Arcane Castle ✨🏰✨
 **/

@Module
public abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract PhotosListFragment contributePhotosListFragment();

    @ContributesAndroidInjector
    abstract PhotoDetailsFragment contributePhotoDetailsFragment();


}
