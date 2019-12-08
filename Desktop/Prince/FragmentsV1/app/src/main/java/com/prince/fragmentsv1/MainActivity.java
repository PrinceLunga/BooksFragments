package com.prince.fragmentsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

import Objects.Book;
import Objects.Books;

public class MainActivity extends AppCompatActivity {
    private List<Book> books = (new Books()).getBooks();
    private TextView name;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.txtName);
        text = findViewById(R.id.txtDetails);

        final RadioGroup radios = findViewById(R.id.bookGroup);
        radios.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                RadioButton radio = findViewById(checkedId);
                int n = Integer.parseInt(radio.getTag().toString()) -1;
                name.setText(books.get(n).getName());
                text.setText(books.get(n).getText());
            }
        });
    }
}
