package com.feevx.ravan.faceappsample.ui.photolist;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.feevx.ravan.faceappsample.R;
import com.feevx.ravan.faceappsample.databinding.PhotoItemLayoutBinding;
import com.feevx.ravan.faceappsample.db.entity.PhotoEntity;

import java.util.ArrayList;
import java.util.List;

public class PhotoItemsAdapter extends RecyclerView.Adapter<PhotoItemsAdapter.ViewHolder> {

    private  List<PhotoEntity> data;
    private PhotoEntity photoEntity;

    PhotoItemsAdapter(List<PhotoEntity> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        PhotoItemLayoutBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.photo_item_layout, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        photoEntity = data.get(position);
        holder.bind(photoEntity);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

//    public void updateData(List<PhotoEntity> data) {
//        Log.d("dwedewfwe", "updateData: " + data.size());
//        data.addAll(data);
//        notifyDataSetChanged();
//    }


    class ViewHolder extends RecyclerView.ViewHolder {

        private final PhotoItemLayoutBinding binding;

        ViewHolder(final PhotoItemLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void bind(PhotoEntity item) {
            binding.setPhoto(item);
            binding.executePendingBindings();
        }
    }


}
