package com.feevx.ravan.faceappsample.api.response;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Links{

	@SerializedName("self")
	private String self;

	@SerializedName("alternate")
	private String alternate;

	@SerializedName("edit")
	private String edit;

	@SerializedName("album")
	private String album;

	@SerializedName("editMedia")
	private String editMedia;

	public String getSelf(){
		return self;
	}

	public String getAlternate(){
		return alternate;
	}

	public String getEdit(){
		return edit;
	}

	public String getAlbum(){
		return album;
	}

	public String getEditMedia(){
		return editMedia;
	}

	@Override
 	public String toString(){
		return 
			"Links{" + 
			"self = '" + self + '\'' + 
			",alternate = '" + alternate + '\'' + 
			",edit = '" + edit + '\'' + 
			",album = '" + album + '\'' + 
			",editMedia = '" + editMedia + '\'' + 
			"}";
		}
}