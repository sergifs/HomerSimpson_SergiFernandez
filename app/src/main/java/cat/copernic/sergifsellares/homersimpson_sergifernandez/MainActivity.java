package cat.copernic.sergifsellares.homersimpson_sergifernandez;

import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView theSimpsons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        theSimpsons = findViewById(R.id.theSimpsons);
        ((AnimationDrawable) theSimpsons.getDrawable()).start();

    }
}
