package khoapham.ptp.phamtanphat.drawableresource1005;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    int level = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageview);

        img.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
//               CountDownTimer countDownTimer = new CountDownTimer(2000,1000) {
//                   @Override
//                   public void onTick(long millisUntilFinished) {
//                       level+= 10;
//                       if (level >= 50){
//                           level = 0;
//                       }
//                       img.setImageLevel(level);
//                   }
//
//                   @Override
//                   public void onFinish() {
//                        this.start();
//                   }
//               };
//               countDownTimer.start();
               // Delay sau khoang thoi gian mo thuc thi
               Handler handler = new Handler();
               handler.postDelayed(new Runnable() {
                   @Override
                   public void run() {
                       Log.d("BBB","Delay 1s ");
                   }
               },1000);

           }
       });

    }

}
