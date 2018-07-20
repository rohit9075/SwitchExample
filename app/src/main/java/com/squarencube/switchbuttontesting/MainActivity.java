package com.squarencube.switchbuttontesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch = findViewById(R.id.on_off_switch);
        aSwitch.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (buttonView.getId() == R.id.on_off_switch){

            if (isChecked){
                boolean id = isChecked;
                String id1 = String.valueOf(id);
                Toast.makeText(this, id1, Toast.LENGTH_SHORT).show();
            }
            else
                Toast.makeText(this, "another id", Toast.LENGTH_SHORT).show();
            }

    }
}
