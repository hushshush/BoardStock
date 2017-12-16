package org.hushshush.boardstock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Board extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        TextView makeNew = (TextView) findViewById(R.id.make_new);
        makeNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent makeNew = new Intent (Board.this, Restock.class);
                startActivity(makeNew);
            }
        });
    }
}
