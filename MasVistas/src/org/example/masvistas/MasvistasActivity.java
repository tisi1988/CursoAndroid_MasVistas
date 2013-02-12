package org.example.masvistas;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MasvistasActivity extends Activity {
	//Atributos privados de la clase
	private EditText entrada;
	private TextView salida;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		//Obtenemos los objetos como Views, hay que hacer el cast correspondiente a cada uno
		entrada = (EditText) findViewById(R.id.entrada);
		salida = (TextView)  findViewById(R.id.salida);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void sePulsa(View view){
/*		Toast.makeText(this, //Contexto usado (la actividad) 
						"Pulsado", //Texto a mostrar en el Toast 
						Toast.LENGTH_SHORT //tiempo que el toast permanece en pantalla
						).show();   */
		salida.setText(String.valueOf(
			       Float.parseFloat(entrada.getText().toString())*2.0));
    }
	
	public void sePulsa0(View view){
		entrada.setText(entrada.getText()+
				(String)view.getTag()); //El tag es de tipo Object, por lo que hace falta un cast
    }

}
