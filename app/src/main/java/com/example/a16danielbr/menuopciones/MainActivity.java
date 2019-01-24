package com.example.a16danielbr.menuopciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflador = getMenuInflater();
        inflador.inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch(id){
            case R.id.item1:
                Toast.makeText(this, "Opción: " + item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2:
                Toast.makeText(this, "Opción: " + item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3:
                Toast.makeText(this, "Opción: " + item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4:
                Toast.makeText(this, "Opción: " + item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item32:
                Toast.makeText(this, "Opción: " + item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item33:
                Toast.makeText(this, "Opción: " + item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }

    }
}
