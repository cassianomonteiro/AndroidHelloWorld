package com.example.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Lifecycle method executed when (before) the screen is created
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Sets the XML in use by this controller class
        setContentView(R.layout.activity_main);

        // Get the reference of the TextView object using its ID
        TextView greetingText = findViewById(R.id.greetingText);

        // Set the text of the label to empty string
        greetingText.setText("");
    }

    /**
     * Method to be executed when the button is clicked. Must be linked to the button on the XML.
     * @param v: a reference to the View object (in this case, a button)
     */
    public void greetingButtonTap(View v) {

        // Get the reference of the TextView object using its ID
        TextView greetingText = findViewById(R.id.greetingText);

        // Get the reference of the EditText object using its ID
        EditText nameInput = findViewById(R.id.nameInput);

        // Set the text of the label using a string resource with a placeholder "%s"
        greetingText.setText(getResources().getString(R.string.greeting_text, nameInput.getText()));
    }

}
