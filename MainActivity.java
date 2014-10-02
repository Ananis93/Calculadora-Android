package com.cutonala.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements OnClickListener{
	
	private Button btn0;
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;
	private Button btn5;
	private Button btn6;
	private Button btn7;
	private Button btn8;
	private Button btn9;
	private Button Suma;
	private Button Resta;
	private Button Multiplicacion;
	private Button Division;
	private Button igual;
	private Button punto;
	private Button borrar;
	
	boolean decimal = false;
	boolean suma = false;
	boolean resta = false;
	boolean multi = false;
	boolean div = false;
	
	Double[] numero1 = new Double [20];
	Double resultado;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.btn0=(Button)findViewById(R.id.btn0);	
		this.btn1=(Button)findViewById(R.id.btn1);	
		this.btn2=(Button)findViewById(R.id.btn2);
		this.btn3=(Button)findViewById(R.id.btn3);	
		this.btn4=(Button)findViewById(R.id.btn4);
		this.btn5=(Button)findViewById(R.id.btn5);	
		this.btn6=(Button)findViewById(R.id.btn6);	
		this.btn7=(Button)findViewById(R.id.btn7);	
		this.btn8=(Button)findViewById(R.id.btn8);
		this.btn9=(Button)findViewById(R.id.btn9);	
		this.Suma=(Button)findViewById(R.id.btnsuma);	
		this.Resta=(Button)findViewById(R.id.btnresta);	
		this.Multiplicacion=(Button)findViewById(R.id.btnmultiplicar);	
		this.Division=(Button)findViewById(R.id.btndivicion);	
		this.igual=(Button)findViewById(R.id.btnigual);	
		this.punto=(Button)findViewById(R.id.btnpunto);
		this.borrar=(Button)findViewById(R.id.btnborrar);	
		
		btn0.setOnClickListener(this);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
		btn5.setOnClickListener(this);
		btn6.setOnClickListener(this);
		btn7.setOnClickListener(this);
		btn8.setOnClickListener(this);
		btn9.setOnClickListener(this);
		Suma.setOnClickListener(this);
		Resta.setOnClickListener(this);
		Multiplicacion.setOnClickListener(this);
		Division.setOnClickListener(this);
		igual.setOnClickListener(this);
		punto.setOnClickListener(this);
		borrar.setOnClickListener(this);

	}

 public void onClick(View v){
	 
	 TextView pantalla = (TextView)findViewById(R.id.numeros);
	 int seleccion = v.getId();
	 String a = pantalla.getText().toString();
	 
	 try{
	 switch(seleccion){
	 
	 case R.id.btn0:
		 pantalla.setText(a+"0");
		 break;
	 case R.id.btn1:
		 pantalla.setText(a+"1");
		 break;
	 case R.id.btn2:
		 pantalla.setText(a+"2");
		 break;
	 case R.id.btn3:
		 pantalla.setText(a+"3");
		 break;
	 case R.id.btn4:
		 pantalla.setText(a+"4");
		 break;
	 case R.id.btn5:
		 pantalla.setText(a+"5");
		 break;
	 case R.id.btn6:
		 pantalla.setText(a+"6");
		 break;
	 case R.id.btn7:
		 pantalla.setText(a+"7");
		 break;
	 case R.id.btn8:
		 pantalla.setText(a+"8");
		 break;
	 case R.id.btn9:
		 pantalla.setText(a+"9");
		 break;
	 case R.id.btnsuma:
		 suma = true;
		 numero1[0] = Double.parseDouble(a);
		 pantalla.setText("");
		 break;
	 case R.id.btnresta:
		 resta = true;
		 numero1[0] = Double.parseDouble(a);
		 pantalla.setText("");
		 break;
	 case R.id.btnmultiplicar:
		 multi = true;
		 numero1[0] = Double.parseDouble(a);
		 pantalla.setText("");
		 break;
	 case R.id.btndivicion:
		 div = true;
		 numero1[0] = Double.parseDouble(a);
		 pantalla.setText("");
		 break;
	 case R.id.btnigual:
		 numero1[1] = Double.parseDouble(a);
		 
		 if(suma == true){
			 resultado = numero1[0] + numero1[1];
			 pantalla.setText(String.valueOf(resultado));
					 
		 }else if(resta == true){
			 resultado = numero1[0] - numero1[1];
			 pantalla.setText(String.valueOf(resultado));
			 
		 }else if(multi == true){
			 resultado = numero1[0] * numero1[1];
			 pantalla.setText(String.valueOf(resultado));
			 
		 }else if(div == true){
			 resultado = numero1[0] / numero1[1];
			 pantalla.setText(String.valueOf(resultado));
			 
		 }
		 break;
	 case R.id.btnpunto:
		 if(decimal == false){
			 pantalla.setText(a+".");
		 decimal = true;
		 }else{return;}
		 break;
	 case R.id.btnborrar:
		 pantalla.setText("");
		 break;
	 }
	 }catch(Exception e){
	 
		 pantalla.setText("Error");
     };
	 
 }
 

	
	
}