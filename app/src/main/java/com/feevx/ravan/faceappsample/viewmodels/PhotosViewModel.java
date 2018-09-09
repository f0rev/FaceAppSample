package com.feevx.ravan.faceappsample.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.feevx.ravan.faceappsample.db.entity.PhotoEntity;
import com.feevx.ravan.faceappsample.repositories.PhotoRepository;

import java.util.List;

import javax.inject.Inject;


/**
 * ‍ Spelled 💫  by 🧙 maester ravan on 02/08/2018 in Arcane Castle ✨🏰✨
 **/

public class PhotosViewModel extends ViewModel {

    private LiveData<List<PhotoEntity>> photoLiveData;
    private PhotoRepository photoRepository;

    @Inject
    public PhotosViewModel(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    public void init() {
        photoLiveData = photoRepository.getPhotos();

    }

    public LiveData<List<PhotoEntity>> getPhotoLiveData() {
        return photoLiveData;
    }
}
