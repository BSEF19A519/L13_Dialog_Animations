package com.example.l13_dialog_animations;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ToastClick(View view) {
        LayoutInflater layoutinflator=getLayoutInflater();
        View mylayout=layoutinflator.inflate(R.layout.customized_toast,null);
        ImageView imageview=mylayout.findViewById(R.id.imageView);
        TextView message=mylayout.findViewById(R.id.txtcam);
        message.setText("The custom toast");
        Toast toast=new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(mylayout);
        toast.setGravity(Gravity.CENTER|Gravity.RIGHT,100,200);
        toast.show();

    }

    public void ALertClick(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("The message you want to set");
        builder.setTitle("Alert!");
        builder.setCancelable(false);
        builder.setPositiveButton(
                "Positive Button",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                }
        );
        builder.setNegativeButton(
                "Negative Button",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                }
        );
        AlertDialog alert=builder.create();
        alert.show();
    }
}