package cat.copernic.sergifsellares.homersimpson_sergifernandez;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView theSimpsons, homer, ull, donut, engranatge_vermell, engranatge_verd, engranatge_blau;
    private Animation rotate_vermell, rotate_verd, rotate_blau, rotate_donut, translate_donut;
    private AnimationSet donut_animation;
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
        rotate_vermell = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_vermell);
        rotate_verd = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_verd);
        rotate_blau = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_blau);

        //Donut
        rotate_donut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_donut);
        translate_donut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate_donut);
        translate_donut.setRepeatCount(-1);
        translate_donut.setRepeatMode(Animation.REVERSE);
        donut_animation = new AnimationSet(false);
        donut_animation.addAnimation(rotate_donut);
        donut_animation.addAnimation(translate_donut);

        theSimpsons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isVisible) {
                    engranatge_vermell.clearAnimation();
                    engranatge_verd.clearAnimation();
                    engranatge_blau.clearAnimation();
                    donut.clearAnimation();
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
                    engranatge_vermell.startAnimation(rotate_vermell);
                    engranatge_verd.startAnimation(rotate_verd);
                    engranatge_blau.startAnimation(rotate_blau);
                    donut.startAnimation(donut_animation);
                    isVisible = true;
                }
            }
        });

    }
}
