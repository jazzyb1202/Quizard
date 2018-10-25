package com.example.lucindabell.quizard;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class Study_ResourcesMain extends ActivityGroup {

    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.res_main);
//This creates the feature where the user can use tabs to navigate between the links and video resources
   final TabHost tabHost = findViewById(R.id.tab_host);
        tabHost.setup(this.getLocalActivityManager());

    // Tab for Videos
    TabHost.TabSpec videospec = tabHost.newTabSpec("Videos");
    // setting Title and Icon for the Tab
    videospec.setIndicator("Videos");
    Intent videosIntent = new Intent(this, Study_VideoMainDisplay.class);
    videospec.setContent(videosIntent);

    // Tab for Links
    TabHost.TabSpec linkspec = tabHost.newTabSpec("Links");
    linkspec.setIndicator("Link");
    Intent songsIntent = new Intent(this, Study_LinksDisplay.class);
    linkspec.setContent(songsIntent);

    // Adding all TabSpec to TabHost

    tabHost.addTab(linkspec); // Adding link tab
    tabHost.addTab(videospec); // Adding videos tab

}
}
