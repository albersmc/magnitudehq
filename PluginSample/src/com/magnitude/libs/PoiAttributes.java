package com.magnitude.libs;

import android.os.Parcel;
import android.os.Parcelable;

public class PoiAttributes implements Parcelable {
	private String name;
	private String intent;
	private double altitude;
	private double longitude;
	private double latitude;
	private int icon;
	private String popupUrl;
	
	public PoiAttributes(String name) {
		this.name = name;
	}
		
	
	public PoiAttributes(String name, String intent, 
			double latitude,
			double longitude,
			double altitude,
			int icon) {
		super();
		this.name = name;
		this.intent = intent;
		this.altitude = altitude;
		this.longitude = longitude;
		this.latitude = latitude;
		this.icon = icon;
		this.popupUrl = new String("");
	}

	public PoiAttributes(String name, String intent, 
			double latitude,
			double longitude,
			double altitude) {
		super();
		this.name = name;
		this.intent = intent;
		this.altitude = altitude;
		this.longitude = longitude;
		this.latitude = latitude;
		this.icon = 0x7f020008;
		this.popupUrl = new String("");
	}


	public PoiAttributes(Parcel in) {
		readFromParcel(in);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntent() {
		return intent;
	}
	public void setIntent(String intent) {
		this.intent = intent;
	}
	public double getAltitude() {
		return altitude;
	}
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public int getIcon() {
		return icon;
	}
	public void setIcon(int icon) {
		this.icon = icon;
	}
	public String getPopUp() {
		return popupUrl;
	}
	public void setPopUp(String url) {
		this.popupUrl = url;
	}
	@Override
	public int describeContents() {
		return 0;
	}
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(name);
		dest.writeString(intent);
		dest.writeDouble(altitude);
		dest.writeDouble(longitude);
		dest.writeDouble(latitude);
		dest.writeInt(icon);
		dest.writeString(popupUrl);
	}
	
	public void readFromParcel(Parcel in) {
		 
		name = in.readString();
		intent = in.readString();
		altitude = in.readDouble();
		longitude = in.readDouble();
		latitude = in.readDouble();
		icon = in.readInt();	
		popupUrl = in.readString();	
	}
	
	public static final Parcelable.Creator<PoiAttributes> CREATOR =
   	new Parcelable.Creator<PoiAttributes> (){
           public PoiAttributes createFromParcel(Parcel in) {
               return new PoiAttributes(in);
           }

           public PoiAttributes[] newArray(int size) {
               return new PoiAttributes[size];
           }
       };
	
	
}
