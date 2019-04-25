package com.example.mandarinapp;
/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation, a Mandarin translation, and an image for that word.
 */
public class Word {
    /** Default translation for the word */

    String mDefaultTranslation;

    /** Mandarin translation for the word */

    String mMandarinTranslation;
    /**
     * Create a new Word object.
     * @param mDefaultTranslation is the word in a language that the user is already familiar with (such as English)
     * @param mMandarinTranslation is the word in the Mandarin language
     */
    public Word(String mDefaultTranslation, String mMandarinTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMandarinTranslation = mMandarinTranslation;
    }
    /**
     * Get the default translation of the word.
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
    /**
     * Get the Mandarin translation of the word.
     */
    public String getmMandarinTranslation() {
        return mMandarinTranslation;
    }
}
