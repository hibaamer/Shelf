package com.example.shelf;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Search extends AppCompatActivity {
        Button view310;
        Button download;
        Button BM_btn;
        DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
// View

        view310 =(Button) findViewById(R.id.view310);
        view310.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String URL  ="https://gofile.io/?c=wEG2oA";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://gofile.io/?c=wEG2oA"));
                startActivity(intent);
                                    }
    });



//download
        download =(Button) findViewById(R.id.download);
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                String Url = "https://gofile.io/?c=wEG2oA";
              //   Uri uri  = Uri.parse(Url) ;
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(Url));

                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                long refrence = downloadManager.enqueue(request);
            }
        });

        BM_btn=(Button)findViewById(R.id.BM_btn);

        BM_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent= new Intent(Intent.ACTION_SEND) ;
                String URL  ="https://gofile.io/?c=wEG2oA";
                String sc310="CS310";
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,sc310);
                shareIntent.putExtra(Intent.EXTRA_TEXT,URL);
                startActivity(Intent.createChooser(shareIntent, "Share using"));


            }
        });
    }



}
