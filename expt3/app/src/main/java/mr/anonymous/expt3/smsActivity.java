package mr.anonymous.expt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class smsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        Button send_sms = (Button) findViewById(R.id.send_sms);
        send_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText phoneno   = (EditText)findViewById(R.id.smsno);
                EditText sms = (EditText) findViewById(R.id.message);
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.putExtra("sms_body", sms.getText().toString());
                    intent.setData(Uri.parse("sms:"+phoneno.getText().toString()));
                    startActivity(intent);
                } catch (android.content.ActivityNotFoundException anfe) {
                    Log.d("Error" , "Error");
                }
            }
        });
    }
}