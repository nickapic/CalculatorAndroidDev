package com.example.calculatorandroiddev;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CalculatorBackEnd c = new CalculatorBackEnd();
    double var1 = 0;//Store the data for the processes to take place
    double var2 = 0;
    int universalcheck = 0;

    public double calculateFunction(double var1 ,double var2){
        double value = -1;
        if(universalcheck == 1){
            value = c.addItems(var1,var2);
            return value;
        }
        else if(universalcheck == 2){
            value = c.subtractItems(var1,var2);
            return value;
        }
        else if(universalcheck == 3){
            value = c.multiplyItems(var1,var2);
            return value;
        }
        else if(universalcheck == 4){
            value = c.divideItems(var1,var2);
            return value;
        }
        else if(universalcheck == 5){
            value = c.squareRootItems(var1);
            return value;
        };

        return value;
    };

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

    public void addBtn(View v){
        TextView screen = (TextView) findViewById(R.id.inputScreen);
        String textToChange = screen.getText().toString();
        double Value = Integer.parseInt(textToChange);
        if(var1 == 0){
            var1 = Value;
            screen.setText("0");
        }
        else if(var1 != 0){
            if(var2 != 0 ){
                if(universalcheck == 0){
                    universalcheck = 1;
                }
            }
            else if(var2 == 0){
                if(universalcheck == 0){
                    universalcheck = 1;
                }
                var2 = Value;
            }
            double value = calculateFunction(var1,var2);
            var1 = value;
            var2 = 0;

            screen.setText("0");//Texting
        }

    }
        public void subtractBtn(View v){
            TextView screen = (TextView) findViewById(R.id.inputScreen);
            String textToChange = screen.getText().toString();
            double Value = Integer.parseInt(textToChange);
            if(var1 == 0){
                var1 = Value;
                screen.setText("0");
            }
            else if(var1 != 0){
                if(var2 != 0 ){
                    if(universalcheck == 0){
                        universalcheck = 2;
                    }
                }
                else if(var2 == 0){
                    if(universalcheck == 0){
                        universalcheck = 2;
                    }
                    var2 = Value;
                }
                double value = calculateFunction(var1,var2);
                var1 = value;
                var2 = 0;

                screen.setText("0");//Texting
            }

    }
    public void multipletBtn(View v) {
        TextView screen = (TextView) findViewById(R.id.inputScreen);
        String textToChange = screen.getText().toString();
        double Value = Integer.parseInt(textToChange);
        if (var1 == 0) {
            var1 = Value;
            screen.setText("0");
        } else if (var1 != 0) {
            if (var2 != 0) {
                if (universalcheck == 0) {
                    universalcheck = 3;
                }
            } else if (var2 == 0) {
                if (universalcheck == 0) {
                    universalcheck = 3;
                }
                var2 = Value;
            }
            double value = calculateFunction(var1, var2);
            var1 = value;
            var2 = 0;

            screen.setText("0");//Texting
        }
    }

    public void divideBtn(View v) {
        TextView screen = (TextView) findViewById(R.id.inputScreen);
        String textToChange = screen.getText().toString();
        double Value = Integer.parseInt(textToChange);
        if (var1 == 0) {
            var1 = Value;
            screen.setText("0");
        } else if (var1 != 0) {
            if (var2 != 0) {
                if (universalcheck == 0) {
                    universalcheck = 4;
                }//Logic Error here
            } else if (var2 == 0) {
                if (universalcheck == 0) {
                    universalcheck = 4;
                }
                var2 = Value;
            }
            double value = calculateFunction(var1, var2);
            var1 = value;
            var2 = 0;

            screen.setText("0");//Texting
        }
    }
    public void sqrttBtn(View v) {
        TextView screen = (TextView) findViewById(R.id.inputScreen);
        String textToChange = screen.getText().toString();
        double Value = Integer.parseInt(textToChange);
        if (var1 == 0) {
            var1 = Value;
            screen.setText("0");
        } else if (var1 != 0) {
            if (var2 != 0) {
                if (universalcheck == 0) {
                    universalcheck = 5;
                }
            } else if (var2 == 0) {
                if (universalcheck == 0) {
                    universalcheck = 5;
                }
                var2 = Value;
            }
            double value = calculateFunction(var1, var2);
            var1 = value;
            var2 = 0;
            screen.setText("0");
        }
    }
    public void equalbtn(View v){
        TextView screen = (TextView) findViewById(R.id.inputScreen);

        String textToChange = screen.getText().toString();
        double Value = Integer.parseInt(textToChange);
        double value;
        if(var1 == 0){
            Toast.makeText(this,"Error :Please Enter Something",Toast.LENGTH_LONG).show();
        }
        else{
            var2 = Value;
            double disvalue = calculateFunction(var1, var2);
            String strValue = String.valueOf(disvalue);
            screen.setText(strValue);
        }
        universalcheck = 0;
        var1= 0;
        var2=0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
