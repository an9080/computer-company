package store.classes;

import java.io.Serializable;


public abstract class TechnicalDevice implements Item, Serializable {

   
   protected  String itemID; 
   protected  double displaySize; 
   protected  String processorType; 
   protected  int RAM; 
   protected  String color; 
   protected  double price; 
   protected  String brand; 
   protected  int quantity;  

   public TechnicalDevice(String ID, double size,String pType, int ram, String color,String b,double p, int q){
      itemID = ID;
      displaySize = size;
      processorType = pType;
      RAM = ram;
      this.color = color;
      brand = b;
      price = p;
      quantity = q;}

   public Boolean isAvaiable(int q){
      if(quantity == q)
         return true;
      return false;}

   public void add(int q){
      quantity += q;}
      
   public  boolean remove(int q){
      if(isAvaiable(q)){
         quantity = quantity - q;
         return true;}
      return false;}
      
   public int getQuantity (){
      return quantity;}
   public String getBrand(){
    return brand;
   }

    String getitemID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   }
