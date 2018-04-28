package com.example.diogenes.integrandoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lerCodigo(View view) {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        startActivityForResult(intent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView t = (TextView) findViewById(R.id.tv_barcode);
        t.setText(data.getStringExtra("SCAN_RESULT"));
    }
}
