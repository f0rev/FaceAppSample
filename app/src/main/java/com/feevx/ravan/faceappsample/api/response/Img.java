package com.feevx.ravan.faceappsample.api.response;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Img{

	@SerializedName("XXS")
	private Size xXS;

	@SerializedName("XXXS")
	private Size xXXS;

	@SerializedName("S")
	private Size S;

	@SerializedName("XL")
	private Size xL;

	@SerializedName("orig")
	private Orig orig;

	@SerializedName("XS")
	private Size xS;

	@SerializedName("Size")
	private Size Size;

	@SerializedName("M")
	private Size M;

	@SerializedName("XXXL")
	private Size xXXL;

	@SerializedName("XXL")
	private Size xXL;

	public Size getXXS(){
		return xXS;
	}

	public Size getXXXS(){
		return xXXS;
	}

	public Size getS(){
		return S;
	}

	public Size getXL(){
		return xL;
	}

	public Orig getOrig(){
		return orig;
	}

	public Size getXS(){
		return xS;
	}

	public Size getSize(){
		return Size;
	}

	public Size getM(){
		return M;
	}

	public Size getXXXL(){
		return xXXL;
	}

	public Size getXXL(){
		return xXL;
	}

	@Override
 	public String toString(){
		return 
			"Img{" + 
			"xXS = '" + xXS + '\'' + 
			",xXXS = '" + xXXS + '\'' + 
			",S = '" + S + '\'' + 
			",xL = '" + xL + '\'' + 
			",orig = '" + orig + '\'' + 
			",xS = '" + xS + '\'' + 
			",Size = '" + Size + '\'' +
			",M = '" + M + '\'' + 
			",xXXL = '" + xXXL + '\'' + 
			",xXL = '" + xXL + '\'' + 
			"}";
		}
}