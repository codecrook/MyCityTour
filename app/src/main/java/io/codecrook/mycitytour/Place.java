package io.codecrook.mycitytour;

public class Place {
    private String mType;
    private String mName;
    private String mLocation;
    private int mPhotoResID;
    private String mDescription;

    public Place(String mType, String mName, String mLocation, int mPhotoResID, String mDescription) {
        this.mType = mType;
        this.mName = mName;
        this.mLocation = mLocation;
        this.mPhotoResID = mPhotoResID;
        this.mDescription = mDescription;
    }

    public String getmType() {
        return mType;
    }

    public String getmName() {
        return mName;
    }

    public String getmLocation() {
        return mLocation;
    }

    public int getmPhotoResID() {
        return mPhotoResID;
    }

    public String getmDescription() {
        return mDescription;
    }
}
