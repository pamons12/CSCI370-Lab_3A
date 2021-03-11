package com.example.advancedadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class StudentAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflator;
    private ArrayList<Student> mDataSource;

    public StudentAdapter(Context context, ArrayList arrayList){
        mContext = context;
        mDataSource = arrayList;
        mInflator = (LayoutInflater) mContext.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
    }

    @Override
    public int getCount() {
        return mDataSource.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = mInflator.inflate(R.layout.list_view_row, parent, false);
        TextView firstNameTextView = rowView.findViewById(R.id.first_name);
        TextView lastNameTextView = rowView.findViewById(R.id.last_name);
        TextView majorTextView = rowView.findViewById(R.id.major);

        Student student = (Student) getItem(position);
        firstNameTextView.setText(student.getFirstName());
        lastNameTextView.setText(student.getLastName());
        majorTextView.setText(student.getMajor());
        return rowView;
    }
}
