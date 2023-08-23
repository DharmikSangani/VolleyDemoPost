package com.example.volleydemopost;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecycleHolder> {
    MainActivity mainActivity;
    ArrayList<Data_Model> dataModalList;

    public RecyclerAdapter(MainActivity mainActivity, ArrayList<Data_Model> dataModalList) {
        this.mainActivity = mainActivity;
        this.dataModalList = dataModalList;
    }

    @NonNull
    @Override
    public RecyclerAdapter.RecycleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.main_item,parent,false);
        RecycleHolder holder = new RecycleHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.RecycleHolder holder, int position) {
        holder.txt1.setText(""+dataModalList.get(position).getUserid());
        holder.txt2.setText(""+dataModalList.get(position).getTitel());
        holder.txt3.setText(""+dataModalList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return dataModalList.size();
    }


    public class RecycleHolder extends RecyclerView.ViewHolder {
        TextView txt1,txt2,txt3;
        public RecycleHolder(@NonNull View itemView) {
            super(itemView);
            txt1 = itemView.findViewById(R.id.item_userid);
            txt2 = itemView.findViewById(R.id.item_titel);
            txt3 = itemView.findViewById(R.id.item_body);

        }
    }
}
