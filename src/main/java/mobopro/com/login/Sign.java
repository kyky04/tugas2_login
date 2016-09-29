package mobopro.com.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by rizki04 on 29/09/2016.
 */
public class Sign extends AppCompatActivity {
    private TextView tv;
    Button Logout;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign);

        Logout = (Button)findViewById(R.id.btnLogout);
        tv = (TextView)findViewById(R.id.name);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        if(b!=null)
        {
            String j =(String) b.get("email");
            tv.setText(j);
        }

        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Sign.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
