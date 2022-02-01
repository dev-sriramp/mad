package mr.anonymous.expt5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] listitem = getResources().getStringArray(R.array.allDepts);
        Spinner sp = (Spinner) findViewById(R.id.listalldepts);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,listitem);
        sp.setAdapter(adapter);
        Button bt = (Button) findViewById(R.id.showButton);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = sp.getSelectedItem().toString();
                if(!s.equals("")){
               // Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("deptSelected",s);
                startActivity(i);}
            }
        });
    }
}