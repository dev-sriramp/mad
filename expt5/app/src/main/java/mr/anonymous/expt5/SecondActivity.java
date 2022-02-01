package mr.anonymous.expt5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    //Toast toastMessage;
    String[] dept;
    String department;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = getIntent();
        TextView deptView = (TextView) findViewById(R.id.dept);
        deptView.setText(i.getStringExtra("deptSelected"));
        ListView semList = (ListView) findViewById(R.id.semList);
        department = i.getStringExtra("deptSelected");
        if(department.equals("CSE")){
            dept = getResources().getStringArray(R.array.cse);
        }
        else if(department.equals("ECE")){
            dept = getResources().getStringArray(R.array.ece);
        }
        else if(department.equals("EEE")){
            dept = getResources().getStringArray(R.array.eee);
        }
        else if(department.equals("MECH")){
            dept = getResources().getStringArray(R.array.mech);
        }
        else if(department.equals("CIVIL")){
            dept = getResources().getStringArray(R.array.civil);
        }
        else if(department.equals("BME")){
            dept = getResources().getStringArray(R.array.bme);
        }
        else {
            dept = getResources().getStringArray(R.array.aindds);
        }

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dept);
        semList.setAdapter(adapter);

        semList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String value = adapter.getItem(position);
                //if(toastMessage!=null){
                  //  toastMessage.cancel();
                //}
                //toastMessage = Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT);
               // toastMessage.show();
                Intent subject = new Intent(SecondActivity.this,viewSubject.class);
                subject.putExtra("sem",value);
                subject.putExtra("dept",department);
                startActivity(subject);
            }
        });
    }
}