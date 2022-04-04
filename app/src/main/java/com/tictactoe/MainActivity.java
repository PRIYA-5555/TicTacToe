package com.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9;
    Button reset;
    int check=0;
    int r1,r2,r3,r4,r5,r6,r7,r8,r9;
    List<Integer> circle = new ArrayList<>();
    List<Integer> close = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circle.clear();
        close.clear();
        r1=r2=r3=r4=r5=r6=r7=r8=r9=0;
        reset = findViewById(R.id.reset);
        i1 = findViewById(R.id.i1);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);
        i5 = findViewById(R.id.i5);
        i6 = findViewById(R.id.i6);
        i7 = findViewById(R.id.i7);
        i8 = findViewById(R.id.i8);
        i9 = findViewById(R.id.i9);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r1==0){
                    if(check % 2 == 0){
                        circle.add(1);
                        circlecheck();
                        i1.setImageResource(R.drawable.circle);
                    }else{
                        close.add(1);
                        closecheck();
                        i1.setImageResource(R.drawable.close);
                    }
                    check++;
                    r1++;
                }
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r2==0){
                    if(check % 2 == 0){
                        circle.add(2);
                        circlecheck();
                        i2.setImageResource(R.drawable.circle);
                    }else{
                        close.add(2);
                        closecheck();
                        i2.setImageResource(R.drawable.close);
                    }
                    check++;
                    r2++;
                }
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r3==0){
                    if(check % 2 == 0){
                        circle.add(3);
                        circlecheck();
                        i3.setImageResource(R.drawable.circle);
                    }else{
                        close.add(3);
                        closecheck();
                        i3.setImageResource(R.drawable.close);
                    }
                    check++;
                    r3++;
                }
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r4==0){
                    if(check % 2 == 0){
                        circle.add(4);
                        circlecheck();
                        i4.setImageResource(R.drawable.circle);
                    }else{
                        close.add(4);
                        closecheck();
                        i4.setImageResource(R.drawable.close);
                    }
                    check++;
                    r4++;
                }
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r5==0){
                    if(check % 2 == 0){
                        circle.add(5);
                        circlecheck();
                        i5.setImageResource(R.drawable.circle);
                    }else{
                        close.add(5);
                        closecheck();
                        i5.setImageResource(R.drawable.close);
                    }
                    check++;
                    r5++;
                }
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r6==0){
                    if(check % 2 == 0){
                        circle.add(6);
                        circlecheck();
                        i6.setImageResource(R.drawable.circle);
                    }else{
                        close.add(6);
                        closecheck();
                        i6.setImageResource(R.drawable.close);
                    }
                    check++;
                    r6++;
                }
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r7==0){
                    if(check % 2 == 0){
                        circle.add(7);
                        circlecheck();
                        i7.setImageResource(R.drawable.circle);
                    }else{
                        close.add(7);
                        closecheck();
                        i7.setImageResource(R.drawable.close);
                    }
                    check++;
                    r7++;
                }
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r8==0){
                    if(check % 2 == 0){
                        circle.add(8);
                        circlecheck();
                        i8.setImageResource(R.drawable.circle);
                    }else{
                        close.add(8);
                        closecheck();
                        i8.setImageResource(R.drawable.close);
                    }
                    check++;
                    r8++;
                }
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r9==0){
                    if(check % 2 == 0){
                        circle.add(9);
                        circlecheck();
                        i9.setImageResource(R.drawable.circle);
                    }else{
                        close.add(9);
                        closecheck();
                        i9.setImageResource(R.drawable.close);
                    }
                    check++;
                    r9++;
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               reset();
            }

        });
    }

    private static final String TAG = "MainActivity";
    private void circlecheck() {
        Toast.makeText(this, ""+circle.size(), Toast.LENGTH_SHORT).show();
        for (int i = 0; i < circle.size(); i++) {
            for (int j = 0; j < circle.size(); j++) {
                for (int k = 0; k < circle.size(); k++) {
//                    Log.e(TAG, "circlecheck: ======= "+i+" ======= "+j+" ===== "+k+" === " );
                    if (circle.get(i) == 1 && circle.get(j) == 2 && circle.get(k) == 3 ) {

                        winCircle();
                    }
                    if (circle.get(i) == 4 && circle.get(j) == 5 && circle.get(k) == 6 ) {
                        winCircle();

                    }
                    if (circle.get(i) == 7 && circle.get(j) == 8 && circle.get(k) == 9 ) {
                        winCircle();

                    }
                    if (circle.get(i) == 1 && circle.get(j) == 4 && circle.get(k) == 7 ) {

                        winCircle();
                    }
                    if (circle.get(i) == 2 && circle.get(j) == 5 && circle.get(k) == 8) {
                        winCircle();

                    }
                    if (circle.get(i) == 3 && circle.get(j) == 6 && circle.get(k) == 9) {

                        winCircle();
                    }
                    if (circle.get(i) == 1 && circle.get(j) == 5 && circle.get(k) == 9 ) {

                        winCircle();
                    }
                    if (circle.get(i) == 3 && circle.get(j) == 5 && circle.get(k) == 7 ) {

                        winCircle();
                    }

                }
            }
        }
    }
    private void closecheck() {
        Toast.makeText(this, ""+close.size(), Toast.LENGTH_SHORT).show();
//        for (int i = 0; i < close.size(); i++) {
//            for (int j = 0; j < close.size(); j++) {
//                for (int k = 0; k < close.size(); k++) {
//
//                    if (close.get(i) == 1 && close.get(j) == 2 && close.get(k) == 3 ) {
//
//                        winClose();
//                    }
//                    if (close.get(i) == 4 && close.get(j) == 5 && close.get(k) == 6 ) {
//                        winClose();
//
//                    }
//                    if (close.get(i) == 7 && close.get(j) == 8 && close.get(k) == 9 ) {
//                        winClose();
//
//                    }
//                    if (close.get(i) == 1 && close.get(j) == 4 && close.get(k) == 7 ) {
//                        winClose();
//
//                    }
//                    if (close.get(i) == 2 && close.get(j) == 5 && close.get(k) == 8) {
//
//                        winClose();
//                    }
//                    if (close.get(i) == 3 && close.get(j) == 6 && close.get(k) == 9) {
//
//                        winClose();
//                    }
//                    if (close.get(i) == 1 && close.get(j) == 5 && close.get(k) == 9 ) {
//
//                        winClose();
//                    }
//                    if (close.get(i) == 3 && close.get(j) == 5 && close.get(k) == 7 ) {
//
//                        winClose();
//                    }
//
//                }
//            }
//        }
    }

    void winCircle(){
        reset();
        Toast.makeText(MainActivity.this, "Win Circle", Toast.LENGTH_SHORT).show();
    }
    void winClose(){
        reset();
        Toast.makeText(MainActivity.this, "Win Close", Toast.LENGTH_SHORT).show();
    }

    void reset(){
        r1=r2=r3=r4=r5=r6=r7=r8=r9=0;

        circle.clear();
        close.clear();
        i1.setImageResource(0);
        i2.setImageResource(0);
        i3.setImageResource(0);
        i4.setImageResource(0);
        i5.setImageResource(0);
        i6.setImageResource(0);
        i7.setImageResource(0);
        i8.setImageResource(0);
        i9.setImageResource(0);
    }
}