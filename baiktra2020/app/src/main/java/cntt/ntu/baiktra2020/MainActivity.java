package cntt.ntu.baiktra2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText edtC2F, edtF2C;
    private Button btnCF, btnFC, clean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtC2F = findViewById(R.id.do_c);
        edtF2C = findViewById(R.id.do_f);
        btnCF = findViewById(R.id.button2);
        btnFC = findViewById(R.id.button);
        clean = findViewById(R.id.button3);

        btnCF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String C = edtC2F.getText().toString();
                double toF = Double.parseDouble(C);
                double XF = toF * 33.8;
                edtF2C = (EditText) findViewById(R.id.do_f);
                edtF2C.setText(String.valueOf(XF));
                // Toast.makeText(MainActivity.this,Double.toString(XF), Toast.LENGTH_SHORT).show();
            }
        });

        btnFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String F = edtF2C.getText().toString();
                double toC = Double.parseDouble(F);
                double XC = toC / 33.8;
                edtC2F = (EditText) findViewById(R.id.do_c);
                edtC2F.setText(String.valueOf(XC));
                // Toast.makeText(MainActivity.this,Double.toString(XF), Toast.LENGTH_SHORT).show();
            }
        });

        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtF2C.setText("");
                edtC2F.setText("");
            }
        });


    }
}