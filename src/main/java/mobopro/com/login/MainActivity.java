package mobopro.com.login;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button sign;
    Button signup;
    Button gmail;
    Button fb;
    Button Tw;
    EditText etemail;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sign = (Button) findViewById(R.id.btnLogin);
        signup = (Button) findViewById(R.id.btnSignup);
        gmail = (Button) findViewById(R.id.btgmail);
        fb = (Button)findViewById(R.id.btfb);
        Tw = (Button)findViewById(R.id.bttw);
        etemail = (EditText)findViewById(R.id.email);
        pass = (EditText)findViewById(R.id.password);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Signup.class);
                startActivity(i);
            }
        });
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String em= etemail.getText().toString();

                Intent i = new Intent(MainActivity.this,Sign.class);
                i.putExtra("email",em);
                startActivity(i);
            }
        });
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"rizkifauzirahamn04@email.com"});
                i.putExtra(android.content.Intent.EXTRA_SUBJECT, "");
                i.putExtra(android.content.Intent.EXTRA_TEXT,"");
                startActivity(Intent.createChooser(i, "Send email..."));
            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://web.facebook.com/rizki.fauzirahman";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);            }
        });
        Tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://twitter.com/rizkifauzirahm2";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);            }
        });


    }
}