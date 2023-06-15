package gr.aueb.cf.customlistview02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import gr.aueb.cf.customlistview02.adapters.MyArrayAdapter;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        String[] titles = {"Airplane Title", "Android Title", "Bike Title", "Car Title", "Truck Title",
                "Airplane Title", "Android Title", "Bike Title", "Car Title", "Truck Title",
                "Airplane Title", "Android Title", "Bike Title", "Car Title", "Truck Title"};

        String[] descriptions = {
                "This is a small description for Airplane",
                "This is a small description for Android",
                "This is a small description for Bike",
                "This is a small description for Car",
                "This is a small description for Truck",
                "This is a small description for Airplane",
                "This is a small description for Android",
                "This is a small description for Bike",
                "This is a small description for Car",
                "This is a small description for Truck",
                "This is a small description for Airplane",
                "This is a small description for Android",
                "This is a small description for Bike",
                "This is a small description for Car",
                "This is a small description for Truck"
        };

        Integer[] images = {
                R.drawable.ic_airplane,
                R.drawable.ic_android,
                R.drawable.ic_bike,
                R.drawable.ic_car,
                R.drawable.ic_truck,
                R.drawable.ic_airplane,
                R.drawable.ic_android,
                R.drawable.ic_bike,
                R.drawable.ic_car,
                R.drawable.ic_truck,
                R.drawable.ic_airplane,
                R.drawable.ic_android,
                R.drawable.ic_bike,
                R.drawable.ic_car,
                R.drawable.ic_truck
        };

        MyArrayAdapter myArrayAdapter = new MyArrayAdapter(
                this,
                titles,
                descriptions,
                images
        );

        listView.setAdapter(myArrayAdapter);

    }
}