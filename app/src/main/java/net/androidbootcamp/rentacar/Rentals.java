package net.androidbootcamp.rentacar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Rentals extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] rentalCompanies={"ACE Rent A Car","Alamo Rent A Car", "Budget Car Rental",
        "Enterprise Rent-A-Car", "Hertz Car Rental", "National Car Rental"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_rentals, R.id.rentals, rentalCompanies));

    }
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.acerentacar.com")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alamo.com")));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.budget.com")));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.enterprise.com")));
                break;
            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hertz.com")));
                break;
            case 5:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nationalcar.com")));
                break;
        }
    }
}
