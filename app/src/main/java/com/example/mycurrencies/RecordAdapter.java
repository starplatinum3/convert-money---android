package com.example.mycurrencies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class RecordAdapter extends ArrayAdapter<BeanRecord> {
    int  recourceid;

    public RecordAdapter(@NonNull Context context, int resource, @NonNull List<BeanRecord> objects) {
        super(context, resource, objects);
        recourceid=resource;
    }
//    public RecordAdapter(@NonNull Context context, int id,int resource) {
//        super(context, resource);
//        recourceid=id;
//    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);
        BeanRecord data = getItem(position);
        View view;
        if(convertView==null){
            view= LayoutInflater.from(getContext()).inflate(recourceid,null);
        }else{
            view=convertView;
        }
        TextView forCode=(TextView) view.findViewById(R.id.forCode);
        TextView forAmount=(TextView) view.findViewById(R.id.forAmount);
        TextView homCode=(TextView) view.findViewById(R.id.homCode);
        TextView homAmount=(TextView) view.findViewById(R.id.homAmount);
        TextView time=(TextView) view.findViewById(R.id.time);
        forCode.setText(data.getForCode());
        forAmount.setText(data.getForAmount());
        homCode.setText(data.getHomCode());
        homAmount.setText(data.getHomAmount());
        time.setText(data.getTime());
        return view;

    }

//    public View getView(int position, View converView)
}
