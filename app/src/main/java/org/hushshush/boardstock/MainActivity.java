package org.hushshush.boardstock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout unoRev3 = (LinearLayout) findViewById(R.id.uno_rev3);
        unoRev3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent unoRev3 = new Intent (MainActivity.this, Board.class);
                startActivity(unoRev3);
            }
        });
    }
}
