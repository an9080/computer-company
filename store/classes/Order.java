package store.classes;

import java.util.Date;
import java.io.*;
public class Order implements Serializable{
   private String orderID; 
   private Date orderDate;
   private boolean orderCompleted;
   private double totalPrice;
   private String Country;
   private  ItemOrder [] iList;
   private int  numOfitems ;

   public Order(String id, Date d, int size, String country){
      orderID=id;
      orderDate=d;
      iList =new ItemOrder[size];
      Country=country;
      numOfitems = 0;
      totalPrice = 0.0;
      orderCompleted = false;
   }
/////////////
   public boolean addItemOrder(ItemOrder t){
      if(numOfitems<iList.length)
      {iList[numOfitems]=new ItemOrder(t.getitemID(),t.getQuantity(),t.getPrice()); 
         numOfitems++;
         return true ; }
      else 
         return false;
   }
/////////////////////////////*******************
   public boolean  removeItemOrder(String id){
      for(int i=0;i<numOfitems;i++){
         if(iList[i].getitemID().equals(id)){
            iList[i]=iList[i+1];
            iList[--numOfitems]=null;
         
            /*iList[i]=iList[numOfitems-1];
          List[--numOfitems]=null;*/ 
            return true ;
         }} 
      return false ;}

///////////////////

   public boolean IsCompleted(){ 
      if(orderCompleted)
         return true ;
      else
         return false ;}

///////////////////////////
   public void setTotalPrice(){
      for(int i=0;i<numOfitems;i++)
         totalPrice+=(iList[i].getQuantity())*(iList[i].getPrice());        
      totalPrice+=calculateShipping();
   }
/////////////////////******************************
   public void setStatus(boolean status){ 
      orderCompleted = status;}
///////////////////************************************
   public double calculateShipping(){
      double  cost=0 ;
      if(Country.equals("SA")){cost=100;}
      else 
         if(Country.equals("BH")){cost=260;}
         else
            if(Country.equals("KWT")){cost=300;}
            else 
               if(Country.equals("UAE")){cost=550;}
      return cost;
   }
/////////////////////

   public int  getNumOfitems(){
      return numOfitems;}
   public ItemOrder[] getitems(){
      return iList;}
   public String getorderID(){
      return orderID;}
   public Date getdate(){
      return orderDate;}
   public String getCountry(){
      return Country;}
   

   public String toString(){
      String str=" order ID: \n"+orderID+" order Date:\n"+orderDate+" Country:\n "+Country+" totalPrice: \n"+totalPrice;
      for(int i=0;i<numOfitems;i++)
         str+=iList[i];
      return str  ;}

    ItemOrder[] getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
