package myFirstApp.Namespace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends Activity {

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
    }
    
    /** Called when the user selects the Save Settings button */
    public void saveSettingsAndReturnHome(View view) {
    	 Intent goHomeIntent = new Intent(this, MyFirstActivity.class);
         startActivity(goHomeIntent);
    }
	
}
