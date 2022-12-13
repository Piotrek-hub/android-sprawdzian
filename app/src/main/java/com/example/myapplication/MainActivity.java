package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView topSectionImage;
    Image imagesWithOrder[] = new Image[]{new Image(R.drawable.obraz1),
            new Image(R.drawable.obraz2),
            new Image(R.drawable.obraz3),
            new Image(R.drawable.obraz4),
            new Image(R.drawable.obraz5),
            new Image(R.drawable.arrow)};
    int currentResource = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.topSectionImage = (ImageView) findViewById(R.id.topImage);
        topSectionImage.setImageResource(imagesWithOrder[currentResource].getResourceID());
    }

    private void changeResource(int value) {
        if(this.currentResource + value > 5) {
            this.currentResource = 0;
        }else if(this.currentResource +value < 0) {
            this.currentResource = 5;
        }else {
            this.currentResource += value;
        }
    }

    public void onClickPrev(View v)
    {
        this.changeResource(-1);
        this.topSectionImage.setImageResource(imagesWithOrder[currentResource].getResourceID());

    }

    public void onClickNext(View v)
    {
        this.changeResource(1);
        this.topSectionImage.setImageResource(imagesWithOrder[currentResource].getResourceID());
    }
}