package my.edu.utem.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.hello_textView);
}

    public void buttonPressed(View view) {
        Log.d("debug","Hello World");
        Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_LONG).show();
        textView.setText("Selamat Datang");
    }
}
