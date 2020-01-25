package com.zhenmei.p7i.ninegrid;

import android.app.Application;

import com.zhenmei.p7i.ninegrid.round.RoundNineGridView;

public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        RoundNineGridView.setImageLoader(new GlideImageLoader());
    }
}
