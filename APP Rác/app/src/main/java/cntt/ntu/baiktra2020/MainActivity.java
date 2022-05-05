package cntt.ntu.baiktra2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText edt;
    Button btn;
    double doF = 33.8 ;
    double doC ;

    public void covertCtoF(View view) {
        edt = (EditText) findViewById(R.id.do_c);
        btn = (Button) findViewById(R.id.button);
        double doC = Integer.parseInt(edt.getText().toString());
        double DA = doC * 33.8;
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String noidung = edt.getText().toString();
                    Toast.makeText(MainActivity.this, Double.toString(DA), Toast.LENGTH_LONG).show();
                }
            });


    }
    public void covertFtoC(View view) {
        edt = (EditText) findViewById(R.id.do_f);
        btn = (Button) findViewById(R.id.button2);
        double doF = Integer.parseInt(edt.getText().toString());
        double DA = doF / 33.8;

        Toast.makeText(MainActivity.this, Double.toString(DA), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}