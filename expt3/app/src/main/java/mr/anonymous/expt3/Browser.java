package mr.anonymous.expt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Browser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);
        Button browse = (Button) findViewById(R.id.browse);
        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText urlfinder = (EditText) findViewById(R.id.url);
                String url = urlfinder.getText().toString();
                if (!url.startsWith("https://") && !url.startsWith("http://")){
                    url = "http://" + url;
                }
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(Intent.createChooser(intent, "Browse with"));
            }
        });
    }
}