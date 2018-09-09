package com.feevx.ravan.faceappsample.ui;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.feevx.ravan.faceappsample.R;
import com.feevx.ravan.faceappsample.ui.photolist.PhotosListFragment;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends AppCompatActivity implements HasSupportFragmentInjector {

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureDagger();

        showFragment(savedInstanceState);

    }

    @Override
    public DispatchingAndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }

    private void showFragment(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            PhotosListFragment fragment = new PhotosListFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.main_fragment_container, fragment, null)
                    .commit();
        }
    }

    private void configureDagger() {
        AndroidInjection.inject(this);
    }
}
