package com.okubo_tech.booklist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


/**
 * Created by okubo on 2016/11/27.
 * An {@link BookAdapter} knows how to create a list item layout for each book
 * in the data source (a list of {@link Book} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */

public class BookAdapter extends ArrayAdapter<Book> {


    /**
     * Constructs a new {@link BookAdapter}.
     *
     * @param context of the app
     * @param books
     */
    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }


    /**
     * Returns a list item view that displays information about the book at the given position
     * in the list of books.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_book, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        Book currentBook = getItem(position);

        TextView bookTitleView = (TextView) listItemView.findViewById(R.id.title);
        String book_title = currentBook.getmTitle();
        bookTitleView.setText(book_title);

        TextView bookAuthorsView = (TextView) listItemView.findViewById(R.id.author);
        String authors = currentBook.getmAuthor();
        bookAuthorsView.setText(authors);

        TextView bookDescriptionView = (TextView) listItemView.findViewById(R.id.description);
        String description = currentBook.getmDescription();
        bookDescriptionView.setText(description);

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }


}
