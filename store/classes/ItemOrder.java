package store.classes;

import java.io.Serializable;

public class ItemOrder implements Item, Serializable{
   private String itemID;
   private int quantity;
   private double price;
   
   public ItemOrder(String id, int quantity, double price){
      itemID=id;
      this.quantity=quantity;
      this.price=price;}  
//////////////****************
   public void addItem(){
      quantity++; 
      System.out.println("add item is Successfully");        
   }

   public void removeItem(){ 
      if(quantity!=0) 
         System.out.println("There is no item ");
       else 
       quantity--;
      System.out.println("it is  removed Successfully");     
   }
/////////**********************
   public String getitemID(){
      return itemID;}
   public double getPrice(){
      return price;}
/////////////////
   public int getQuantity() {
      return quantity;}
//////////////
   public void setPrice(double p){price=p;}
   public String toString(){
      return "itemID :"+itemID+" quantity :"+quantity+" price: "+price;
   }}