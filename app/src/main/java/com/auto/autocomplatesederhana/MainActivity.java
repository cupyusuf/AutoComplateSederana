package com.auto.autocomplatesederhana;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements
    TextWatcher{
    /** Called when the activity is firs created. */

    TextView hasil;
    AutoCompleteTextView edit;
    String[] item = { "Merbabu", "Merapi", "lawu", "Rinjani", "Sumbing",
            "Sindoro", "Krakatau", "Selat Sunda", "Selat Bali", "Selat Malaka",
            "Kalimantan", "Sulawesi", "Jawa" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hasil = (TextView) findViewById(R.id.hasil);
        edit = (AutoCompleteTextView) findViewById(R.id.edit);
        edit.addTextChangedListener(this);
        edit.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, item));
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            /** Not Used */
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
            hasil.setText(edit.getText());
    }

    @Override
    public void afterTextChanged(Editable s) {
        /** Not Used */
    }
}
