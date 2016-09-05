package cn.edu.bistu.cs.cnse.edu.bistu.cs.se.exercise_8;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MyActivity";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate()");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy()");
    }


    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause()");
    }


    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart()");
    }


    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume()");
    }
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart()");
    }


    protected void onStop() {

        super.onStop();
        Log.i(TAG,"onStop()");
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
