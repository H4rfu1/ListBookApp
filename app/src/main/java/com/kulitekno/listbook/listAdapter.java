package com.kulitekno.listbook;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import java.util.ArrayList;

public class listAdapter extends RecyclerView.Adapter<listAdapter.ListViewHolder> {
    private ArrayList<book> listBook;
    private OnItemClickCallback onItemClickCallback;

    public listAdapter(ArrayList<book> list) {
        this.listBook = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final book book = listBook.get(position);
        Glide.with(holder.itemView.getContext())
                .load(book.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(book.getName());
        holder.tvDetail.setText(book.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listBook.get(holder.getAdapterPosition()));
//                Intent move = new Intent(v.getContext(),detail.class);
//                move.putExtra(detail.TITLE,hero.getName());
//                move.putExtra(detail.ISI,hero.getDetail());
//                move.putExtra(detail.img_data,hero.getPhoto());
//                v.getContext().startActivity(move);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBook.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
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