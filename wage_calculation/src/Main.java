
import java.util.Scanner;

/*
According to calculations milestone for cab fare
 */
public class Main {
    public static void main(String[] args) {
        
        
        
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("ulaşmak istediğiniz yer kaç kilometre uzaka bulunmakta ?? : ");
        double klmtr = scn.nextDouble();
        double sarı_taksi = 5.00;
        double turkuaz_taksi = 5.75;
        double turkuaz_kılometre = 3.60;
        double sarı_kılometre = 3.10;
        
        double result_turkuaz = (turkuaz_taksi +(klmtr*turkuaz_kılometre));
        double result_sarı = (sarı_taksi+(klmtr*sarı_kılometre));
        System.out.println("Sarı taksi için ödenecek tutar " +result_sarı);
        System.out.println("Turkuaz taksi için ödenecek tutar" +result_turkuaz);
        
        
        
    }
    
}
