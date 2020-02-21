package com.deybian.as3app;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {


    private Context mContext ;
    private List<modelopuerta> mData ;



    public RecyclerViewAdaptador(Context mContext, List<modelopuerta> mData) {
        this.mContext = mContext;
        this.mData = mData;

        // Request option for Glide


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.itemlista,parent,false) ;
        final MyViewHolder viewHolder = new MyViewHolder(view) ;
        viewHolder.view_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(mContext, Main4Activity.class);
                i.putExtra("titulo",mData.get(viewHolder.getAdapterPosition()).getTitu());
                i.putExtra("description",mData.get(viewHolder.getAdapterPosition()).getDes());
                i.putExtra("imgpuerta",mData.get(viewHolder.getAdapterPosition()).getImgpuerta());


                mContext.startActivity(i);

            }
        });




        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.titu.setText(mData.get(position).getTitu());
        holder.des.setText(mData.get(position).getDes());
        holder.imgpuerta.setText(mData.get(position).getImgpuerta());

        // Load Image from the internet and set it into Imageview using Glide





    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titu;
        TextView des ;
        TextView imgpuerta ;






        public MyViewHolder(View itemView) {
            super(itemView);

            view_container = itemView.findViewById(R.id.container);
            titu = itemView.findViewById(R.id.materiall);
            des = itemView.findViewById(R.id.desmateriall);
            imgpuerta = itemView.findViewById(R.id.imgmain);

        }
    }



}
