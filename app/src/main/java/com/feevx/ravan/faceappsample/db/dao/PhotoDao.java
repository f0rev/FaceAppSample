package com.feevx.ravan.faceappsample.db.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.feevx.ravan.faceappsample.db.entity.PhotoEntity;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;


@Dao
public interface PhotoDao {

    @Insert(onConflict = REPLACE)
    void savePhotoEntities(List<PhotoEntity> photoEntities);

    @Query("select * from photoentity")
    LiveData<List<PhotoEntity>> getAll();
}

