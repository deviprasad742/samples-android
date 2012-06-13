package myFirstApp.Namespace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddItemActivity extends Activity {

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.additem);
    }
    
    /** Called when the user selects the Done button */
    public void onAddItemClick(View view) {
        EditText editText = (EditText) findViewById(R.id.edit_item);
        editText.setHint("Enter Item description here");
    }
    
    /** Called when the user selects the Return to Home button */
    public void showHomeScreen(View view) {
        Intent goHomeIntent = new Intent(this, MyFirstActivity.class);
        startActivity(goHomeIntent);
    }
	
}
