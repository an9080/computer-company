/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.classes;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class textproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
package store.classes;

/**
 *
 * @author العنود
 */
   static Scanner read=new Scanner(System.in);
  public static void main (String[]args)throws IOException,ClassNotFoundException{
  
  Store store= new Store("ELECTRO");
  String name,Id,password,brand,s;
  int numOfOrders;
 boolean flag=true;
 Customer c1=null;
 try
     
 {
 for(int i=0;i<2;i++){
 try{
 System.out.println(" Enter your Name");
 name=read.next();
 System.out.println(" Enter your ID");
Id=read.next();
 System.out.println(" Enter your Password");
 password=read.next();
 c1=new Customer(name,Id,password);
 if(store.login(Id,password))
 System.out.println(" Done Login");
 if(store.registerUser(name,Id,password))
 System.out.println("************display by type**************");
 System.out.println(store.displaybyType(1));
 System.out.println("Enter the brand: ");
 brand=read.next();
 System.out.println(store.displaybyBrand(brand));
 //System.out.println(store.displayAvibleItems ());
 ////////////////////////////////////////
 //if(store.placeOrder(Id,
 System.out.println("");
 String[] it;
 
 System.out.println("How many Items do you want?");
 int size=read.nextInt();
 it=new String[size];
 int[] qu=new int[size];
 System.out.println("Enter the Item id,quantity");
 for(int j=0;j<size;j++){
 String itid=read.next();
int quan=read.nextInt();
 it[j]=itid;
 qu[j]=quan;}
 System.out.println("Enter the country code");
 String code=read.next();
 boolean flagg=true;
 while(flag){
 if(store.placeOrder(Id,it,qu,code)){
 System.out.println("Do you want to cancel the order or confirm it? cancel:ca, confirm:co");
 String choice=read.next();
 if(choice.equalsIgnoreCase("ca"))
 if(store.cancelOrder(Id)){
 System.out.println("Order canceled");
 flagg=false;}
 if(choice.equalsIgnoreCase("co"))
 if(store.confirmOrder(Id)){
 System.out.println("order confirmed");
 flagg=false;}
 else
 System.out.println("Wrong choice");}
 else{
 System.out.println("The order can't be added");
 flagg=false;}
 }
 }
 catch( IndexOutOfBoundsException e){
 System.out.println(e.getMessage());
69 System.out.println(" Sorry Enter your Name ");
70 }
 
 catch(InputMismatchException e2){
 System.out.println(e2.getMessage());
 System.out.println(" Sorry Enter your Name ");
 name=read.next();}
 
 /*catch(Exception e3){
78 System.out.println(e3.getMessage());
79 System.out.println(" Sorry !");
80 }*/
 
 }
 
 }}
 
  
 
 


    /**
     * @param args the command line arguments

}

    }
    
}
