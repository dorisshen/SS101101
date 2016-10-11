package com.example.student.ss101101;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.student.ss101101.MainActivity;
import com.example.student.ss101101.R;

/**
 * Created by student on 2016/10/11.
 */

public class MyAdapter extends BaseAdapter {
    String[] data;
    Context context;

    public MyAdapter(Context context, String[] data){
        this.data = data;
        this.context = context;
    }
    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder;
        //View view = inflater.inflate(R.layout.myitem, null);
        //convertView節省記憶體
        if(convertView == null)
        {
            convertView =inflater.inflate(R.layout.myitem, null);
            holder = new ViewHolder();
            convertView.setTag(holder);
            holder.tv = (TextView) convertView.findViewById(R.id.textView);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv.setText(data[position] + ":" + position);
        Log.d("ADAPTER" , "position : " + position);

        return convertView;
    }

    static class ViewHolder{
        TextView tv;
    }
}
