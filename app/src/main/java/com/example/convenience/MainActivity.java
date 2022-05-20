package com.example.convenience;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSaleClicked(View v)
    {
        Toast.makeText(this, "세일 정보 화면",Toast.LENGTH_LONG).show();

        Intent ACT_Sale = new Intent(this,SaleActivity.class);
        startActivity(ACT_Sale);
    }
}