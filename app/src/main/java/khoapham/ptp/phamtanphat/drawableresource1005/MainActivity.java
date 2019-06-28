package khoapham.ptp.phamtanphat.drawableresource1005;

import android.graphics.drawable.ClipDrawable;
import android.media.Image;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgClip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgClip = findViewById(R.id.imageview);
        final ClipDrawable clipDrawable = (ClipDrawable) imgClip.getDrawable();
        clipDrawable.setLevel(0);
        imgClip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgClip.setImageLevel(clipDrawable.getLevel() + 1000);
            }
        });

    }

}
