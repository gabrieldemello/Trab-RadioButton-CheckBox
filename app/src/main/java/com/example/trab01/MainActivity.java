package com.example.trab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    CheckBox cbIng, cbEsp, cbAl, cbFr;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.rbGroup);
        cbIng = (CheckBox) findViewById(R.id.cbIngles);
        cbEsp = (CheckBox) findViewById(R.id.cbEspanhol);
        cbAl = (CheckBox) findViewById(R.id.cbAlemao);
        cbFr = (CheckBox) findViewById(R.id.cbFrances);
        submit = (Button) findViewById(R.id.btSubmit);

        submit.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v){
                validation();
            }
        });
    }
    public void validation(){

        int isSelected = radioGroup.getCheckedRadioButtonId();

        if(isSelected==-1){
            Toast.makeText(MainActivity.this, "Você não selecionou nenhum gênero", Toast.LENGTH_LONG).show();
            return;
        }
        if(!cbIng.isChecked() && !cbEsp.isChecked() && !cbAl.isChecked() && !cbFr.isChecked()){
        Toast.makeText(MainActivity.this, "Verifique qualquer um dos idiomas que você conhece", Toast.LENGTH_LONG).show();
        return;
        }
        Toast.makeText(MainActivity.this, "Sucesso", Toast.LENGTH_LONG).show();
    }
}