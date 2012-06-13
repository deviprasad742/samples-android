package myFirstApp.Namespace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ManageItemActivity extends Activity {
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manageitem);
    }

    /** Called when the user selects the Return to Home button */
    public void showHomeScreen(View view) {
        Intent goHomeIntent = new Intent(this, MyFirstActivity.class);
        startActivity(goHomeIntent);
    }
    
}
