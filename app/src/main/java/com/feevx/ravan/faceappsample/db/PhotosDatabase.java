package com.feevx.ravan.faceappsample.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.feevx.ravan.faceappsample.db.dao.PhotoDao;
import com.feevx.ravan.faceappsample.db.entity.PhotoEntity;

@Database(entities = {PhotoEntity.class}, version = 1, exportSchema = false)
public abstract class PhotosDatabase extends RoomDatabase {

    private static volatile PhotosDatabase INSTANCE;

    public abstract PhotoDao photoDao();
}
