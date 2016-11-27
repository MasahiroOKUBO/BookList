package com.okubo_tech.booklist;

/**
 * Created by okubo on 2016/11/27.
 * An {@link Book} object contains information related to a single book.
 */
public class Book {

    /** Title of the book */
    private String mTitle;

    /** Authors of the book */
    private String mAuthor;

    /** Description of the book */
    private String mDescription;

    /**
     * Constructs a new {@link Book} object.
     *
     * @param Title is the title of the book
     * @param Author is author of the book
     * @param Description is Description of the book
     */
    public Book(String Title, String Author, String Description) {
        this.mTitle = Title;
        this.mAuthor = Author;
        this.mDescription = Description;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmDescription() {
        return mDescription;
    }
}
