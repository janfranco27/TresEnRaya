package com.example.tresenraya;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class Juego extends Activity{
	Tablero tablero;
	
	//0 juego finalizado porque hay ganador
	//1 jugador 1
	//2 jugador 2
	int turno;
	int ganador;
	public OnClickListener createCeldaOnClickListener()
	{
		return new OnClickListener(){
			
			@Override
			public void onClick(View v) {
				
				
				ImageButton ib=(ImageButton)v;
				int posicion=ib.getId();
				
				if(turno!=0)
				{
					if(turno==1)
					{
						if(tablero.getEstadoCelda(posicion)==0)
						{
							tablero.setX(posicion);
							turno=2;
							if(tablero.hayGanador(1))
							{
								ganador=1;
								turno=0;
							}
						}
						else
							Toast.makeText(getApplicationContext(), "CASILLA OCUPADA", Toast.LENGTH_SHORT).show();
					}
					else
					{
						if(tablero.getEstadoCelda(posicion)==0)
						{
							tablero.setO(posicion);
							turno=1;
							if(tablero.hayGanador(2))
							{
								ganador=2;
								turno=0;
							}
						}
						else
							Toast.makeText(getApplicationContext(), "CASILLA OCUPADA", Toast.LENGTH_SHORT).show();
						
					}
				}
				if(tablero.tableroLleno())
				{
					ganador=0;turno=0;
					Log.d("Tablero lleno","hay empate");
				}
				if(turno==0)
				{
					Log.d("TURNO 0","El turno es 0");
					//verifico si el jugador anterior gano el juego
					if(ganador==1)
						Toast.makeText(getApplicationContext(), "GANA JUGADOR 1", Toast.LENGTH_SHORT).show();
					else if (ganador==2)
						Toast.makeText(getApplicationContext(), "GANA JUGADOR 2", Toast.LENGTH_SHORT).show();
					else if (ganador==0)
						Toast.makeText(getApplicationContext(), "EMPATE", Toast.LENGTH_SHORT).show();
				}
				
				
			}
	    };
	}
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		OnClickListener celdaClick = createCeldaOnClickListener();
	    ArrayList<Celda> celdas=new ArrayList<Celda>();
	    celdas.add(new Celda((ImageButton)findViewById(R.id.imageButton1),celdaClick));
	    celdas.add(new Celda((ImageButton)findViewById(R.id.imageButton2),celdaClick));
	    celdas.add(new Celda((ImageButton)findViewById(R.id.imageButton3),celdaClick));
	    celdas.add(new Celda((ImageButton)findViewById(R.id.imageButton4),celdaClick));
	    celdas.add(new Celda((ImageButton)findViewById(R.id.imageButton5),celdaClick));
	    celdas.add(new Celda((ImageButton)findViewById(R.id.imageButton6),celdaClick));
	    celdas.add(new Celda((ImageButton)findViewById(R.id.imageButton7),celdaClick));
	    celdas.add(new Celda((ImageButton)findViewById(R.id.imageButton8),celdaClick));
	    celdas.add(new Celda((ImageButton)findViewById(R.id.imageButton9),celdaClick));
		tablero=new Tablero(celdas);
		turno=1;
	}
	
	public void reinicio(View v)
	{
		tablero.reiniciaTablero();
		turno=1;
		ganador=0;
	}
}
