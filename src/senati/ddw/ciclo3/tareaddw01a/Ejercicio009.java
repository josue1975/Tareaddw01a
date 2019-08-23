package senati.ddw.ciclo3.tareaddw01a;

import java.util.Scanner;
public class Ejercicio009 {     
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);         
System.out.println("Introduce un caracter ASCII");         
char caracter = sc.next().charAt(0);         
//Pasamos el caracter a codigo        
int codigo = (int) caracter;         
System.out.println(codigo);     

}
}