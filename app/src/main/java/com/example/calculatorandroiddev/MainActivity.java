package com.example.calculatorandroiddev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void cleartxtinpScreen(View v){
        TextView screen = (TextView)findViewById(R.id.inputScreen);
        screen.setText("0");
    }
    public void negPos(View v){
        TextView screen = (TextView)findViewById(R.id.inputScreen);
        String textToFormat = screen.getText().toString();
        if (textToFormat.contains("-")){
            textToFormat = textToFormat.replace('-',' ');
            screen.setText(textToFormat);
        }
        else if(!textToFormat.contains("-")){
            textToFormat = '-' + textToFormat;
            screen.setText(textToFormat);
        }

    }
    public void backspace(View v){
        TextView screen = (TextView) findViewById(R.id.inputScreen);
        String textToChange = screen.getText().toString();
        int indexToDelete = textToChange.length() - 1;
        textToChange = textToChange.substring(0,indexToDelete);

        screen.setText(textToChange);
    }
    public void ButtonPress1(View v){
        TextView screen = (TextView) findViewById(R.id.inputScreen);
        String updateText =screen.getText().toString();
        if(updateText.equals("0")){
            screen.setText("1");
        }
        else{
            screen.setText(updateText + '1');
        }
    }
    public void ButtonPress2(View v){
        TextView screen = (TextView) findViewById(R.id.inputScreen);
        String updateText =screen.getText().toString();
        if(updateText.equals("0")){
            screen.setText("2");
        }
        else{
            screen.setText(updateText + '2');
        }
    }
    public void ButtonPress3(View v){
        TextView screen = (TextView) findViewById(R.id.inputScreen);
        String updateText =screen.getText().toString();
        if(updateText.equals("0")){
            screen.setText("3");
        }
        else{
            screen.setText(updateText + '3');
        }
    }
    public void ButtonPress4(View v){
        TextView screen = (TextView) findViewById(R.id.inputScreen);
        String updateText =screen.getText().toString();
        if(updateText.equals("0")){
            screen.setText("4");
        }
        else{
            screen.setText(updateText + '4');
        }
    }
    public void ButtonPress5(View v){
        TextView screen = (TextView) findViewById(R.id.inputScreen);
        String updateText =screen.getText().toString();
        if(updateText.equals("0")){
            screen.setText("5");
        }
        else{
            screen.setText(updateText + '5');
        }
    }
    public void ButtonPress6(View v){
        TextView screen = (TextView) findViewById(R.id.inputScreen);
        String updateText =screen.getText().toString();
        if(updateText.equals("0")){
            screen.setText("6");
        }
        else{
            screen.setText(updateText + '6');
        }
    }
    public void ButtonPress7(View v){
        TextView screen = (TextView) findViewById(R.id.inputScreen);
        String updateText =screen.getText().toString();
        if(updateText.equals("0")){
            screen.setText("7");
        }
        else{
            screen.setText(updateText + '7');
        }
    }
    public void ButtonPress8(View v){
        TextView screen = (TextView) findViewById(R.id.inputScreen);
        String updateText =screen.getText().toString();
        if(updateText.equals("0")){
            screen.setText("8");
        }
        else{
            screen.setText(updateText + '8');
        }

    }
    public void ButtonPress9(View v){
        TextView screen = (TextView) findViewById(R.id.inputScreen);
        String updateText =screen.getText().toString();
        if(updateText.equals("0")){
            screen.setText("9");
        }
        else{
            screen.setText(updateText + '9');
        }

    }
    public void ButtonPress0(View v){
        TextView screen = (TextView) findViewById(R.id.inputScreen);
        String updateText =screen.getText().toString();
        if(updateText.equals("0")){
            screen.setText("0");
        }
        else{
            screen.setText(updateText + '0');
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
