package com.example.shelf.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.TextView;
import edmt.dev.androidsqlitesearch.R;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shelf.R;

import java.util.List;

class SearchViewHolder extends RecyclerView.ViewHolder{
public TextView id_content,description,rate,bookmark,download;
    public SearchViewHolder(@NonNull View itemView) {
        super(itemView);
        id_content = (TextView)itemView.findViewById(R.id.id_content);

    }
}
public class SearchAdapter extends RecyclerView.Adapter<SearchViewHolder> {
    private Context context;
    private List<Content> content;

    public SearchAdapter(Context context, List<Content> content) {
        this.context = context;
        this.content = content;
    }

    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.layout_item,parent,attachToRoot:false);
        return new SearchViewHolder(itemView);
    }

    @Override
    //i didnot implement the buttens here!
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
holder.id_content.setText(id_content.get(position).getId_content());
        holder.description.setText(description.get(position).getDescription());
        holder.rate.setText(rate.get(position).getRate());
    }

    @Override
    public int getItemCount() {
        return content.size();
    }
}
