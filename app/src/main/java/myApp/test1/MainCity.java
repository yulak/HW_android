package myApp.test1;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainCity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button buttonMsc;
    Button buttonSPBmain;
    Button buttonSochiMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_city);

      Button buttonBackInMain = (Button)findViewById(R.id.buttonBackInMain);
      buttonBackInMain.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              try {
                  Intent intent = new Intent(MainCity.this, MainActivity.class);
                  startActivity(intent); finish();
              }catch (Exception e){

              }
          }
      });

      Button buttonMoscow = (Button)findViewById(R.id.buttonMoscow);
      buttonMoscow.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              EditText txt = MainCity.this.findViewById(R.id.buttonMoscow);
              Intent intent = new Intent(MainCity.this, MainActivity.class);
              intent.putExtra("Moscow", txt.getText().toString());
              startActivity(intent);
          }
      });
        textView = (TextView)findViewById(R.id.nameCity);
        buttonMsc = (Button) findViewById(R.id.buttonMoscow);
        buttonSPBmain = (Button)findViewById(R.id.buttonSPB);
        buttonSochiMain = (Button)findViewById(R.id.buttonSochi);

        buttonMsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    textView.setText("Moscow");
                }catch (Exception e){

                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        textView.setText("SPD");
    }
}
