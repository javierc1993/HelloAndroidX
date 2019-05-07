package aplimovil.com.helloandroidx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Date;

public class HelloXActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_x);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        updateTime();
     }


     private void updateTime() { button.setText(new Date().toString());}

     @Override
    public void onClick(View view)
     {updateTime();
     }
}
