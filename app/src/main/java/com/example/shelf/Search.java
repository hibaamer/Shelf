package com.example.shelf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.mbms.DownloadRequest;
import android.view.View;
import android.widget.Button;

public class Search extends AppCompatActivity {

        Button download;
        DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        download =(Button) findViewById(R.id.download);
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                 Uri uri  = Uri.parse("https://gofile.io/?c=zGh9si");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                long refrence = downloadManager.enqueue(request);
            }
        });
    }
}
