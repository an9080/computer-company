package store.classes;

import java.util.Date;
import java.io.*;
public class Store {
   private String storeName;
   private int numOfItems;
   private int numOfCustomers;
   public Customer [] customers;
   private TechnicalDevice [] has;
    public TechnicalDevice[] devices;
///////////////////////////////////////////////////////////////////////////////////////////
   public Store(String name) throws IOException, ClassNotFoundException{
      storeName = name;
      customers=new Customer [1000];
      has=new TechnicalDevice[1000];
      while(true){
         try{ 
     
      File T = new File("TechnicalDevices.txt");
      FileInputStream T1 = new FileInputStream(T);
      ObjectInputStream T2 = new ObjectInputStream(T1);
     has[numOfItems++] = (TechnicalDevice)T2.readObject();
      
     
   }catch(EOFException ee){
       break;
       }
      }}
//////////////////////////////////////////////////////////////////////////////////////////
   public boolean login(String id ,String password) {
      for(int i=0 ; i < numOfCustomers ; i++) {
         if(customers[i].getID().equals(id) && customers[i].getPassword().equals(password))
            return true;}
      return false;
   }
	////////////////////////////////////////////////////////////////////////////////////////
   public boolean registerUser(String name,String id,String password) {
      if(login(id,password))
         return false;
      if (numOfCustomers == customers.length) 
         return false; 
                                              
      customers[numOfCustomers++] = new Customer(name,id,password);
      return true;}
	
	/////////////////////////////////////////////////////////////////////////////////////////
   public String displaybyType(int t) {
      String Type ="";
      String tt ="";
      if(t == 1)
         Type = "DesktopComputer";
      if(t == 2)
         Type = "Labtop";
      if(t == 3)
         Type = "Tablet";
      if(t!=1 && t!=2 && t!=3)
         return null;
   
      for(int i=0 ; i < numOfItems ; i++)
         if(has[i] != null)
            if(has[i].getClass().getName().equals(Type))
               tt = has[i].toString();
      return tt;
   }
	//////////////////////////////////////////////////////////////////////
   public String displaybyBrand(String brandN) {
      String tt = "";
      for(int i=0 ; i < numOfItems ; i++)
         if(has[i] != null)
            if(has[i].getBrand().equals(brandN))
               tt = has[i].toString();
      return tt;
   }
	///////////////////////////////////////////////////////////////////////
   public String displayAvaiableItems(){
      String tt = "";
      for(int i=0 ; i < numOfItems ; i++)
         if(has[i].isAvaiable(has[i].quantity))
            tt = has[i].toString();
      return tt;}	
      ////////////////////////////////////////////////////////////////////////////
   public boolean placeOrder (String customerID , String [] itemID , int [] q , String c){
      int uncount=0;
      Order o;
      int cc=0;
      ItemOrder oi=null;

      int index=-1;
      for(int i=0;i<numOfCustomers;i++){
         if ((customers[i].getID()).equalsIgnoreCase(customerID))
            index=i;
      }
      if(index==-1){
         System.out.println("invalid customer id");
         return false;}
      String OrderID="order"+customers[index].numOfOrders;
      o=new Order(OrderID, new Date(), itemID.length, c);
      try{
         for(int i=0;i<itemID.length;i++){
            for(int j=0;j<numOfItems;j++){
               if(itemID[i].equalsIgnoreCase(has[j].getitemID()))
                  if(has[j].isAvaiable(q[i])){
                  
                     o.addItemOrder(new ItemOrder(itemID[i],q[i],has[j].getPrice()));
                     has[j].remove(q[i]);
                  }
                  else{ 
                     uncount++;
                  }
            }}}
      catch(NullPointerException e){
      }
      if(uncount==0){
         customers[index].setcurrent(o);
         return true;}
      
      else{
         String[] ii=new String[uncount];
         for(int i=0;i<itemID.length;i++){
            for(int j=0;j<has.length;j++)
               if(itemID[i]==has[j].getitemID())
                  if( !(has[j].isAvaiable(q[i])))
                     ii[cc++]=itemID[i];}
         for(int i=0;i<ii.length;i++)
            System.out.println(ii[i]);
      }
      return false;}

             
   public boolean cancelOrder(String customerID) {
      Customer customer = null;
      ItemOrder [] items = null;
      ItemOrder item = null;
      Order o = null;
      int quan = 0, j = 0;
   
      for(int i=0 ; i < numOfCustomers ; i++)
         if(customers[i].getID().equals(customerID))
            customer = customers[i];
         
      if (customer == null)
         return false;
         
      if (customer.getcurrent() == null)
         return false;
         
      items = customer.getcurrent().getID();
      if (items != null && items.length > 0)
         for (int i = 0 ; i < items.length ; i++){
            quan = items[i].getQuantity();
            while(j < quan ){
               item.addItem();
               j++; 
            }}
      customer.setcurrent(o);
      Customer.numOfOrders--;
      return true;}
      
	///////////////////////////////////////////////////////////////////////
   public boolean confirmOrder(String customerID) throws IOException {
      Customer customer = null;
      Order o = null;
      
      for (int i=0 ; i < numOfCustomers ; i++)
         if (customers[i].getID().equals(customerID))
            customer = customers[i];
         
      if (customer == null)
         return false;
         
      if (customer.getcurrent() == null)
         return false;
         
      customer.getcurrent().setStatus(true);
      customer.orders[--(customer.numOfOrders)] = customer.getcurrent();
      return true;
   }
        //////////////////////////////////////////////////////////////////////////	
   public Customer [] getUsers() {
      Customer [] users = new Customer [numOfCustomers];
      for (int i=0 ; i < numOfCustomers ; i++) {
         users [i++] = customers[i]; }
      return users;
   }
   
   //////////////////////////////////////////////////////////////////////////
   public String toString() {
      String str = "The store name: "+storeName+"\nThe number of items: "+numOfItems+"\nThe number of customers: "+numOfCustomers;
      for (int i=0 ; i < has.length ; i++)
         str += has[i];
      for (int j=0 ; j < customers.length ; j++)
         str += customers[j];
            
      return str;
   }

    public int getNumOfItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNumOfItems(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumOfCustomers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNumOfCustomers(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
