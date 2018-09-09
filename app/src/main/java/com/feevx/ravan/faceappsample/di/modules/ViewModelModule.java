package com.feevx.ravan.faceappsample.di.modules;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.feevx.ravan.faceappsample.di.key.ViewModelKey;
import com.feevx.ravan.faceappsample.viewmodels.FactoryViewModel;
import com.feevx.ravan.faceappsample.viewmodels.PhotosViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(PhotosViewModel.class)
    abstract ViewModel bindPhotosViewModel(PhotosViewModel photosViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(FactoryViewModel factory);
}
