package gr.aueb.cf.customlistview02.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import gr.aueb.cf.customlistview02.R;

public class MyArrayAdapter extends ArrayAdapter<String> {
    private Activity context;
    private String[] myTitles;
    private String[] myDescriptions;
    private Integer[] myImages;

    public MyArrayAdapter(Activity context, String[] myTitles, String[] myDescriptions, Integer[] myImages) {
        super(context, R.layout.item_view, myTitles);
        this.context = context;
        this.myTitles = myTitles;
        this.myDescriptions = myDescriptions;
        this.myImages = myImages;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.item_view, parent, false);

        TextView titleText = view.findViewById(R.id.titleTV);
        TextView descriptionText = view.findViewById(R.id.descriptionTV);
        ImageView imageView = view.findViewById(R.id.myIV);

        titleText.setText(myTitles[position]);
        descriptionText.setText(myDescriptions[position]);
        imageView.setImageResource(myImages[position]);

        return view;

    }
}
