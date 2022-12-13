package com.example.myapplication;

import android.util.Log;

public class Image {
    int resourceID;
    int counter;

    Image(int resourceID) {
        this.resourceID = resourceID;

    }

    void incrementCounter() {
        this.counter += 1;
    }

    int getResourceID() {
        return resourceID;
    }

    int getResourceIDAndIncrementCounter() {
        this.incrementCounter();
        return this.resourceID;
    }

    int getCounter() {
        return this.counter;
    }
}
