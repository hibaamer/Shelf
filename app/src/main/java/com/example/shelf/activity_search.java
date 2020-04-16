/*package com.example.shelf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class activity_search extends AppCompatActivity implements AdapterView.OnItemClickListener {


// implement bookmarks data base here
    EditText editText;
    ListView lst;
    ArrayAdapter<String>ArrayAdapter;
    String [] Courses ={"عال١٤٠","عال١٠٤","عال١٤١","عال١٠٦","عال٢٤٢", "عال٢٢٤","عال٣٢٢","عال٣٣٠","عال٢٢٠","عال٢٢١","عال٢١٥"
            ,"عال٣١٠","عال٣٤٤","عال٣٧٠","عال٣٩١","عال٤٧١","عال٤٩٤","عال٤٥٢","عال٤٢٩","عال٣٤٠","عال٤٠٢","عال٤٥١",
            "عال٤١٢","عال٤٥٠","عال٤٤٥","عال٤٣٢","عال٤٩٢","عال٤٠١","عال٤٨٠","عال٤٦١","عال٤٢٣","عال٤٦٣","عال٤٤٨",
            "عال٤٣٨","عال٤٣٠","عال٤٦٥","عال٤٦٢","عال٤٣٩","عال٤٠٣","عال٤٣٧","عال٤٦٦","عال٤٩٣","عال٤١١",

            "دال١٥١","دال١٠١","دال٢١١","دال٢٠١","دال٢٧١","دال٢٦١","دال٣٢١","دال٣٠١","دال٣١١","دال٤٨١","دال٤٦١"
            ,"دال٣٧١","دال٣٣٠","دال٣٦١","دال٣٩١","دال٣٨١","دال٤٢١","دال٤٠١","دال٤١١","دال٤٧١","دال٤٥١"

            ,"دام٢١١","دام٢٣١","دام٢١٣","دام٢١٢","دام٣٢١","دام٣١٤","دام٣٢٢","دام٣٢٣","دام٣١٥","دام٣٤١","دام٣٧١","دام٣٥١",
            "دام٤٨٢","دام٣٩٩","دام٤٦١","دام٤٢٥","دام٤١٦","دام٤٧٢","دام٤٤٢","دام٤٨١","دام٤٨٣","دام٤٧٣","دام٤٢٤","دام٤٨٤"
            ,"دام٤٣٣","دام٤٣٢","دام٤٦٢"

            ,"تال٢٨٠","تال٢٨١","تال٣٠٠","تال٣٢٠","تال٣٦٠","تال٣٠١","تال٣٤٠","تال٣٩٠","تال٤٢٠","تال٤٩٠","تال٤١١"
            ,"تال٣١٠","تال٣١١","تال٣٠٣","تال٣٢١","تال٣٣٠","تال٣١٣","تال٣٤١","تال٤١٢","تال٣٢٢","تال٤٩١","تال٣٣١","تال٤١٣"
            ,"تال٣٢٣","تال٤٩٢","تال٣٤٢","تال٤١٥","تال٣٣٢","تال٣٧٢","تال٣٧٠","تال٣٧١","تال٤١٠","تال٤٩٣","تال٤١٤"


            ,"نال٢٠٠","نال٣٢٠","نال٣٩٤","نال٣٧١","نال٣٠٩","نال٣٣٢","نال٣٩١","نال٢٠٣","نال٤٩٧","نال٤٠٠",
            "نال٣٩٥","نال٤٣٣","نال٤٤١","نال٤٩٨","نال٣٩٦","نال٣٩٧","نال٤١٤"}; //****************



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
// when you done with class tell me to create bookmarks db table!!!!

        editText = findViewById(R.id.editText);
        lst = findViewById(R.id.listView);

        ArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Courses);
        lst.setAdapter(ArrayAdapter);
        lst.setOnItemClickListener(this);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                activity_search.this.ArrayAdapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView tv = (TextView)view;
        Toast.makeText(this, tv.getText(), Toast.LENGTH_SHORT).show();
    }
}
*/