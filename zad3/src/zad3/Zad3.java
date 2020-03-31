/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 *
 * @author pawel
 */
public class Zad3 {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        /*
        //zad1
        Set<String> zbiorDni = new TreeSet<>();
       // Set<String> zbiorDni = new HashSet<>();
        zbiorDni.add("poniedziałek");
        zbiorDni.add("wtorek");
        zbiorDni.add("środa");
        zbiorDni.add("czwartek");
        zbiorDni.add("piątek");
        zbiorDni.add("sobota");
        zbiorDni.add("niedziela");    
        System.out.println(zbiorDni);
   //fukncja TreeSet gwarantuje nam dodatkowe a hashSet jest podstawową implementacja która jest nzacznie szybsza od treeset'a
   //Funkcji hashSet możemy użyć do działań podstawowych takich jak: dodawanie,usuwane a treeset'a jak chcemy żeby elementy były posortowane rosnąco lub malejąco
   // trzeba było dodać  "import java.util.TreeSet;" to jest jedyna zmiana w kodzie którą musimy dodać żeby z hashset zmieniać na treeset'a
   */
        
   /*
   //zad2
    Map<String, String> dniTygodnia = new HashMap<>();
    dniTygodnia.put("pn", "poniedziałek");
    dniTygodnia.put("wt", "wtorek");
    dniTygodnia.put("śr", "środa");
    dniTygodnia.put("czw", "czwartek");
   
    //String dzien = dniTygodnia.get("wt");
    //System.out.println("Skrót 'wt' oznacza: " + dzien);
   
    Map<Integer, List<Student>> grupy = new HashMap<>();
    
     List<Student> grupa32a = new ArrayList<>();
     grupa32a.add(new Student("Pawel", "Kolis", "kol@wi.zut.edu.pl", "32a"));
     grupa32a.add(new Student("Weronika", "Wolis", "Werka@wi.zut.edu.pl", "32a"));
     List<Student> grupa35 = new ArrayList<>();
     grupa35.add(new Student("Kacper", "Wojaas", "wojtas@wi.zut.edu.pl", "35"));
     grupa35.add(new Student("Bartosz", "Masny", "masny@wi.zut.edu.pl", "35"));
     grupy.put(32, grupa32a);
     grupy.put(35, grupa35);
    
     
      List<Student> Grupa_Wlasciwa = grupy.get(32);
      
      for(int i=0; i<Grupa_Wlasciwa.size( ); i++)
      {
        Student numer_1 = Grupa_Wlasciwa.get(i);
        System.out.println(numer_1.toString());   
      }
    */
        List<String> Categorys_list = new ArrayList<>();
        List<Product> Products_list = new ArrayList<>();
        Map<Integer, Product> Products_id = new HashMap<>();
        Map<String, List<Product>> Products_Category = new HashMap<>();
        //zad3
       try(BufferedReader in = new BufferedReader(new FileReader("plik.txt"))) 
       {
            var s = in.readLine();
            Product temp2;
            for(;s!=null;)
            {
                var temp = s.split(";");
                temp2 = new Product(temp[0], temp[1], temp[2],Double.parseDouble(temp[3]));
                boolean add = Products_list.add(temp2);

                if (!Categorys_list.contains(temp[2])) 
                    Categorys_list.add(temp[2]);

               

                Products_id.put(Integer.parseInt(temp[0]), temp2);
                s = in.readLine();
            }
        } catch (IOException ex) 
        {
            ex.printStackTrace();
        }
        
        
        List<Product>[] ListsOfProduct;
        ListsOfProduct = new ArrayList[Categorys_list.size()];
        for (int i = 0; i < Categorys_list.size(); i++) 
        {
        ListsOfProduct[i]= new ArrayList<>();
        }
        
        
        Products_list.forEach(new Consumer<Product>() 
        {
            @Override
            public void accept(Product produkt) {
                var temp3 = Categorys_list.indexOf(produkt.GetCategory());
                ListsOfProduct[temp3].add(produkt);
                Products_Category.put(Categorys_list.get(temp3), ListsOfProduct[temp3]);
            }
        });
        
        System.out.println(Products_Category);
        System.out.println("\n");
        System.out.println(Products_id );
    }   
}
