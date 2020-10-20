package com.kulitekno.listbook;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class cardAdapter extends RecyclerView.Adapter<cardAdapter.CardViewViewHolder> {
    private ArrayList<book> listBook;
    private cardAdapter.OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(cardAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public cardAdapter(ArrayList<book> list) {
        this.listBook = list;
    }

    @NonNull
    @Override
    public cardAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {

        final book book = listBook.get(position);
        Glide.with(holder.itemView.getContext())
                .load(book.getPhoto())
                .into(holder.imgPhoto);
        holder.tvName.setText(book.getName());
        holder.tvDetail.setText(book.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listBook.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBook.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(book data);
    }
}
