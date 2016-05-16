package com.sdsu.cs646.lakshmi.assignment_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

/**
 * LogActivity class
 */
public class LogActivity extends AppCompatActivity {

    private static final String TAG = "LogActivity";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate(Bundle) called");
        setContentView(R.layout.activity_log_);

        textView = (TextView) findViewById(R.id.methodView);
        textView.setText(getResources().getString(R.string.FUNC_CREATE) + " \n");
        //textView.setText("onCreate" + " \n");

        setupClearButton();

    }

    /**
     * setupClearButton()
     *
     * Method which listens to the button clicks
     * and clear the text value in the TextView.
     */
    private void setupClearButton() {
        Button clearButton = (Button) findViewById(R.id.button);
        clearButton.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Log.i(TAG, "setupClearButton() called");
                   TextView myTextView = (TextView) findViewById(R.id.methodView);
                   myTextView.setText("");

               }
           }
        );
    }


    @Override
    public void onStart() {
        super.onStart();
        textView = (TextView) findViewById(R.id.methodView);
        StringBuffer sb = new StringBuffer();
        sb.append(textView.getText()).append(getResources().getString(R.string.FUNC_START) + "\n");
        textView.setText(sb);

        Log.d(TAG, "onStart() called");
    }

    @Override
    public void onPause() {
        super.onPause();
        textView = (TextView) findViewById(R.id.methodView);
        StringBuffer sb = new StringBuffer();
        sb.append(textView.getText()).append(getResources().getString(R.string.FUNC_PAUSE) + "\n");
        textView.setText(sb);
        Log.d(TAG, "onPause() called");
    }

    @Override
    public void onResume() {
        super.onResume();
        textView = (TextView) findViewById(R.id.methodView);
        StringBuffer sb = new StringBuffer();
        sb.append(textView.getText()).append(getResources().getString(R.string.FUNC_RESUME) + "\n");
        textView.setText(sb);
        Log.d(TAG, "onResume() called");
    }

    @Override
    public void onStop() {
        super.onStop();
        textView = (TextView) findViewById(R.id.methodView);
        StringBuffer sb = new StringBuffer();
        sb.append(textView.getText()).append(getResources().getString(R.string.FUNC_STOP) + "\n");
        textView.setText(sb);
        Log.d(TAG, "onStop() called");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        textView = (TextView) findViewById(R.id.methodView);
        StringBuffer sb = new StringBuffer();
        sb.append(textView.getText()).append(getResources().getString(R.string.FUNC_DESTROY) + "\n");
        textView.setText(sb);
        Log.d(TAG, "onDestroy() called");
    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        textView = (TextView) findViewById(R.id.methodView);
        StringBuffer sb = new StringBuffer();
        sb.append(textView.getText()).append(getResources().getString(R.string.FUNC_SAVEINSTANCESTATE) + "\n");
        textView.setText(sb);
        Log.d(TAG, "onSaveInstanceState() called");
    }

    @Override
    public void onRestoreInstanceState(Bundle RestoreInstanceState) {
        super.onRestoreInstanceState(RestoreInstanceState);
        textView = (TextView) findViewById(R.id.methodView);
        StringBuffer sb = new StringBuffer();
        sb.append(textView.getText()).append(getResources().getString(R.string.FUNC_RESTOREINSTANCESTATE) + "\n");
        textView.setText(sb);
        Log.d(TAG, " onRestoreInstanceState() called");
    }


}
