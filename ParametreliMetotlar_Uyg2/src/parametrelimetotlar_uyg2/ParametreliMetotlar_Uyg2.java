/* Kombinasyonların parametre alıp almadığını değer döndürüp döndürmediğini
ekrana yazdıran program.*/
package parametrelimetotlar_uyg2;

public class ParametreliMetotlar_Uyg2 {
    
    static void metot1() // 'metot1' Adında Metod Tanımlandı.
    {
        System.out.println("'Metot1' parametre almıyor ve değer döndürmüyor."); // Ekrana Yazdırıldı.  
    }
    
    static int metot2() // 'metot2' Adında Metod Tanımlandı.
    {
        System.out.println("'Metot2' parametre almıyor fakat değer döndürüyor."); // Ekrana Yazdırıldı.
        return 5; //Değer Döndürdük.
    }
    
    static void metot3(int a) // 'metot3' Adında Metod Tanımlandı.
    {
        System.out.println("'Metot3' parametre alıyor fakat değer döndürmüyor."); // Ekrana Yazdırıldı.  
    }
    
    static int metot4(int x) // 'metot4' Adında Metod Tanımlandı.
    {
        System.out.println("'Metot4' parametre alıyor ve değer döndürüyor."); // Ekrana Yazdırıldı.
        return x; //Değer Döndürdük.
    }

    public static void main(String[] args)
    // Dışarıdan değer alıcak metotlara değer atadık, almayan metotları boş bıraktık.
    {
     metot1(); 
     metot2();
     metot3(5);
     metot4(10);
    }
    
}
