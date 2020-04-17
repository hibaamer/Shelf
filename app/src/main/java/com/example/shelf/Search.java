package com.example.shelf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.mbms.DownloadRequest;
import android.view.View;
import android.widget.Button;

public class Search extends AppCompatActivity {
        Button view310;
        Button download;
        DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
// View

        view310 =(Button) findViewById(R.id.view310);
        view310.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent i = new Intent(Search.this,view_310.class);
//                i.putExtra("ViewType", "Internet");
                startActivity(i);

                                    }
    });



//download
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
