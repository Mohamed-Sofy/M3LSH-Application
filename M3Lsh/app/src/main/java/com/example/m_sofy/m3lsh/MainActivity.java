package com.example.m_sofy.m3lsh;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView text;
    ImageView background;
    private static final Random rgenerator = new Random();
    private static final Integer[] mImageIds =
            {R.drawable.z1, R.drawable.lm, R.drawable.mm,
                    R.drawable.nn, R.drawable.jk};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        text = (TextView) findViewById(R.id.textView);
        background = (ImageView) findViewById(R.id.back);

    }

    public void getimage() {

        int i = rgenerator.nextInt(5);
        findViewById(R.id.background).setBackgroundResource(mImageIds[i]);


    }

    public String getrandam() {
        String[] items = new String[]{"معلش", "هتفرج", "استحمل", "عيش حياتك", "ربنا كبير", "معلش", "اسمع شعبي", "قوم ارقص", "الدنيا حلوه", "تعشبشاى", "احكيلى", "عااش", "افشل 100 وانج مره", "شد حيلك", "عيش يومك", "الكسل مش حلو عشانك", "رب ضاره نافعه", "حياتك فرصه", "اشرب قهوه", "انزل جيم"};
        Random rand = new Random();
        return items[rand.nextInt(items.length)];

    }

    public void button(View view) {

        String string = getrandam();
        getimage();
        // String imagename = getimage();
        text.setText(string);
        /////////////////

    }
}