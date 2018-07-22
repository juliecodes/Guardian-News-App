package com.example.android.guardiannewsapp;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * An {@link NewsAdapter} knows how to create a list item layout for each news item
 * in the data source (a list of {@link News} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * The part of the location string from the USGS service that we use to determine
     * whether or not there is a location offset present ("5km N of Cairo, Egypt").
     */

    // private static final String LOCATION_SEPARATOR = " of ";

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context     of the app
     * @param newsItems is the list of news items, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> newsItems) {
        super(context, 0, newsItems);
    }

    /**
     * Returns a list item view that displays information about the news item at the given position
     * in the list of news items.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news item at the given position in the list of news items
        News currentNewsItem = getItem(position);

        String newsItemDate = currentNewsItem.getNewsDate();

        String[] dateTimeparts = newsItemDate.split("T");
        // Location offset should be "5km N " + " of " --> "5km N of"
        String newsItemDateDay = dateTimeparts[0];
        // Primary location should be "Cairo, Egypt"
        String newsItemTimeDraft = dateTimeparts[1];
        String[] timeParts = newsItemTimeDraft.split("Z");
        String newsItemTime = timeParts[0];


        String newsItemTitle = currentNewsItem.getNewsTitle();

        // Find the TextView with view ID location
        TextView primaryLocationView = (TextView) listItemView.findViewById(R.id.news_title);
        // Display the location of the current news item in that TextView
        primaryLocationView.setText(newsItemTitle);


        String newsItemSection = currentNewsItem.getNewsSection();
        // Find the TextView with view ID location offset
        TextView locationOffsetView = (TextView) listItemView.findViewById(R.id.news_section);
        // Display the location offset of the current news item in that TextView
        locationOffsetView.setText(newsItemSection);

        // Create a new Date object from the time in milliseconds of the news item
        //String newsItemDate = currentNewsItem.getNewsDate();

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Format the date string (i.e. "Mar 3, 1984")
        // String formattedDate = formatDate(dateObject);

        // Display the date of the current news item in that TextView
        dateView.setText(newsItemDateDay);


        // Find the TextView with view ID time
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        // Format the time string (i.e. "4:30PM")
        // String formattedTime = formatTime(dateObject);
        // Display the time of the current news item in that TextView
        timeView.setText(newsItemTime);

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }





    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}
