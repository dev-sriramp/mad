package mr.anonymous.expt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class telActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tel);
        Button call = (Button) findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText mobileno = (EditText) findViewById(R.id.mobileno);
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("tel:"+mobileno.getText().toString()));
                    startActivity(intent);
                } catch (android.content.ActivityNotFoundException anfe) {
                    Log.d("Error" , "Error");
                }
            }
        });
    }
}