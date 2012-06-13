package myFirstApp.Namespace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyFirstActivity extends Activity {
	public final static String FROM_HOME_MESSAGE = "myFirstApp.FROMHOMEPAGE";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    /** Called when the user selects the Add Item button */
    public void showAddItemScreen(View view) {
        Intent addItemintent = new Intent(this, AddItemActivity.class);
        startActivity(addItemintent);
    }
    
    /** Called when the user selects the Manage Items button */
    public void showManageItemsScreen(View view) {
        Intent manageItemIntent = new Intent(this, ManageItemActivity.class);
        manageItemIntent.putExtra(FROM_HOME_MESSAGE, "From Home Page");
        startActivity(manageItemIntent);
    }
    
    /** Called when the user selects the Settings button */
    public void showSettingsScreen(View view) {
        Intent settingsIntent = new Intent(this, SettingsActivity.class);
        startActivity(settingsIntent);
    }
}