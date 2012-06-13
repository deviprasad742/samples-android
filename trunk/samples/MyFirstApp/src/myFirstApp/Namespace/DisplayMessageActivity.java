package myFirstApp.Namespace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //Getting the intent and the message from prev activity
        Intent intent = getIntent();
        String message = intent.getStringExtra(MyFirstActivity.FROM_HOME_MESSAGE);
        
        //Setting the retrieved text to the screen here.
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        setContentView(textView);
    }

}
