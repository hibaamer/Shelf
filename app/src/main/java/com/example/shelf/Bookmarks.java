package com.example.shelf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Bookmarks extends RecyclerView.Adapter<Bookmarks.ViewHolder>{

    private Context context;
    private List<bookmark_items> bookmark_itemsList;
    private BookmarksDB BookmarksDB;

    public Bookmarks(Context context, List<bookmark_items> bookmark_itemsList) {
        this.context=context;
        this.bookmark_itemsList=bookmark_itemsList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_bookmark_items,parent,false);
        BookmarksDB=new BookmarksDB(context);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.desc_text.setText(bookmark_itemsList.get(position).getContent_title());
        holder.cont_image.setImageResource(bookmark_itemsList.get(position).getContent_image());

    }

    @Override
    public int getItemCount() {
        return bookmark_itemsList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView desc_text;
        ImageView cont_image;
        Button BM_btn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            desc_text= itemView.findViewById(R.id.desc_text);
            cont_image= itemView.findViewById(R.id.cont_image);
            BM_btn= itemView.findViewById(R.id.BM_btn);
            //Remove from bookmarks
            BM_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position= getAdapterPosition();
                    final bookmark_items bookmark_items= bookmark_itemsList.get(position);
                    BookmarksDB.Remove_Bookmark(bookmark_items.getKey_id());
                    removeItem(position);

                }
            }) ;


        }
    }

    private void removeItem(int position) {
        bookmark_itemsList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, bookmark_itemsList.size());

    }
}
