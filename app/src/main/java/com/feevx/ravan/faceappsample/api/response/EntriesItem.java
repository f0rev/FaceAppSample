package com.feevx.ravan.faceappsample.api.response;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class EntriesItem{

	@SerializedName("img")
	private Img img;

	@SerializedName("access")
	private String access;

	@SerializedName("edited")
	private String edited;

	@SerializedName("created")
	private String created;

	@SerializedName("hideOriginal")
	private boolean hideOriginal;

	@SerializedName("author")
	private String author;

	@SerializedName("published")
	private String published;

	@SerializedName("title")
	private String title;

	@SerializedName("disableComments")
	private boolean disableComments;

	@SerializedName("tags")
	private Tags tags;

	@SerializedName("xxx")
	private boolean xxx;

	@SerializedName("links")
	private Links links;

	@SerializedName("id")
	private String id;

	@SerializedName("updated")
	private String updated;

	@SerializedName("authors")
	private List<AuthorsItem> authors;

	public Img getImg(){
		return img;
	}

	public String getAccess(){
		return access;
	}

	public String getEdited(){
		return edited;
	}

	public String getCreated(){
		return created;
	}

	public boolean isHideOriginal(){
		return hideOriginal;
	}

	public String getAuthor(){
		return author;
	}

	public String getPublished(){
		return published;
	}

	public String getTitle(){
		return title;
	}

	public boolean isDisableComments(){
		return disableComments;
	}

	public Tags getTags(){
		return tags;
	}

	public boolean isXxx(){
		return xxx;
	}

	public Links getLinks(){
		return links;
	}

	public String getId(){
		return id;
	}

	public String getUpdated(){
		return updated;
	}

	public List<AuthorsItem> getAuthors(){
		return authors;
	}

	@Override
 	public String toString(){
		return 
			"EntriesItem{" + 
			"img = '" + img + '\'' + 
			",access = '" + access + '\'' + 
			",edited = '" + edited + '\'' + 
			",created = '" + created + '\'' + 
			",hideOriginal = '" + hideOriginal + '\'' + 
			",author = '" + author + '\'' + 
			",published = '" + published + '\'' + 
			",title = '" + title + '\'' + 
			",disableComments = '" + disableComments + '\'' + 
			",tags = '" + tags + '\'' + 
			",xxx = '" + xxx + '\'' + 
			",links = '" + links + '\'' + 
			",id = '" + id + '\'' + 
			",updated = '" + updated + '\'' + 
			",authors = '" + authors + '\'' + 
			"}";
		}
}