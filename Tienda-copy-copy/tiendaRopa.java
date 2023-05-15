
/**
 * Write a description of class tiendaRopa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class tiendaRopa
{
    public static void main(String[] args){
        
        int NUM = 50;
        Scanner sc = new Scanner(System.in);
        String[] talla = new String[20];
        String[] importada = new String[20];
        String[] nacional = new String[20];
        String[] hombre = new String[20];
        String[] mujer = new String[20];
        String[] monto = new String[20];
        int tiendaRopa = 0;
        String tallas, importadas, nacionales, hombres, mujeres, montos;
        
        System.out.println("Digite la talla : ");
        tallas = sc.next();
        
        for(int i = 0; i < tiendaRopa; i++){
            System.out.println("Digite si la quiere importada: ");
            importadas = sc.next();
            System.out.println("Digite si la quiere nacional: ");
            nacionales = sc.next();
            System.out.println("Digite si es hombre: ");
            hombres = sc.next();
            System.out.println("Digite si es mujer: ");
            mujeres = sc.next();
            System.out.println("Digite el monto comprado: ");
            montos  = sc.next();
        
            importada = importada;
            nacional = nacional;
            hombre = hombre;
            mujer = mujer;
            monto = monto;
        }
        
        System.out.println("La tieda de ropa fue evaluada: ");
        
        for(int i = 0; i < tiendaRopa; i++){
            System.out.println("Talla: " + talla);
            System.out.println("Importada: " + importada);
            System.out.println("Nacional: " + nacional);
            System.out.println("Hombre: " + hombre);
            System.out.println("Mujer: " + mujer);
            System.out.println("Monto: " + monto + "\n");
        }
        
        System.out.println("\n\nLas ventas de la tienda de ropa ");
    }
     
}
