
/**
 * Write a description of class TIENDA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Tienda
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int tienRopa;
        RopaPOO[] laRopa = new RopaPOO[50];
        String talla, importada, nacional, hombre, mujer, monto;
        
        
        
        System.out.println("Digite la talla de la ropa. ");
        tienRopa = sc.nextInt();
        for(int i = 0; i < tienRopa; i++){
            System.out.println("Digite si la quiere importada: ");
            importada = sc.next();
            System.out.println("Digite si la quiere nacional: ");
            nacional = sc.next();
            System.out.println("Digite si es hombre: ");
            hombre = sc.next(); 
            System.out.println("Digite si es mujer: ");
            mujer = sc.next();
            System.out.println("Digite el monto comprado: ");
            monto  = sc.next();
            
            RopaPOO tienda = new RopaPOO();
            tienda.importada = importada;
            tienda.nacional = nacional;
            tienda.hombre = hombre;
            tienda.mujer = mujer;
            tienda.monto = monto;
            laRopa = laRopa;
        }
        
        for(int i = 0; i < tienRopa; i++){
            String sum = (laRopa[i].hombre + laRopa[i].mujer + laRopa[i].monto);
        }
        
        System.out.println("Las ventas de la tienda de ropa ");
        
    }
}
