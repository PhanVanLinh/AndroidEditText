package toong.vn.androidedittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private Button btnEnableDisableEditText;
    private Button btnFocusEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);

        btnEnableDisableEditText = findViewById(R.id.button_enable_disable_edittext);
        btnFocusEditText2 = findViewById(R.id.button_focus_edittext_2);

        btnEnableDisableEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.isFocusable()) {
                    editText1.setFocusable(false);
                } else {
                    editText1.setFocusableInTouchMode(true);
                }

                editText2.setEnabled(!editText2.isEnabled());
            }
        });

        btnFocusEditText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.requestFocus();
            }
        });
    }
}
