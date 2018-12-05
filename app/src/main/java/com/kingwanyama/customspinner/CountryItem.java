package com.kingwanyama.customspinner;

/**
 * Created by emobilis on 12/5/18.
 */

public class CountryItem {
     String mCountryName;
     int mFlagImage;

    public CountryItem(String mCountryName, int mFlagImage) {
        this.mCountryName = mCountryName;
        this.mFlagImage = mFlagImage;
    }

    public String getmCountryName() {
        return mCountryName;
    }

    public int getmFlagImage() {
        return mFlagImage;
    }
}
