package si3901.rinafdlh.gustarina_1202154313_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);
    }

    public void onLogin(View view) {
        if (username.getText().toString().equals("EAD") && password.getText().toString().equals("MOBILE")){
            Toast.makeText(getApplicationContext(),"LOGIN SUCCESS !", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(),"LOGIN FAILED", Toast.LENGTH_SHORT).show();
        }
    }
}
