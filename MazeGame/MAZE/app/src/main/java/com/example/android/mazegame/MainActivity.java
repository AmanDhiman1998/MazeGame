package com.example.android.mazegame;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
int n = 15;
int hammers = 0;
ArrayList<String> AL = new ArrayList<>();
public int[][] maze = new int[15][15];
boolean[][] visited = new boolean [n][n];
boolean gamestarted = false;
int row = 0;
int col = 0;
int levelcount=5;
int level=1;
int color=66750591;
int clr = 66750591;
int color2 = 16711935;
    int r0_0 = Integer.valueOf(R.id.R0_0);int r0_1 = Integer.valueOf(R.id.R0_1);int r0_2 = Integer.valueOf(R.id.R0_2);int r0_3 = Integer.valueOf(R.id.R0_3);int r0_4 = Integer.valueOf(R.id.R0_4);int r0_5 = Integer.valueOf(R.id.R0_5);int r0_6 = Integer.valueOf(R.id.R0_6);int r0_7 = Integer.valueOf(R.id.R0_7);int r0_8 = Integer.valueOf(R.id.R0_8);int r0_9 = Integer.valueOf(R.id.R0_9);int r0_10 = Integer.valueOf(R.id.R0_10);int r0_11 = Integer.valueOf(R.id.R0_11);int r0_12 = Integer.valueOf(R.id.R0_12);int r0_13 = Integer.valueOf(R.id.R0_13);int r0_14 = Integer.valueOf(R.id.R0_14);
    int r1_0 = Integer.valueOf(R.id.R1_0);int r1_1 = Integer.valueOf(R.id.R1_1);int r1_2 = Integer.valueOf(R.id.R1_2);int r1_3 = Integer.valueOf(R.id.R1_3);int r1_4 = Integer.valueOf(R.id.R1_4);int r1_5 = Integer.valueOf(R.id.R1_5);int r1_6 = Integer.valueOf(R.id.R1_6);int r1_7 = Integer.valueOf(R.id.R1_7);int r1_8 = Integer.valueOf(R.id.R1_8);int r1_9 = Integer.valueOf(R.id.R1_9);int r1_10 = Integer.valueOf(R.id.R1_10);int r1_11 = Integer.valueOf(R.id.R1_11);int r1_12 = Integer.valueOf(R.id.R1_12);int r1_13 = Integer.valueOf(R.id.R1_13);int r1_14 = Integer.valueOf(R.id.R1_14);
    int r2_0 = Integer.valueOf(R.id.R2_0);int r2_1 = Integer.valueOf(R.id.R2_1);int r2_2 = Integer.valueOf(R.id.R2_2);int r2_3 = Integer.valueOf(R.id.R2_3);int r2_4 = Integer.valueOf(R.id.R2_4);int r2_5 = Integer.valueOf(R.id.R2_5);int r2_6 = Integer.valueOf(R.id.R2_6);int r2_7 = Integer.valueOf(R.id.R2_7);int r2_8 = Integer.valueOf(R.id.R2_8);int r2_9 = Integer.valueOf(R.id.R2_9);int r2_10 = Integer.valueOf(R.id.R2_10);int r2_11 = Integer.valueOf(R.id.R2_11);int r2_12 = Integer.valueOf(R.id.R2_12);int r2_13 = Integer.valueOf(R.id.R2_13);int r2_14 = Integer.valueOf(R.id.R2_14);
    int r3_0 = Integer.valueOf(R.id.R3_0);int r3_1 = Integer.valueOf(R.id.R3_1);int r3_2 = Integer.valueOf(R.id.R3_2);int r3_3 = Integer.valueOf(R.id.R3_3);int r3_4 = Integer.valueOf(R.id.R3_4);int r3_5 = Integer.valueOf(R.id.R3_5);int r3_6 = Integer.valueOf(R.id.R3_6);int r3_7 = Integer.valueOf(R.id.R3_7);int r3_8 = Integer.valueOf(R.id.R3_8);int r3_9 = Integer.valueOf(R.id.R3_9);int r3_10 = Integer.valueOf(R.id.R3_10);int r3_11 = Integer.valueOf(R.id.R3_11);int r3_12 = Integer.valueOf(R.id.R3_12);int r3_13 = Integer.valueOf(R.id.R3_13);int r3_14 = Integer.valueOf(R.id.R3_14);
    int r4_0 = Integer.valueOf(R.id.R4_0);int r4_1 = Integer.valueOf(R.id.R4_1);int r4_2 = Integer.valueOf(R.id.R4_2);int r4_3 = Integer.valueOf(R.id.R4_3);int r4_4 = Integer.valueOf(R.id.R4_4);int r4_5 = Integer.valueOf(R.id.R4_5);int r4_6 = Integer.valueOf(R.id.R4_6);int r4_7 = Integer.valueOf(R.id.R4_7);int r4_8 = Integer.valueOf(R.id.R4_8);int r4_9 = Integer.valueOf(R.id.R4_9);int r4_10 = Integer.valueOf(R.id.R4_10);int r4_11 = Integer.valueOf(R.id.R4_11);int r4_12 = Integer.valueOf(R.id.R4_12);int r4_13 = Integer.valueOf(R.id.R4_13);int r4_14 = Integer.valueOf(R.id.R4_14);
    int r5_0 = Integer.valueOf(R.id.R5_0);int r5_1 = Integer.valueOf(R.id.R5_1);int r5_2 = Integer.valueOf(R.id.R5_2);int r5_3 = Integer.valueOf(R.id.R5_3);int r5_4 = Integer.valueOf(R.id.R5_4);int r5_5 = Integer.valueOf(R.id.R5_5);int r5_6 = Integer.valueOf(R.id.R5_6);int r5_7 = Integer.valueOf(R.id.R5_7);int r5_8 = Integer.valueOf(R.id.R5_8);int r5_9 = Integer.valueOf(R.id.R5_9);int r5_10 = Integer.valueOf(R.id.R5_10);int r5_11 = Integer.valueOf(R.id.R5_11);int r5_12 = Integer.valueOf(R.id.R5_12);int r5_13 = Integer.valueOf(R.id.R5_13);int r5_14 = Integer.valueOf(R.id.R5_14);
    int r6_0 = Integer.valueOf(R.id.R6_0);int r6_1 = Integer.valueOf(R.id.R6_1);int r6_2 = Integer.valueOf(R.id.R6_2);int r6_3 = Integer.valueOf(R.id.R6_3);int r6_4 = Integer.valueOf(R.id.R6_4);int r6_5 = Integer.valueOf(R.id.R6_5);int r6_6 = Integer.valueOf(R.id.R6_6);int r6_7 = Integer.valueOf(R.id.R6_7);int r6_8 = Integer.valueOf(R.id.R6_8);int r6_9 = Integer.valueOf(R.id.R6_9);int r6_10 = Integer.valueOf(R.id.R6_10);int r6_11 = Integer.valueOf(R.id.R6_11);int r6_12 = Integer.valueOf(R.id.R6_12);int r6_13 = Integer.valueOf(R.id.R6_13);int r6_14 = Integer.valueOf(R.id.R6_14);
    int r7_0 = Integer.valueOf(R.id.R7_0);int r7_1 = Integer.valueOf(R.id.R7_1);int r7_2 = Integer.valueOf(R.id.R7_2);int r7_3 = Integer.valueOf(R.id.R7_3);int r7_4 = Integer.valueOf(R.id.R7_4);int r7_5 = Integer.valueOf(R.id.R7_5);int r7_6 = Integer.valueOf(R.id.R7_6);int r7_7 = Integer.valueOf(R.id.R7_7);int r7_8 = Integer.valueOf(R.id.R7_8);int r7_9 = Integer.valueOf(R.id.R7_9);int r7_10 = Integer.valueOf(R.id.R7_10);int r7_11 = Integer.valueOf(R.id.R7_11);int r7_12 = Integer.valueOf(R.id.R7_12);int r7_13 = Integer.valueOf(R.id.R7_13);int r7_14 = Integer.valueOf(R.id.R7_14);
    int r8_0 = Integer.valueOf(R.id.R8_0);int r8_1 = Integer.valueOf(R.id.R8_1);int r8_2 = Integer.valueOf(R.id.R8_2);int r8_3 = Integer.valueOf(R.id.R8_3);int r8_4 = Integer.valueOf(R.id.R8_4);int r8_5 = Integer.valueOf(R.id.R8_5);int r8_6 = Integer.valueOf(R.id.R8_6);int r8_7 = Integer.valueOf(R.id.R8_7);int r8_8 = Integer.valueOf(R.id.R8_8);int r8_9 = Integer.valueOf(R.id.R8_9);int r8_10 = Integer.valueOf(R.id.R8_10);int r8_11 = Integer.valueOf(R.id.R8_11);int r8_12 = Integer.valueOf(R.id.R8_12);int r8_13 = Integer.valueOf(R.id.R8_13);int r8_14 = Integer.valueOf(R.id.R8_14);
    int r9_0 = Integer.valueOf(R.id.R9_0);int r9_1 = Integer.valueOf(R.id.R9_1);int r9_2 = Integer.valueOf(R.id.R9_2);int r9_3 = Integer.valueOf(R.id.R9_3);int r9_4 = Integer.valueOf(R.id.R9_4);int r9_5 = Integer.valueOf(R.id.R9_5);int r9_6 = Integer.valueOf(R.id.R9_6);int r9_7 = Integer.valueOf(R.id.R9_7);int r9_8 = Integer.valueOf(R.id.R9_8);int r9_9 = Integer.valueOf(R.id.R9_9);int r9_10 = Integer.valueOf(R.id.R9_10);int r9_11 = Integer.valueOf(R.id.R9_11);int r9_12 = Integer.valueOf(R.id.R9_12);int r9_13 = Integer.valueOf(R.id.R9_13);int r9_14 = Integer.valueOf(R.id.R9_14);
    int r10_0 = Integer.valueOf(R.id.R10_0);int r10_1 = Integer.valueOf(R.id.R10_1);int r10_2 = Integer.valueOf(R.id.R10_2);int r10_3 = Integer.valueOf(R.id.R10_3);int r10_4 = Integer.valueOf(R.id.R10_4);int r10_5 = Integer.valueOf(R.id.R10_5);int r10_6 = Integer.valueOf(R.id.R10_6);int r10_7 = Integer.valueOf(R.id.R10_7);int r10_8 = Integer.valueOf(R.id.R10_8);int r10_9 = Integer.valueOf(R.id.R10_9);int r10_10 = Integer.valueOf(R.id.R10_10);int r10_11 = Integer.valueOf(R.id.R10_11);int r10_12 = Integer.valueOf(R.id.R10_12);int r10_13 = Integer.valueOf(R.id.R10_13);int r10_14 = Integer.valueOf(R.id.R10_14);
    int r11_0 = Integer.valueOf(R.id.R11_0);int r11_1 = Integer.valueOf(R.id.R11_1);int r11_2 = Integer.valueOf(R.id.R11_2);int r11_3 = Integer.valueOf(R.id.R11_3);int r11_4 = Integer.valueOf(R.id.R11_4);int r11_5 = Integer.valueOf(R.id.R11_5);int r11_6 = Integer.valueOf(R.id.R11_6);int r11_7 = Integer.valueOf(R.id.R11_7);int r11_8 = Integer.valueOf(R.id.R11_8);int r11_9 = Integer.valueOf(R.id.R11_9);int r11_10 = Integer.valueOf(R.id.R11_10);int r11_11 = Integer.valueOf(R.id.R11_11);int r11_12 = Integer.valueOf(R.id.R11_12);int r11_13 = Integer.valueOf(R.id.R11_13);int r11_14 = Integer.valueOf(R.id.R11_14);
    int r12_0 = Integer.valueOf(R.id.R12_0);int r12_1 = Integer.valueOf(R.id.R12_1);int r12_2 = Integer.valueOf(R.id.R12_2);int r12_3 = Integer.valueOf(R.id.R12_3);int r12_4 = Integer.valueOf(R.id.R12_4);int r12_5 = Integer.valueOf(R.id.R12_5);int r12_6 = Integer.valueOf(R.id.R12_6);int r12_7 = Integer.valueOf(R.id.R12_7);int r12_8 = Integer.valueOf(R.id.R12_8);int r12_9 = Integer.valueOf(R.id.R12_9);int r12_10 = Integer.valueOf(R.id.R12_10);int r12_11 = Integer.valueOf(R.id.R12_11);int r12_12 = Integer.valueOf(R.id.R12_12);int r12_13 = Integer.valueOf(R.id.R12_13);int r12_14 = Integer.valueOf(R.id.R12_14);
    int r13_0 = Integer.valueOf(R.id.R13_0);int r13_1 = Integer.valueOf(R.id.R13_1);int r13_2 = Integer.valueOf(R.id.R13_2);int r13_3 = Integer.valueOf(R.id.R13_3);int r13_4 = Integer.valueOf(R.id.R13_4);int r13_5 = Integer.valueOf(R.id.R13_5);int r13_6 = Integer.valueOf(R.id.R13_6);int r13_7 = Integer.valueOf(R.id.R13_7);int r13_8 = Integer.valueOf(R.id.R13_8);int r13_9 = Integer.valueOf(R.id.R13_9);int r13_10 = Integer.valueOf(R.id.R13_10);int r13_11 = Integer.valueOf(R.id.R13_11);int r13_12 = Integer.valueOf(R.id.R13_12);int r13_13 = Integer.valueOf(R.id.R13_13);int r13_14 = Integer.valueOf(R.id.R13_14);
    int r14_0 = Integer.valueOf(R.id.R14_0);int r14_1 = Integer.valueOf(R.id.R14_1);int r14_2 = Integer.valueOf(R.id.R14_2);int r14_3 = Integer.valueOf(R.id.R14_3);int r14_4 = Integer.valueOf(R.id.R14_4);int r14_5 = Integer.valueOf(R.id.R14_5);int r14_6 = Integer.valueOf(R.id.R14_6);int r14_7 = Integer.valueOf(R.id.R14_7);int r14_8 = Integer.valueOf(R.id.R14_8);int r14_9 = Integer.valueOf(R.id.R14_9);int r14_10 = Integer.valueOf(R.id.R14_10);int r14_11 = Integer.valueOf(R.id.R14_11);int r14_12 = Integer.valueOf(R.id.R14_12);int r14_13 = Integer.valueOf(R.id.R14_13);int r14_14 = Integer.valueOf(R.id.R14_14);
    HashMap<String,Integer> map = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        map.put("0_0",r0_0);map.put("0_1",r0_1);map.put("0_2",r0_2);map.put("0_3",r0_3);map.put("0_4",r0_4);map.put("0_5",r0_5);map.put("0_6",r0_6);map.put("0_7",r0_7);map.put("0_8",r0_8);map.put("0_9",r0_9);map.put("0_10",r0_10);map.put("0_11",r0_11);map.put("0_12",r0_12);map.put("0_13",r0_13);map.put("0_14",r0_14);
        map.put("1_0",r1_0);map.put("1_1",r1_1);map.put("1_2",r1_2);map.put("1_3",r1_3);map.put("1_4",r1_4);map.put("1_5",r1_5);map.put("1_6",r1_6);map.put("1_7",r1_7);map.put("1_8",r1_8);map.put("1_9",r1_9);map.put("1_10",r1_10);map.put("1_11",r1_11);map.put("1_12",r1_12);map.put("1_13",r1_13);map.put("1_14",r1_14);
        map.put("2_0",r2_0);map.put("2_1",r2_1);map.put("2_2",r2_2);map.put("2_3",r2_3);map.put("2_4",r2_4);map.put("2_5",r2_5);map.put("2_6",r2_6);map.put("2_7",r2_7);map.put("2_8",r2_8);map.put("2_9",r2_9);map.put("2_10",r2_10);map.put("2_11",r2_11);map.put("2_12",r2_12);map.put("2_13",r2_13);map.put("2_14",r2_14);
        map.put("3_0",r3_0);map.put("3_1",r3_1);map.put("3_2",r3_2);map.put("3_3",r3_3);map.put("3_4",r3_4);map.put("3_5",r3_5);map.put("3_6",r3_6);map.put("3_7",r3_7);map.put("3_8",r3_8);map.put("3_9",r3_9);map.put("3_10",r3_10);map.put("3_11",r3_11);map.put("3_12",r3_12);map.put("3_13",r3_13);map.put("3_14",r3_14);
        map.put("4_0",r4_0);map.put("4_1",r4_1);map.put("4_2",r4_2);map.put("4_3",r4_3);map.put("4_4",r4_4);map.put("4_5",r4_5);map.put("4_6",r4_6);map.put("4_7",r4_7);map.put("4_8",r4_8);map.put("4_9",r4_9);map.put("4_10",r4_10);map.put("4_11",r4_11);map.put("4_12",r4_12);map.put("4_13",r4_13);map.put("4_14",r4_14);
        map.put("5_0",r5_0);map.put("5_1",r5_1);map.put("5_2",r5_2);map.put("5_3",r5_3);map.put("5_4",r5_4);map.put("5_5",r5_5);map.put("5_6",r5_6);map.put("5_7",r5_7);map.put("5_8",r5_8);map.put("5_9",r5_9);map.put("5_10",r5_10);map.put("5_11",r5_11);map.put("5_12",r5_12);map.put("5_13",r5_13);map.put("5_14",r5_14);
        map.put("6_0",r6_0);map.put("6_1",r6_1);map.put("6_2",r6_2);map.put("6_3",r6_3);map.put("6_4",r6_4);map.put("6_5",r6_5);map.put("6_6",r6_6);map.put("6_7",r6_7);map.put("6_8",r6_8);map.put("6_9",r6_9);map.put("6_10",r6_10);map.put("6_11",r6_11);map.put("6_12",r6_12);map.put("6_13",r6_13);map.put("6_14",r6_14);
        map.put("7_0",r7_0);map.put("7_1",r7_1);map.put("7_2",r7_2);map.put("7_3",r7_3);map.put("7_4",r7_4);map.put("7_5",r7_5);map.put("7_6",r7_6);map.put("7_7",r7_7);map.put("7_8",r7_8);map.put("7_9",r7_9);map.put("7_10",r7_10);map.put("7_11",r7_11);map.put("7_12",r7_12);map.put("7_13",r7_13);map.put("7_14",r7_14);
        map.put("8_0",r8_0);map.put("8_1",r8_1);map.put("8_2",r8_2);map.put("8_3",r8_3);map.put("8_4",r8_4);map.put("8_5",r8_5);map.put("8_6",r8_6);map.put("8_7",r8_7);map.put("8_8",r8_8);map.put("8_9",r8_9);map.put("8_10",r8_10);map.put("8_11",r8_11);map.put("8_12",r8_12);map.put("8_13",r8_13);map.put("8_14",r8_14);
        map.put("9_0",r9_0);map.put("9_1",r9_1);map.put("9_2",r9_2);map.put("9_3",r9_3);map.put("9_4",r9_4);map.put("9_5",r9_5);map.put("9_6",r9_6);map.put("9_7",r9_7);map.put("9_8",r9_8);map.put("9_9",r9_9);map.put("9_10",r9_10);map.put("9_11",r9_11);map.put("9_12",r9_12);map.put("9_13",r9_13);map.put("9_14",r9_14);
        map.put("10_0",r10_0);map.put("10_1",r10_1);map.put("10_2",r10_2);map.put("10_3",r10_3);map.put("10_4",r10_4);map.put("10_5",r10_5);map.put("10_6",r10_6);map.put("10_7",r10_7);map.put("10_8",r10_8);map.put("10_9",r10_9);map.put("10_10",r10_10);map.put("10_11",r10_11);map.put("10_12",r10_12);map.put("10_13",r10_13);map.put("10_14",r10_14);
        map.put("11_0",r11_0);map.put("11_1",r11_1);map.put("11_2",r11_2);map.put("11_3",r11_3);map.put("11_4",r11_4);map.put("11_5",r11_5);map.put("11_6",r11_6);map.put("11_7",r11_7);map.put("11_8",r11_8);map.put("11_9",r11_9);map.put("11_10",r11_10);map.put("11_11",r11_11);map.put("11_12",r11_12);map.put("11_13",r11_13);map.put("11_14",r11_14);
        map.put("12_0",r12_0);map.put("12_1",r12_1);map.put("12_2",r12_2);map.put("12_3",r12_3);map.put("12_4",r12_4);map.put("12_5",r12_5);map.put("12_6",r12_6);map.put("12_7",r12_7);map.put("12_8",r12_8);map.put("12_9",r12_9);map.put("12_10",r12_10);map.put("12_11",r12_11);map.put("12_12",r12_12);map.put("12_13",r12_13);map.put("12_14",r12_14);
        map.put("13_0",r13_0);map.put("13_1",r13_1);map.put("13_2",r13_2);map.put("13_3",r13_3);map.put("13_4",r13_4);map.put("13_5",r13_5);map.put("13_6",r13_6);map.put("13_7",r13_7);map.put("13_8",r13_8);map.put("13_9",r13_9);map.put("13_10",r13_10);map.put("13_11",r13_11);map.put("13_12",r13_12);map.put("13_13",r13_13);map.put("13_14",r13_14);
        map.put("14_0",r14_0);map.put("14_1",r14_1);map.put("14_2",r14_2);map.put("14_3",r14_3);map.put("14_4",r14_4);map.put("14_5",r14_5);map.put("14_6",r14_6);map.put("14_7",r14_7);map.put("14_8",r14_8);map.put("14_9",r14_9);map.put("14_10",r14_10);map.put("14_11",r14_11);map.put("14_12",r14_12);map.put("14_13",r14_13);map.put("14_14",r14_14);
    }



    public void right(View view){
        if(gamestarted==false)
            return;
        if(checklimit(row,col+1)&&!visited[row][col+1]){
         changecolor(row,col,color);
            col++;
            visited[row][col]=true;
            changecolor(row,col);

        }

    }public void left(View view){
        if(gamestarted==false)
            return;
        if(checklimit(row,col-1)&&!visited[row][col-1]){
   changecolor(row,col,color);
            col--;
            visited[row][col]=true;
            changecolor(row,col);
        }
    }public void up(View view){
        if(gamestarted==false)
            return;
        if(checklimit(row-1,col)&&!visited[row-1][col]){
     changecolor(row,col,color);
            row--;
            visited[row][col]=true;
            changecolor(row,col);
        }
    }public void down(View view){
        if(gamestarted==false)
            return;
        if(checklimit(row+1,col)&&!visited[row+1][col]){
       changecolor(row,col,color);
            row++;
            visited[row][col]=true;
            changecolor(row,col);
        }
    }

    public boolean checklimit(int r,int c){

        if(r<maze.length&&r>=0&&c<maze.length&&c>=0) {
            if(maze[r][c]==1){
            if(hammers==0)
                return false;
            else{
                maze[r][c]=0;
                hammers--;
                hammerupdate();
                return true;
            }
            }
            else if(maze[r][c]==2) {
                maze[r][c]=0;
                hammers++;
                hammerupdate();
                return true;
            }
            else
            return true;
        }
        return false;
    }



    public void changecolor(int r ,int c){
        if(row==maze.length-1&&col==maze.length-1)
        {reachedred();
            return;
        }
        String val = computeval(r,c);
       setmouse(val);

    }


    public void removebarriersandhammers(){
        for(int i=0;i<maze.length;i++)
            for(int j=0;j<maze.length;j++) {
                maze[i][j]=0;
                String val = computeval(i,j);
                setwhite(val);
            }
    }

    public void createbarriersandhammers(){
int count = levelcount+2;
AL = new ArrayList<>(map.keySet());
        Random rand = new Random();
        while(count>0){
            int pair = rand.nextInt(AL.size());
            String p = AL.get(pair);
            String[] split = p.split("_");
            int r = Integer.parseInt(split[0]);
            int c = Integer.parseInt(split[1]);
          if(!checklimit(r,c)||(r==0&&c==0)||(r==maze.length-1&&c==maze.length-1))
              continue;
          AL.remove(pair);
            String val = computeval(r,c);
            if(count>2) {
                maze[r][c] = 1;
                settrap(val);
            }
            else{
                maze[r][c] = 2;
                sethammers(val);
            }
            count--;
        }




    }
    public void reachedred(){
        levelcount+=2;
       updatelevel();
        row = 0;
        col = 0;
        visited = new boolean[n][n];
        removebarriersandhammers();
        createbarriersandhammers();
        setmouseatbegin();
        setcheezeatend();


    }

    public void restart(View view){
        if(gamestarted==false)
            return;
        hammerupdate();
        row=0; col=0;
        visited = new boolean[n][n];
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze.length;j++){
                String val = computeval(i,j);
                if(maze[i][j]==0){
                   setwhite(val);  }
                else if(maze[i][j]==1){
                  settrap(val); }
                else if(maze[i][j]==2){
                   sethammers(val); }

               setmouseatbegin();
               setcheezeatend();
            }

        } }
    public void reset(View view) {
        gamestarted = true;
        row = 0;
        col = 0;
        visited = new boolean[n][n];
        removebarriersandhammers();
        Button b6 =(Button)findViewById(R.id.startbutton);
        b6.setText(" Restart ");
        b6.setBackgroundColor(Color.RED);
        level = 1;
        levelcount=5;
        hammers=0;
        hammerupdate();
        TextView T = (TextView)findViewById(R.id.Level);
        T.setText("Level 1");
        createbarriersandhammers();
        setmouseatbegin();
        setcheezeatend();


    }

public void hammerupdate(){
        TextView T = (TextView)findViewById(R.id.hammer);
        T.setText(hammers+"");
    }
public void setmouseatbegin(){
    Button ba = (Button) findViewById(r0_0);
    ba.setBackgroundResource(R.drawable.mouse);
}
public void setcheezeatend() {
    String val1 = computeval(maze.length - 1,maze.length - 1);
  setcheeze(val1);
}
private void updatelevel(){
    level++;
    TextView  T = (TextView)findViewById(R.id.Level);
    T.setText("Level " + level);
}
private String computeval(int i,int j){
        String val = "";
    val+=i+"_";
    val+=j;
    return val;
}

private void sethammers(String val){
    Button b = (Button) findViewById(map.get(val));
    b.setBackgroundResource(R.drawable.hammer);
}
private void settrap(String val){
    Button b = (Button) findViewById(map.get(val));
    b.setBackgroundResource(R.drawable.trap);
}
private void setwhite(String val){
    Button b = (Button) findViewById(map.get(val));
    b.setBackgroundColor(Color.WHITE);
}
private void setblue(String val){
    Button b = (Button)findViewById(map.get(val));
    b.setBackgroundColor(Color.parseColor("#00ffff"));
}
    private void setcheeze(String val){
        Button b = (Button) findViewById(map.get(val));
        b.setBackgroundResource(R.drawable.cheeze);
    }
    public void setmouse(String val){
        Button ba = (Button) findViewById(map.get(val));
        ba.setBackgroundResource(R.drawable.mouse);
    }
    public void changecolor(int r,int c,int clr){
        String val = computeval(r,c);
        setblue(val);
    }



}