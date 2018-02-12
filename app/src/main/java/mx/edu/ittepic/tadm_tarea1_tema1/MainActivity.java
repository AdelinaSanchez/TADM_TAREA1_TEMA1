package mx.edu.ittepic.tadm_tarea1_tema1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar numero;
    TextView resultado;
    Button calcular;
    int num, tot=0;
    String res="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero = findViewById(R.id.numero);
        resultado = findViewById(R.id.resultado);
        calcular = findViewById(R.id.calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(res);
            }
        });


        numero.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                num = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                res = "";

                for (int i = 1; i <= 20; i++) {
                    tot = num * i;
                    res += num + " x " + i + " = " + tot + "\n";
                }


            }
        });
    }
}
