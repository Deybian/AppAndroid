package com.deybian.as3app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador2 extends RecyclerView.Adapter<RecyclerViewAdaptador2.ViewHolder> {

    public  class  ViewHolder extends  RecyclerView.ViewHolder{

        private TextView nommaterial,desmaterial;
                ImageView precciomaterial;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            nommaterial =(TextView)itemView.findViewById(R.id.materiall);
            desmaterial=(TextView)itemView.findViewById(R.id.desmateriall);
            //desmaterial=(TextView)itemView.findViewById(R.id.desmateriall);

            precciomaterial =(ImageView)itemView.findViewById(R.id.imgmaterial);

        }
    }


    public List<modelomaterial> materiallista;

    public RecyclerViewAdaptador2(List<modelomaterial> materiallista) {
        this.materiallista = materiallista;
    }

    @NonNull
    @Override
    public RecyclerViewAdaptador2.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.materiallista,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.nommaterial.setText(materiallista.get(position).getNommaterial());
        holder.desmaterial.setText(materiallista.get(position).getDesmaterial());
        holder.precciomaterial.setImageResource(materiallista.get(position).getPrecciomaterial());
    }

    @Override
    public int getItemCount() {
        return materiallista.size();
    }
}
