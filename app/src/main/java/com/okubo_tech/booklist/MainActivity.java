package com.okubo_tech.booklist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.start;
import static com.okubo_tech.booklist.R.id.search_word;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button searchButton = (Button) findViewById(R.id.search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the anime View is clicked on.
            @Override
            public void onClick(View view) {
                // Find the View that shows the anime category
                EditText searchWordField = (EditText) findViewById(R.id.search_word);
                Editable searchWordEditable = searchWordField.getText();
                String search_word = searchWordEditable.toString();

                // start New Activity.
                Intent searchResultIntent = new Intent(MainActivity.this, SearchResultActivity.class);
                searchResultIntent.putExtra("search_word", search_word);
                startActivity(searchResultIntent);
            }
        });

    }
}
