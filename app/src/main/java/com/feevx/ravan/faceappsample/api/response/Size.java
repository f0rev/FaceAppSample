package com.feevx.ravan.faceappsample.api.response;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Size {

	@SerializedName("width")
	private int width;

	@SerializedName("href")
	private String href;

	@SerializedName("height")
	private int height;

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
			"Size{" +
			"width = '" + width + '\'' + 
			",href = '" + href + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}