package com.android.example.cis.digitalportfolio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MailSender extends AppCompatActivity {

    EditText ccText, subject, message;
    String mailCC, mailSubject, mailMssage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_sender);

        ccText = (EditText) findViewById(R.id.ccText);
        subject = (EditText) findViewById(R.id.mailSubject);
        message = (EditText) findViewById(R.id.mailMessage);

        mailCC = ccText.getText().toString();
        mailSubject = subject.getText().toString();
        mailMssage = message.getText().toString();

    }

    private void sendMail(String cc, String mailSubject, String mailMssage) {
        String[] TO = {"nisalsp9@yahoo.com"};
        String[] CC = {cc};

        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");

        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, mailSubject);
        emailIntent.putExtra(Intent.EXTRA_TEXT, mailMssage);

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();

        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MailSender.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }


    }

    public void contextReset(View view) {

        message.setText("");


    }

    public void resetAll(View view) {

        message.setText("");
        ccText.setText("");
        subject.setText("");


    }

    public void sendMailToNisal(View view) {


        sendMail(mailCC, mailSubject, mailMssage);
    }
}
