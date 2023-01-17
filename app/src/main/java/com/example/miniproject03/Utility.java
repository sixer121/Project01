package com.example.miniproject03;

import android.app.Activity;
import android.content.Intent;

public class Utility {
    public static String get_ts() {
        long tsLong = System.currentTimeMillis()/1000;
        return Long.toString(tsLong);
    }
    public static void page(Activity source, Class target){
        Intent intent = new Intent(source, target);
        source.startActivity(intent);
    }
}