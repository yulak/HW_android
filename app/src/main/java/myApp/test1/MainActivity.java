package myApp.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      final TextView cityTextView = findViewById(R.id.nameCity);
      Button buttonCity = findViewById(R.id.buttonCity);

      buttonCity.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              cityTextView.setText(R.string.textCity);
          }
      });

      startActivity(new Intent(this, MainCity.class));
      startActivity(new Intent(this, SettingsActivity.class));
    }
}