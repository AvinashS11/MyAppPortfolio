package com.avinash.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Portfolio extends ActionBarActivity {

    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portfolio_layout);
    }

    /**
     * @param view
     * On click event handling method
     */
    public void onClick(View view) {

        switch(view.getId()) {

            case R.id.launch_spotify_streamer:
            case R.id.launch_scores_app:
            case R.id.launch_library_app:
            case R.id.launch_buildit_bigger:
            case R.id.launch_xyz_reader:
            case R.id.launch_capstone:
                displayToast("Launch " + ((Button) view).getText().toString());
            default:
                break;
        }
    }

    /**
     * The method which displays toast msgs
     * @param msg
     */
    public void displayToast(String msg){
        if(mAppToast!=null) {
            mAppToast.cancel();
        }
        mAppToast = Toast.makeText(this,msg,Toast.LENGTH_SHORT);
        mAppToast.show();
    }
}
