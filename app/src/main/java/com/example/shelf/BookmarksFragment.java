package com.example.shelf;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BookmarksFragment extends Fragment {
    private RecyclerView recyclerView;
    private BookmarksDB bookmarksDB;
    private Bookmarks bookmarks;
    private List<bookmark_items> bookmark_itemsList= new ArrayList<>();

    public BookmarksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.bookmarks_fragment, container, false);
        bookmarksDB= new BookmarksDB(getActivity());
        recyclerView=root.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        loadData();

        return root;
    }

    private void loadData() {
        if (bookmark_itemsList != null) {
            bookmark_itemsList.clear();
        }
        SQLiteDatabase db = bookmarksDB.getReadableDatabase();
        Cursor cursor = bookmarksDB.Selcet_AllBookmarks();
        try {
            while (cursor.moveToNext()) {
                String title = cursor.getString(cursor.getColumnIndex(BookmarksDB.COL_TITLE));
                String id = cursor.getString(cursor.getColumnIndex(BookmarksDB.COL_ID));
                int image=Integer.parseInt(cursor.getString(cursor.getColumnIndex(BookmarksDB.COL_IMAGE)));
                bookmark_items bookmark_items = new bookmark_items(title,id,image);
                bookmark_itemsList.add(bookmark_items);
            }
        } finally {
            if(cursor != null && cursor.isClosed())
                cursor.isClosed();
            db.close();
        }
        bookmarks = new Bookmarks(getActivity(), bookmark_itemsList);
        recyclerView.setAdapter(bookmarks);
    }
}
