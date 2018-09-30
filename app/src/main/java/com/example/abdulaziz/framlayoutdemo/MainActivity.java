package com.example.abdulaziz.framlayoutdemo;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgHornbill, imgHummingBird, imgKingfisher, imgSwift;
    private TextView txtBirdName, txtBirdDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgHornbill = findViewById(R.id.img_hornbill);
        imgHummingBird = findViewById(R.id.img_hummingbird);
        imgKingfisher = findViewById(R.id.img_kingfisher);
        imgSwift = findViewById(R.id.img_swift);

        txtBirdDetails = findViewById(R.id.txt_birds_details);
        txtBirdName = findViewById(R.id.txt_birds_name);

        imgHornbill.setOnClickListener(this);
        imgHummingBird.setOnClickListener(this);
        imgSwift.setOnClickListener(this);
        imgKingfisher.setOnClickListener(this);

        txtBirdName.setText("Hornbill");
        txtBirdDetails.setText("Hornbill is a beautiful Bird.");
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.img_hornbill){
            imgHornbill.setVisibility(view.GONE);
            imgHummingBird.setVisibility(view.VISIBLE);

            txtBirdName.setText("Humming Bird");
            txtBirdDetails.setText("Humming Bird is a beautiful Bird. Its very little bird. It's ley the egg in the sky.");
        }
        if (view.getId()==R.id.img_hummingbird){
            imgHummingBird.setVisibility(view.GONE);
            imgKingfisher.setVisibility(view.VISIBLE);

            txtBirdName.setText("Kingfisher");
            txtBirdDetails.setText("Kingfisher is a beautiful Bird. It has long patience. It's lips are very long. It always hunt the fish");
        }
        if (view.getId()==R.id.img_kingfisher){
            imgKingfisher.setVisibility(view.GONE);
            imgSwift.setVisibility(view.VISIBLE);

            txtBirdName.setText("Swift");
            txtBirdDetails.setText("Swift is a beautiful Bird. Its also very little bird. It's can fly very speedy.");
        }
        if (view.getId()==R.id.img_swift){
            imgSwift.setVisibility(view.GONE);
            imgHornbill.setVisibility(view.VISIBLE);

            txtBirdName.setText("Hornbill");
            txtBirdDetails.setText("Hornbill is a beautiful Bird.");
        }
    }
}
