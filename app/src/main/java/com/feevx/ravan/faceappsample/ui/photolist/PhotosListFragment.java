package com.feevx.ravan.faceappsample.ui.photolist;


import android.app.Application;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.feevx.ravan.faceappsample.R;
import com.feevx.ravan.faceappsample.configs.SpacesItemDecoration;
import com.feevx.ravan.faceappsample.db.entity.PhotoEntity;
import com.feevx.ravan.faceappsample.viewmodels.PhotosViewModel;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.support.AndroidSupportInjection;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhotosListFragment extends Fragment {

    @Inject
    ViewModelProvider.Factory viewModelFactory;
    @Inject
    Application mContext;
    @BindView(R.id.photos_rv)
    RecyclerView photosRv;
    Unbinder unbinder;
    PhotoItemsAdapter photoItemsAdapter;
    private PhotosViewModel photosViewModel;


    public PhotosListFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_photos_list, container, false);
        unbinder = ButterKnife.bind(this, view);

//        configureList();

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        configureDagger();
        configureViewModel();
    }

    private void configureDagger() {
        AndroidSupportInjection.inject(this);
    }


    private void configureList(List<PhotoEntity> data) {
        RecyclerView.LayoutManager gridLayoutManager = new GridLayoutManager(mContext, 2);
        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.spacing);
        photosRv.addItemDecoration(new SpacesItemDecoration(spacingInPixels));
        photosRv.setLayoutManager(gridLayoutManager);
        photoItemsAdapter = new PhotoItemsAdapter(data);
        photosRv.setAdapter(photoItemsAdapter);
    }

    private void configureViewModel() {
        photosViewModel = ViewModelProviders.of(this, viewModelFactory).get(PhotosViewModel.class);
        photosViewModel.init();
        photosViewModel.getPhotoLiveData().observe(this, photoEntities -> {
            configureList(photoEntities);
        });
    }

//    private void updateUI(List<PhotoEntity> coffeeEntities) {
//        Log.d("fewfwef", "updateUI: " + Thread.currentThread());
//        for (PhotoEntity coffeeEntity : coffeeEntities) {
//            Log.d("cvdscsdc", "updateUI: " + coffeeEntity.getThumbnail());
//        }
//        photoItemsAdapter.updateData(coffeeEntities);
//    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
