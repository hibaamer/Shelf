package com.example.shelf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
public class view_310 extends AppCompatActivity {

    PDFView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        view = (PDFView) findViewById(R.id.View_310);
        view.fromAsset("Quize1 SE Fall 2018 Solution.pdf").load();


    }
}
