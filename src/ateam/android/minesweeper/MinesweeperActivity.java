package ateam.android.minesweeper;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.os.Bundle;

public class MinesweeperActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView  tv = new TextView(this);
        

        tv.setText( "Hi There, you.");

        setContentView(tv);
    }
}