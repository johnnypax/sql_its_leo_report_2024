package com.ferramenta.lez00_gestore_clienti;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	int a = 5;
//    	
//    	int b;
//    	b = 10;
//    	b = 20;
//    	
//    	System.out.println(b);
    	
//    	String nome = "Giovanni";
//    	String cognome = "Pace";
//    	
//    	String nominativo = nome + " " + cognome;
//    	System.out.println(nominativo);
    	
//    	String prod = "55 OR 1=1";
//    	String query = "SELECT * FROM Prodotto WHERE prodottoID = " + prod;
//    	
//    	System.out.println(query);
    	
    	//---------------------------------------------------------------------
    	
    	Bottiglia uno = new Bottiglia();
    	uno.setCapacita(-0.5f);
    	System.out.println( uno.getCapacita() );
    	
    	Bottiglia due = new Bottiglia();
    	due.setCapacita(0.5f);
    	System.out.println( due.getCapacita() );
    	
    	
    }
}