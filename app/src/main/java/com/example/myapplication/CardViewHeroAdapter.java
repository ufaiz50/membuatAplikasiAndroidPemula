package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewHeroAdapter extends RecyclerView.Adapter<CardViewHeroAdapter.CardViewViewHolder> {
    private ArrayList<Hero> listHero;


    public CardViewHeroAdapter(ArrayList<Hero> list) {
        this.listHero = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_hero, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {

        Hero hero = listHero.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hero.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.tvName.setText(hero.getName());
        holder.tvDetail.setText(hero.getDetail());
        holder.btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = listHero.get(holder.getAdapterPosition()).getNumber();
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                v.getContext().startActivity(dialPhoneIntent);
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Kamu memilih " + listHero.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), HalamanDetail.class);
                intent.putExtra(HalamanDetail.EXTRA_URL, listHero.get(holder.getAdapterPosition()).getPhoto());
                intent.putExtra(HalamanDetail.EXTRA_NAME, listHero.get(holder.getAdapterPosition()).getName());
                intent.putExtra(HalamanDetail.EXTRA_NIM, listHero.get(holder.getAdapterPosition()).getNim());
                intent.putExtra(HalamanDetail.EXTRA_PROGDI, listHero.get(holder.getAdapterPosition()).getProgdi());
                intent.putExtra(HalamanDetail.EXTRA_ANGKATAN, listHero.get(holder.getAdapterPosition()).getAngkatan());
                intent.putExtra(HalamanDetail.EXTRA_NUMBER, listHero.get(holder.getAdapterPosition()).getNumber());
                intent.putExtra(HalamanDetail.EXTRA_DETAIL, listHero.get(holder.getAdapterPosition()).getDetail());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listHero.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnContact;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnContact = itemView.findViewById(R.id.btn_set_contact);
        }
    }

}
