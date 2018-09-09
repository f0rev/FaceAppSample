package com.feevx.ravan.faceappsample.api;

import com.feevx.ravan.faceappsample.api.response.YandexPhotoResponse;

import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.GET;

public interface PhotoService {

    @GET("/api/recent/?format=json")
    Single<Response<YandexPhotoResponse>> getPhotosFromApi();
}
