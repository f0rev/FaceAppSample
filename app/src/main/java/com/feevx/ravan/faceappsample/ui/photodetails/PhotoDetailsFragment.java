package com.feevx.ravan.faceappsample.ui.photodetails;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.feevx.ravan.faceappsample.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhotoDetailsFragment extends Fragment {


    public PhotoDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_photo_details, container, false);
    }

}
