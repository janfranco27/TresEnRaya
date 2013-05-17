package com.example.tresenraya;

import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Celda {

	//estado 0 vacio
	//estado 1 x
	//estado 2 o
	private int estado;
	ImageButton ib;
	public Celda(ImageButton ib,OnClickListener celdaClick)
	{
		this.ib=ib;
		this.estado=0;
		ib.setImageResource(R.drawable.fondo2);
		ib.setOnClickListener(celdaClick);
	}
	public int getId()
	{
		return ib.getId();
	}
	public void setEstado(int estado)
	{
		this.estado=estado;
		if(estado==1)
			ib.setImageResource(R.drawable.x);
		else if(estado==2)
			ib.setImageResource(R.drawable.o);
	}
	public int getEstado()
	{
		return estado;
	
	}
	public void reiniciar()
	{
		ib.setImageResource(R.drawable.fondo2);
		estado=0;
	}
}
