package com.example.android.guardiannewsapp;



/**
 * An {@link News} object contains information related to a single news item.
 */
public class News {

    /** Magnitude of the news item */
    // private double mMagnitude;



    /** Location of the news item */
    // private String mLocation;

    private String mNewsTitle;
    private String mNewsSection;
    // private String mNewsAuthor;

    /** Time of the news item */
    private String mNewsDate;

    /** Website URL of the news item */
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param newsTitle is the magnitude (size) of the news item
     * @param newsSection is the location where the news item happened
     * // @param newsAuthor
     * @param newsDate is the time in milliseconds (from the Epoch) when the
     *                           news item happened
     * @param url is the website URL to find more details about the news item
     */
    public News(String newsTitle, String newsSection, String newsDate, String url) {
        mNewsTitle = newsTitle;
        mNewsSection = newsSection;
        // mNewsAuthor = newsAuthor;
        mNewsDate = newsDate;
        mUrl = url;
    }

    /**
     * Returns the magnitude of the news item.
     */
    public String getNewsTitle() {
        return mNewsTitle;
    }

    public String getNewsSection() {
        return mNewsSection;
    }

    /**
     * Returns the location of the news item.
     */
    /* public String getNewsAuthor() {
        return mNewsAuthor;
    } */

    /**
     * Returns the time of the news item.
     */
    public String getNewsDate() {
        return mNewsDate;
    }

    /**
     * Returns the website URL to find more information about the news item.
     */
    public String getUrl() {
        return mUrl;
    }
}
