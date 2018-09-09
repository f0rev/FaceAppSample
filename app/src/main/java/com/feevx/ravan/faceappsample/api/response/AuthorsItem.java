package com.feevx.ravan.faceappsample.api.response;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AuthorsItem{

	@SerializedName("uid")
	private String uid;

	@SerializedName("name")
	private String name;

	public String getUid(){
		return uid;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"AuthorsItem{" + 
			"uid = '" + uid + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}