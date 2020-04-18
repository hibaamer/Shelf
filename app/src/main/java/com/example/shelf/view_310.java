package com.example.shelf;

import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnDrawListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnPageErrorListener;
import com.github.barteksc.pdfviewer.listener.OnRenderListener;
import com.github.barteksc.pdfviewer.listener.OnTapListener;
import com.krishna.fileloader.FileLoader;
import com.krishna.fileloader.listener.FileRequestListener;
import com.krishna.fileloader.pojo.FileResponse;
import com.krishna.fileloader.request.FileLoadRequest;

import java.io.File;

public class view_310 extends AppCompatActivity {

    PDFView view;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        view = (PDFView) findViewById(R.id.View_310);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        progressBar.setVisibility(View.VISIBLE);


            FileLoader.with(this)
                    .load("https://gofile.io/?c=zGh9si")
                    .fromDirectory("PDFFiles", FileLoader.DIR_EXTERNAL_PUBLIC)
                    .asFile(new FileRequestListener<File>() {
                        @Override
                        public void onLoad(FileLoadRequest request, FileResponse<File> fileResponse) {
                            progressBar.setVisibility(View.GONE);


                            File pdfFile = fileResponse.getBody();

                            view.fromFile(pdfFile)
                                    .password(null).defaultPage(0).enableSwipe(true).swipeHorizontal(false)
                                    .enableDoubletap(true).onDraw(new OnDrawListener() {

                                @Override
                                public void onLayerDrawn(Canvas canvas, float pageWidth, float pageHeight, int displayedPage) {
                                    //code if require
                                }
                            })
                                    .onDrawAll(new OnDrawListener() {
                                        @Override
                                        public void onLayerDrawn(Canvas canvas, float pageWidth, float pageHeight, int displayedPage) {
                                            //code if require
                                        }
                                    })

                                    .onPageError(new OnPageErrorListener() {
                                        @Override
                                        public void onPageError(int page, Throwable t) {
                                            Toast.makeText(getApplicationContext(),"Error Occur ",Toast.LENGTH_LONG).show();
                                        }
                                    })
                                    .onPageChange(new OnPageChangeListener() {
                                        @Override
                                        public void onPageChanged(int page, int pageCount) {
                                            //code if require
                                        }
                                    })
                                    .onTap(new OnTapListener() {
                                        @Override
                                        public boolean onTap(MotionEvent e) {
                                            return true;
                                        }
                                    })
                                    .onRender(new OnRenderListener() {
                                        @Override
                                        public void onInitiallyRendered(int nbPages, float pageWidth, float pageHeight) {
                                            view.fitToWidth();
                                        }
                                    })
                                    .enableAnnotationRendering(true)
                                    .invalidPageColor(Color.WHITE)
                                    .load();

                            }

                        @Override
                        public void onError(FileLoadRequest request, Throwable t) {
                            Toast.makeText(getApplicationContext(),""+t.getMessage(),Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    });



    }
}
