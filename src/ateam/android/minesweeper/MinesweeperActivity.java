package ateam.android.minesweeper;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

public class MinesweeperActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main); 
        

    }
    
    public void buttonClicked(View view) {
    	ImageButton button = (ImageButton)view;
    	button.setImageResource(R.drawable.one);
    	
    	log("clicked!!"+view.getId());
    	view.setClickable(false);

    }
    
    public void log(String massage) {
    	Log.d("Yo!!", massage);
    }
}