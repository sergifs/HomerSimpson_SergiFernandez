package cat.copernic.sergifsellares.homersimpson_sergifernandez;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView theSimpsons, homer, ull, donut, engranatge_vermell, engranatge_verd, engranatge_blau;

    private Boolean isVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        theSimpsons = findViewById(R.id.theSimpsons);
        homer = findViewById(R.id.homer);
        ull = findViewById(R.id.ull);
        donut = findViewById(R.id.donut);
        engranatge_vermell = findViewById(R.id.engranatge_vermell);
        engranatge_verd = findViewById(R.id.engranatge_verd);
        engranatge_blau = findViewById(R.id.engranatge_blau);

        ((AnimationDrawable) theSimpsons.getDrawable()).start();
        theSimpsons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isVisible) {
                    ull.setVisibility(View.INVISIBLE);
                    donut.setVisibility(View.INVISIBLE);
                    engranatge_vermell.setVisibility(View.INVISIBLE);
                    engranatge_verd.setVisibility(View.INVISIBLE);
                    engranatge_blau.setVisibility(View.INVISIBLE);
                    isVisible = false;
                } else {
                    ull.setVisibility(View.VISIBLE);
                    donut.setVisibility(View.VISIBLE);
                    engranatge_vermell.setVisibility(View.VISIBLE);
                    engranatge_verd.setVisibility(View.VISIBLE);
                    engranatge_blau.setVisibility(View.VISIBLE);
                    isVisible = true;
                }
            }
        });

    }
}
