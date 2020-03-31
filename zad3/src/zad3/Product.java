/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author pawel
 */


    public class Product {
    private String id;
    private String name;
    private String category;
    private double price;
  
    public Product(String id, String name,String category,double price) 
    {

        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;

    }
    
    
    
    public String GetCategory() 
    {
        return category;
    }
    
    
     @Override
    public String toString() 
    {
        return id + " " + name + " " + category + " " + price;
    }
        /*  
        List<String> ListOfCategory = new ArrayList<>();
        List<Product> ListOfProduct = new ArrayList<>();
        Map<Integer, Product> IdOfProduct = new HashMap<>();
        Map<String, List<Product>> CategoryOfProduct = new HashMap<>();
        */
}
