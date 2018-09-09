package com.feevx.ravan.faceappsample.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

/**
 * ‍ Spelled 💫  by 🧙 maester ravan on 02/09/2018 in Arcane Castle ✨🏰✨
 **/

@Entity
public class PhotoEntity {

    @PrimaryKey
    @NonNull
    private String id;
    private String fullSize;
    private String thumbnail;

    public PhotoEntity(String id, String fullSize, String thumbnail) {
        this.id = id;
        this.fullSize = fullSize;
        this.thumbnail = thumbnail;
    }

    public String getId() {
        return id;
    }

    public String getFullSize() {
        return fullSize;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public void setFullSize(String fullSize) {
        this.fullSize = fullSize;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
