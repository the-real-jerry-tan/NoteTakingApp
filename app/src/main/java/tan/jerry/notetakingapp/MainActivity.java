/**
 * © 2024 Jerry Tan. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Jerry Tan
 * ("Confidential Information"). You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms under which this software
 * was distributed or otherwise published, and solely for the prior express purposes
 * explicitly communicated and agreed upon, and only for those specific permissible purposes.
 *
 * This software is provided "AS IS," without a warranty of any kind. All express or implied
 * conditions, representations, and warranties, including any implied warranty of merchantability,
 * fitness for a particular purpose, or non-infringement, are disclaimed, except to the extent
 * that such disclaimers are held to be legally invalid.
 *
 * This is the main activity source file for the NoteTakingApp project.
 */
package com.example.notetakingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.SharedPreferences;

public class MainActivity extends AppCompatActivity {

    private EditText noteEditText;
    private Button saveButton;
    private TextView savedNoteTextView;

    // The key we'll use to store the note in SharedPreferences
    private static final String NOTE_KEY = "note_key";

    // SharedPreferences is used to save the note data across app sessions
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Binding UI elements from the XML layout file
        noteEditText = findViewById(R.id.noteEditText);
        saveButton = findViewById(R.id.saveButton);
        savedNoteTextView = findViewById(R.id.savedNoteTextView);

        // Get the SharedPreferences instance for this app
        sharedPreferences = getSharedPreferences("NoteTakingAppPrefs", MODE_PRIVATE);

        // Load the previously saved note (if exists) when the app starts
        String savedNote = sharedPreferences.getString(NOTE_KEY, "");
        if (!savedNote.isEmpty()) {
            savedNoteTextView.setText(savedNote); // Display the saved note
        }

        // Set up the onClick listener for the save button
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Grab the text from the EditText input field
                String noteText = noteEditText.getText().toString();

                // Save the note in SharedPreferences so it persists even after closing the app
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(NOTE_KEY, noteText);
                editor.apply();

                // Display the saved note on the screen
                savedNoteTextView.setText(noteText);

                // Optional: Clear the EditText after saving the note
                noteEditText.setText("");
            }
        });
    }
}
