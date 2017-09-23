package com.android.example.cis.digitalportfolio;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ContactView extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_view);

    }


    public void callNisal(View view) {

        Intent makeCall = new Intent(Intent.ACTION_CALL);
        makeCall.setData(Uri.parse("tel:" + "0719022332"));

        try {
            startActivity(makeCall);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void smsNisal(View view) {
        Intent intent = new Intent(ContactView.this,MessageSender.class);
        startActivity(intent);

    }

    public void emailView(View view){

        Intent intent = new Intent(ContactView.this,MailSender.class);
        startActivity(intent);

    }


}
