package com.example.fatboy.cissgin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Fatboy on 17/9/2017.
 */

public class cissmunprocedure extends Activity {


    TextView a,c,d,e,f,g,h,i;
    private Button coverpage,roster,guidelines, rules, chairing,one,two;





    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.munprocedure);




        coverpage = (Button)findViewById(R.id.coverpage);
        coverpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencoverpage();
            }
        });

        roster = (Button)findViewById(R.id.studentofficerroster);
        roster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openroster();
            }
        });

        guidelines = (Button)findViewById(R.id.preparatorymeetingguidelines);
        guidelines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openguidelines();
            }
        });

        rules = (Button)findViewById(R.id.cissmunrules);
        rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openrules();
            }
        });

        chairing = (Button)findViewById(R.id.chairingatCISSMUN);
        chairing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openchairing();
            }
        });

        one = (Button)findViewById(R.id.appendix);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openone();
            }
        });

        two = (Button)findViewById(R.id.appendix2);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentwo();
            }
        });







        a = (TextView) findViewById(R.id.studnetofficer);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        a.setTypeface(myCustomFont);

        c = (TextView) findViewById(R.id.coverpage);
        c.setTypeface(myCustomFont);

        d = (TextView) findViewById(R.id.studentofficerroster);
        d.setTypeface(myCustomFont);

        e = (TextView) findViewById(R.id.preparatorymeetingguidelines);
        e.setTypeface(myCustomFont);

        f = (TextView) findViewById(R.id.cissmunrules);
        f.setTypeface(myCustomFont);

        g = (TextView) findViewById(R.id.chairingatCISSMUN);
        g.setTypeface(myCustomFont);

        h = (TextView) findViewById(R.id.appendix);
        h.setTypeface(myCustomFont);

        i = (TextView) findViewById(R.id.appendix2);
        i.setTypeface(myCustomFont);
    }

    public void opencoverpage()
    {
        Intent i = new Intent(this, pro_coverpage.class);
        startActivity(i);
    }

    public void openroster()
    {
        Intent j = new Intent(this, pro_roster.class);
        startActivity(j);
    }

    public void openguidelines()
    {
        Intent k = new Intent(this, pro_guidelines.class);
        startActivity(k);
    }

    public void openrules()
    {
        Intent k = new Intent(this, pro_procedure.class);
        startActivity(k);
    }

    public void openchairing()
    {
        Intent k = new Intent(this, pro_chairing.class);
        startActivity(k);
    }

    public void openone()
    {
        Intent k = new Intent(this, pro_appendix1.class);
        startActivity(k);
    }

    public void opentwo()
    {
        Intent k = new Intent(this, pro_appendix11.class);
        startActivity(k);
    }




}

