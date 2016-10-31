package com.example.user3.bodymassindex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup groupWeight;
    private EditText etHeight;
    private double bodyMassIndex;
    private  double height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groupWeight = (RadioGroup)findViewById(R.id.rgWeight);
        this.etHeight = (EditText)findViewById(R.id.etHeight);

    }

    public void selectWeight(View view)
    {
        int id = view.getId();

        if(etHeight.equals(" "))
        {
            Toast.makeText(this, "Error!!!!! Please enter hweight", Toast.LENGTH_LONG).show();
        }
        else
        {

            height = Double.parseDouble(etHeight.getText().toString());

            if(id == R.id.rbSmall)
            {
                bodyMassIndex = Math.round(40 / (height * height));
            }
            else if(id == R.id.rbMedium)
            {
                bodyMassIndex = Math.round(55 / (height * height));
            }
            else  if(id == R.id.rbLarge)
            {
                bodyMassIndex = Math.round(80 / (height * height));
            }


            Toast.makeText(this, "The BMI is: " + bodyMassIndex, Toast.LENGTH_LONG).show();

        }



}


}
