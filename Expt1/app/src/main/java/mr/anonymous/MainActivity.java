package mr.anonymous;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] size = {25,1};
        TextView textView = (TextView) findViewById(R.id.textview);
        Button sizeButton = (Button) findViewById(R.id.sizeButton);
        sizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextSize(size[0]);{
                    size[0] +=5;
                    if(size[0]==50){
                        size[0] = 25;
                    }
                }
            }
        });
        Button colorButton = (Button) findViewById(R.id.colorButton);
        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (size[1]){
                    case 1 :
                        textView.setTextColor(Color.BLUE);
                        size[1]++;
                        break;
                    case 2 :
                        textView.setTextColor(Color.RED);
                        size[1]++;
                        break;
                    case 3 :
                        textView.setTextColor(Color.GRAY);
                        size[1]++;
                        break;
                    case 4 :
                        textView.setTextColor(Color.GREEN);
                        size[1]++;
                        break;
                    case 5 :
                        textView.setTextColor(Color.MAGENTA);
                        size[1]++;
                        break;
                    case 6 :
                        textView.setTextColor(Color.CYAN);
                        size[1]++;
                        break;
                    default:
                        textView.setTextColor(Color.YELLOW);
                        size[1]=1;
                        break;

                }
            }
        });
    }
}