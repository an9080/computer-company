package store.classes;

import java.io.*;
import java.util.Date;
public class Customer {
   private String name;
   private String ID;
   private String password;
   public static int numOfOrders = 0;
   Order orders [];
   private Order confirmed ;
   
      public Customer(String n,String ID,String p){
      name = n;
      this.ID = ID;
      password = p;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getID() {
      return ID;
   }

   public void setID(String iD) {
      ID = iD;
   }

   public void displayOrderHistory(){
      for (int i=0 ; i < orders.length ; i++)
         System.out.println(orders[i]);
   }

   public void displayCurrentOrder(){
   	System.out.println(confirmed);   	
   }

   public boolean saveCurrentOrdrer() {

        PrintWriter writer = null;
        try {

            File file = new File("currentOrder.txt");

            if (!file.exists()) {

                file.createNewFile();
            }

            writer = new PrintWriter(new FileOutputStream(file));

            String data = confirmed.toString().replace("<html>", "");
            data = data.replace("<br>", "\n");
            data = data.replace("</html>", "");
            writer.println(data);

            return true;//process completed !

        } catch (FileNotFoundException ex) {

            return false;
        } catch (IOException ex) {

            return false;

        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

   
   public String getName(){
   return name;}
   
   public Order getcurrent(){
   return confirmed;}
   
   public void setcurrent(Order o){
   confirmed = o;}
   
   public void setOrder(Order f){
   for (int i=0 ; i < orders.length ; i++)
   orders[numOfOrders++] = new Order(f.getorderID(),new Date(),numOfOrders,f.getCountry());}

   public Order[] getorders(){
   return orders;}

   public String toString(){
      return "Name: "+name+"\tID: "+ID+"\tpassword: "+password+"\nThe number of order:"+numOfOrders;
   }
}


