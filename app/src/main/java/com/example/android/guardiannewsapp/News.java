package com.example.android.guardiannewsapp;



/**
 * An {@link News} object contains information related to a single news item.
 */
public class News {

    /** Magnitude of the news item */
    private double mMagnitude;

    /** Location of the news item */
    private String mLocation;

    /** Time of the news item */
    private long mTimeInMilliseconds;

    /** Website URL of the news item */
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param magnitude is the magnitude (size) of the news item
     * @param location is the location where the news item happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           news item happened
     * @param url is the website URL to find more details about the news item
     */
    public News(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Returns the magnitude of the news item.
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Returns the location of the news item.
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Returns the time of the news item.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the news item.
     */
    public String getUrl() {
        return mUrl;
    }
}
