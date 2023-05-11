package sg.edu.rp.c346.id22043453.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.buttonReset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int hour = tp.getHour();
                int minute = tp.getMinute();

                tvDisplay.setText("Time is " + String.format(Locale.getDefault(), "%02d:%02d", hour, minute));

            }
        });


        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int year = dp.getYear();
                int month = dp.getMonth()+1;
                int dayOfMonth = dp.getDayOfMonth();

                tvDisplay.setText("Date is " + dayOfMonth + "/" + month +"/" + year);
            }
        });



        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // To reset all the elements
                tp.setHour(0);
                tp.setMinute(0);
                dp.updateDate(2023, 0, 1);
            }
        });



    }
}