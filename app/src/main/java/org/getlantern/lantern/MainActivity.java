package org.getlantern.lantern;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        ImageView round1 = (ImageView)findViewById(R.id.round1);
        ImageView round2 = (ImageView)findViewById(R.id.round2);
        ImageView round3 = (ImageView)findViewById(R.id.round3);
        ImageView round4 = (ImageView)findViewById(R.id.round4);
        ImageView round5 = (ImageView)findViewById(R.id.round5);
        ImageView round6 = (ImageView)findViewById(R.id.round6);
        round1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setColor(R.color.round1);
            }
        });
        round2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setColor(R.color.round2);
            }
        });
        round3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setColor(R.color.round3);
            }
        });
        round4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setColor(R.color.round4);
            }
        });
        round5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setColor(R.color.round5);
            }
        });
        round6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setColor(R.color.round6);
            }
        });
    }
    protected void setColor (int res){
        CardView cardView = (CardView)findViewById(R.id.cardview);
        ConstraintLayout constraintLayout = (ConstraintLayout)findViewById(R.id.constraintlayout);
        TextView title = (TextView)findViewById(R.id.title);
        title.setTextColor(getResources().getColor(R.color.colorAccent));
        cardView.setCardBackgroundColor(getResources().getColor(res));
        constraintLayout.setBackgroundColor(getResources().getColor(res));
    }
}
