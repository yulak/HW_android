package myApp.test1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {

    private static final String TEXT_CITY = "TEXT_CITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        /*setContentView(R.layout.activity_main);
        String instanceState;
        if (savedInstanceState == null){
            instanceState = "Первый зпуск";
        } else {
            instanceState = "Повторный запуск";
        }
        Toast.makeText(getApplicationContext(), instanceState + " - onCreate()", Toast.LENGTH_SHORT).show();
        Log.d("MainActivity1", instanceState + " - onCreate()");

      final TextView cityTextView = findViewById(R.id.nameCity);
      Button buttonCity = findViewById(R.id.buttonCity);
      buttonCity.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              *//*cityTextView.setText(R.string.textCity);*//*
              try {
                  Intent intent = new Intent(MainActivity.this, MainCity.class);
                  startActivity(intent);finish();
              }catch (Exception e){

              }
          }
      });


            final Button site = findViewById(R.id.buttonWeb);
            Button go = findViewById(R.id.buttonWeb);
            go.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String url = site.getText().toString();
                    Uri uri = Uri.parse("https://yandex.ru/pogoda/moscow");
                    Intent browser = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(browser);
                }
            });*/




      /*startActivity(new Intent(this, MainCity.class));
      startActivity(new Intent(this, SettingsActivity.class));*/
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();
        Log.d("MainActivity1", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
        Log.d("MainActivity1", "onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause()", Toast.LENGTH_SHORT).show();
        Log.d("MainActivity1", "onPause()");
    }
    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState){
        super.onSaveInstanceState(saveInstanceState);
        Toast.makeText(getApplicationContext(), "onSaveInstanceState()", Toast.LENGTH_SHORT).show();
        Log.d("MainActivity1", "onSaveInstanceState()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop()", Toast.LENGTH_SHORT).show();
        Log.d("MainActivity1", "onStop()");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart()", Toast.LENGTH_SHORT).show();
        Log.d("MainActivity1", "onRestart()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy()", Toast.LENGTH_SHORT).show();
        Log.d("MainActivity1", "onDestroy()");
    }
}