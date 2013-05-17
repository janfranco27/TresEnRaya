package com.example.tresenraya;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Intent intent = new Intent(getApplicationContext(), Juego.class);
        startActivity(intent);
        
		/*ImageButton b1=(ImageButton)findViewById(R.id.imageButton1);
		b1.setImageResource(R.drawable.o);
		ImageButton b2=(ImageButton)findViewById(R.id.imageButton2);
		b2.setImageResource(R.drawable.x);
		
		ImageButton b3=(ImageButton)findViewById(R.id.imageButton3);
		b3.setImageResource(R.drawable.o);
		ImageButton b4=(ImageButton)findViewById(R.id.imageButton4);
		b4.setImageResource(R.drawable.fondo);
		ImageButton b5=(ImageButton)findViewById(R.id.imageButton5);
		b5.setImageResource(R.drawable.fondo);
		ImageButton b6=(ImageButton)findViewById(R.id.imageButton6);
		b6.setImageResource(R.drawable.fondo);
		ImageButton b7=(ImageButton)findViewById(R.id.imageButton7);
		b7.setImageResource(R.drawable.fondo);
		ImageButton b8=(ImageButton)findViewById(R.id.imageButton8);
		b8.setImageResource(R.drawable.fondo);
		ImageButton b9=(ImageButton)findViewById(R.id.imageButton9);
		b9.setImageResource(R.drawable.fondo);
		*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}

