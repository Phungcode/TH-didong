package cntt.ntu.may_tinh_cam_tay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText soA, soB;
    private TextView edt;
    private Button cong, tru, nhan, chia, ketqua;

    public String AA, BB;
    public Double SA,SB, KQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soA = findViewById(R.id.A);
        soB = findViewById(R.id.B);
        edt = findViewById(R.id.textResult);
        cong = findViewById(R.id.CONG);
        tru = findViewById(R.id.TRU);
        nhan = findViewById(R.id.NHAN);
        chia = findViewById(R.id.CHIA);
        ketqua = findViewById(R.id.KETQUA);

        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AA = soA.getText().toString();
                SA =Double.parseDouble(AA);
                BB = soB.getText().toString();
                SB = Double.parseDouble(BB);
                KQ = SA + SB ;
//                edt = (TextView) findViewById(R.id.textResult);
//                edt.setText(String.valueOf(KQ));
            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AA = soA.getText().toString();
                SA =Double.parseDouble(AA);
                BB = soB.getText().toString();
                SB = Double.parseDouble(BB);
                KQ = SA - SB ;
//                edt = (TextView) findViewById(R.id.textResult);
//                edt.setText(String.valueOf(KQ));
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AA = soA.getText().toString();
                SA =Double.parseDouble(AA);
                BB = soB.getText().toString();
                SB = Double.parseDouble(BB);
                KQ = SA * SB ;
//                edt = (TextView) findViewById(R.id.textResult);
//                edt.setText(String.valueOf(KQ));
            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AA = soA.getText().toString();
                SA =Double.parseDouble(AA);
                BB = soB.getText().toString();
                SB = Double.parseDouble(BB);
                KQ = SA / SB ;
//                edt = (TextView) findViewById(R.id.textResult);
//                edt.setText(String.valueOf(KQ));
            }
        });
        ketqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt = (TextView) findViewById(R.id.textResult);
                edt.setText(String.valueOf(KQ));
            }
        });



    }
}