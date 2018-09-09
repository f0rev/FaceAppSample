package com.feevx.ravan.faceappsample.api.response;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class YandexPhotoResponse{

	@SerializedName("entries")
	private List<EntriesItem> entries;

	@SerializedName("links")
	private Links links;

	@SerializedName("id")
	private String id;

	@SerializedName("title")
	private String title;

	@SerializedName("updated")
	private String updated;

	public List<EntriesItem> getEntries(){
		return entries;
	}

	public Links getLinks(){
		return links;
	}

	public String getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}

	public String getUpdated(){
		return updated;
	}

	@Override
 	public String toString(){
		return 
			"YandexPhotoResponse{" + 
			"entries = '" + entries + '\'' + 
			",links = '" + links + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",updated = '" + updated + '\'' + 
			"}";
		}
}