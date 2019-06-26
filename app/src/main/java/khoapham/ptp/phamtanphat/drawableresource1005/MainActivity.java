package khoapham.ptp.phamtanphat.drawableresource1005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnTest1,btnTest2,btnTest3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTest1 = findViewById(R.id.buttonTest1);
        btnTest2 = findViewById(R.id.buttonTest2);
        btnTest3 = findViewById(R.id.buttonTest3);

        btnTest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTest1.setSelected(true);
                btnTest2.setSelected(false);
                btnTest3.setSelected(false);
            }
        });
        btnTest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTest1.setSelected(false);
                btnTest2.setSelected(true);
                btnTest3.setSelected(false);
            }
        });
        btnTest3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTest1.setSelected(false);
                btnTest2.setSelected(false);
                btnTest3.setSelected(true);
            }
        });

    }
}
