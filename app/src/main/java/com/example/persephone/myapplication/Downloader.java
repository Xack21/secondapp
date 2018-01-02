package com.example.persephone.myapplication;

/**
 * Created by Persephone on 1/1/2018.
 */

public class Downloader {
    downloadCompleted mListerner;
    public Downloader(downloadCompleted listener) {
        this.mListerner = listener;
    }

    public void download(){
        for (int i = 0; i <10 ; i++) {
            mListerner.downloaded(i);
        }
    }
}
