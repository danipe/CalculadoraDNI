package Logica;

import java.util.Scanner;

/*
 * By Paco Gomez
 * Esta clase realiza el calculo
 * 
 * */
public class CalcularLetra {
 
 private String dni="0";
 private char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
 private char letra=' ';
 private int resto = 0;
 
 //El constructor recibe el DNI en formato String
 public CalcularLetra(String dni) {
  if(dni.length()==8 && isNumeric(dni)){
	  this.dni=dni;
  }
 }
 
 //Realiza el calculo
 public char devolverLetra(){
	 int num = Integer.parseInt(this.dni);
	 this.resto=num%23;
	 this.letra=this.letras[this.resto];
  return this.letra;
 }

 public boolean isNumeric(String s){
	try {
		Integer.parseInt(s);
	} catch (Exception e) {
		return false;
	}
	return true;
	 
 }
}