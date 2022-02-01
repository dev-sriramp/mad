package mr.anonymous.expt5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class viewSubject extends AppCompatActivity {
    String subject[];
    String sem,dept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_subject);
        Intent i = getIntent();
        sem = i.getStringExtra("sem");
        dept = i.getStringExtra("dept");
        TextView te = (TextView) findViewById(R.id.textView);
        te.setText(dept+" "+sem);
        if(dept.equals("CSE")){
            if(sem.equals("sem1")){
                subject = getResources().getStringArray(R.array.csesem1);
            }
            else if(sem.equals("sem2")){
                subject = getResources().getStringArray(R.array.csesem2);
            }
            else if(sem.equals("sem3")){
                subject = getResources().getStringArray(R.array.csesem3);
            }
            else if(sem.equals("sem4")){
                subject = getResources().getStringArray(R.array.csesem4);
            }
            else if(sem.equals("sem5")){
                subject = getResources().getStringArray(R.array.csesem5);
            }
            else {
                subject = getResources().getStringArray(R.array.csesem6);
            }

        }
        else if(dept.equals("ECE")){
            if(sem.equals("sem1")){
                subject = getResources().getStringArray(R.array.ecesem1);
            }
            else if(sem.equals("sem2")){
                subject = getResources().getStringArray(R.array.ecesem2);
            }
            else if(sem.equals("sem3")){
                subject = getResources().getStringArray(R.array.ecesem3);
            }
            else if(sem.equals("sem4")){
                subject = getResources().getStringArray(R.array.ecesem4);
            }
            else if(sem.equals("sem5")){
                subject = getResources().getStringArray(R.array.ecesem5);
            }
            else {
                subject = getResources().getStringArray(R.array.ecesem6);
            }
        }
        else if(dept.equals("EEE")){
            if(sem.equals("sem1")){
                subject = getResources().getStringArray(R.array.eeesem1);
            }
            else if(sem.equals("sem2")){
                subject = getResources().getStringArray(R.array.eeesem2);
            }
            else if(sem.equals("sem3")){
                subject = getResources().getStringArray(R.array.eeesem3);
            }
            else {
                subject = getResources().getStringArray(R.array.eeesem4);
            }

        }
        else if(dept.equals("MECH")){
            if(sem.equals("sem1")){
                subject = getResources().getStringArray(R.array.mechsem1);
            }
            else if(sem.equals("sem2")){
                subject = getResources().getStringArray(R.array.mechsem2);
            }
            else if(sem.equals("sem3")){
                subject = getResources().getStringArray(R.array.mechsem3);
            }
            else if(sem.equals("sem4")){
                subject = getResources().getStringArray(R.array.mechsem4);
            }
            else if(sem.equals("sem5")){
                subject = getResources().getStringArray(R.array.mechsem5);
            }
            else {
                subject = getResources().getStringArray(R.array.mechsem6);
            }
        }
        else if(dept.equals("CIVIL")){
            if(sem.equals("sem1")){
                subject = getResources().getStringArray(R.array.civilsem1);
            }
            else if(sem.equals("sem2")){
                subject = getResources().getStringArray(R.array.civilsem2);
            }
            else if(sem.equals("sem3")){
                subject = getResources().getStringArray(R.array.civilsem3);
            }
            else if(sem.equals("sem4")){
                subject = getResources().getStringArray(R.array.civilsem4);
            }
            else {
                subject = getResources().getStringArray(R.array.civilsem5);
            }

        }
        else if(dept.equals("BME")){
            if(sem.equals("sem1")){
                subject = getResources().getStringArray(R.array.bmesem1);
            }
            else if(sem.equals("sem2")){
                subject = getResources().getStringArray(R.array.bmesem2);
            }
            else if(sem.equals("sem3")){
                subject = getResources().getStringArray(R.array.bmesem3);
            }
            else if(sem.equals("sem4")){
                subject = getResources().getStringArray(R.array.bmesem4);
            }
            else if(sem.equals("sem5")){
                subject = getResources().getStringArray(R.array.bmesem5);
            }
            else if(sem.equals("sem6")){
                subject = getResources().getStringArray(R.array.bmesem6);
            }
            else {
                subject = getResources().getStringArray(R.array.bmesem7);
            }
        }
        else {
            if(sem.equals("sem1")){
                subject = getResources().getStringArray(R.array.ainddssem1);
            }
            else if(sem.equals("sem2")){
                subject = getResources().getStringArray(R.array.ainddssem2);
            }
            else if(sem.equals("sem3")){
                subject = getResources().getStringArray(R.array.ainddssem3);
            }
            else if(sem.equals("sem4")){
                subject = getResources().getStringArray(R.array.ainddssem4);
            }
            else if(sem.equals("sem5")){
                subject = getResources().getStringArray(R.array.ainddssem5);
            }
            else if(sem.equals("sem6")){
                subject = getResources().getStringArray(R.array.ainddssem6);
            }
            else if(sem.equals("sem7")){
                subject = getResources().getStringArray(R.array.ainddssem7);
            }
            else {
                subject = getResources().getStringArray(R.array.ainddssem8);
            }
        }
        ListView listSubject = (ListView) findViewById(R.id.listSubject);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,subject);
        listSubject.setAdapter(adapter);

    }
}