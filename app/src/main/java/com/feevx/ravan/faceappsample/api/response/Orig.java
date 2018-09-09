package com.feevx.ravan.faceappsample.api.response;

import android.support.annotation.Nullable;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Orig{

	@SerializedName("bytesize")
	private int bytesize;

	@SerializedName("width")
	private int width;

	@SerializedName("href")
	private String href;

	@SerializedName("height")
	private int height;

	public int getBytesize(){
		return bytesize;
	}

	public int getWidth(){
		return width;
	}

	public String getHref(){
		return href;
	}

	public int getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"Orig{" + 
			"bytesize = '" + bytesize + '\'' + 
			",width = '" + width + '\'' + 
			",href = '" + href + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}