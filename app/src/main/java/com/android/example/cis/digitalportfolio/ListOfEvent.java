package com.android.example.cis.digitalportfolio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListOfEvent extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_event);
    }

    public void showResume(View view){

        Intent intent = new Intent(ListOfEvent.this,Resume.class);
        startActivity(intent);

    }
    public void showCG(View view){

        Intent intent = new Intent(ListOfEvent.this,CareerGoals.class);
        startActivity(intent);

    }

    public void showEx(View view){

        Intent intent = new Intent(ListOfEvent.this,ExperienceView.class);
        startActivity(intent);

    }
    public void showTP(View view){

        Intent intent = new Intent(ListOfEvent.this,TPView.class);
        startActivity(intent);

    }
    public void showAQ(View view){

        Intent intent = new Intent(ListOfEvent.this,AcademicQualificationView.class);
        startActivity(intent);

    }
    public void showProQ(View view){

        Intent intent = new Intent(ListOfEvent.this,ProfessionalQualificationView.class);
        startActivity(intent);

    }
    public void showProject(View view){

        Intent intent = new Intent(ListOfEvent.this,ProjectView.class);
        startActivity(intent);

    }
    public void showPublication(View view){

        Intent intent = new Intent(ListOfEvent.this,PublicationView.class);
        startActivity(intent);

    }

    public void showContact(View view){

        Intent intent = new Intent(ListOfEvent.this,ContactView.class);
        startActivity(intent);

    }
}
