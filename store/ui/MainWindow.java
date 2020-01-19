package store.ui;

import java.awt.Color;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import store.classes.Customer;
import store.classes.DesktopComputer;
import store.classes.Laptop;
import store.classes.Store;
import store.classes.Tablet;
import store.classes.TechnicalDevice;


public class MainWindow extends javax.swing.JFrame {

    Store store;

    public MainWindow() throws IOException {

        initComponents();

        store = new Store("The Dreams Electronics Store");

        customSettings();
        
       /* File f = null;
      FileOutputStream os = null;
      ObjectOutputStream oos = null;
        try{
       
         
         
      TechnicalDevice t1=new DesktopComputer ("d1",27.0,"Intel Core i5",4,"white","Apple",5000.0,2,"CD burner");
   
      TechnicalDevice t2=new DesktopComputer ("d2",21.5,"Intel Core i3",8,"grey","HP",4000.0,4,"SuperMulti DVD Burner");
   
      TechnicalDevice t3=new DesktopComputer ("d3",19.5,"Intel Core i7",16,"black","Dell",3000.0,2,"CD burner");
   
      TechnicalDevice t4=new DesktopComputer ("d4",23.8,"Intel Core i5",32,"black","Apple",8000.0,4,"SuperMulti DVD Burner");
   
      TechnicalDevice t5=new DesktopComputer ("d5",23.8,"Intel Core i5",32,"black","Dell",6000.0,3,"SuperMulti DVD Burner");
   
      TechnicalDevice t6=new Laptop ("d6",13.3,"Intel Core i5",4,"white","Apple",7000.0,5,true,true);
   
      TechnicalDevice t7=new Laptop ("d7",14.0,"Intel Core i7",12,"black","Dell",5000.0,2,false,false);
   
      TechnicalDevice t8=new Laptop ("d8",15.6,"Intel Core i3",8,"white","Microsoft",4500.0,4,false,true);
   
      TechnicalDevice t9=new Laptop ("d9",17.3,"Intel Core i7",16,"gold","Apple",9000.0,3,true,false);
   
      TechnicalDevice t10=new Laptop ("d10",13.3,"Intel Core i3",8,"red","HP",6000.0,6,true,true);
   
      TechnicalDevice t11=new Tablet ("d11",8.0,"Intel Core i3",1,"grey","Apple",3000.0,4,1,"3G/4G");
   
      TechnicalDevice t12=new Tablet ("d12",9.7,"Intel Core i7",2,"grey","Samsung",2000.0,4,1,"3G/4G");
   
      TechnicalDevice t13=new Tablet ("d13",10.5,"Intel Core i7",3,"grey","Huawei",1500.0,4,1,"3G/4G");
   
      TechnicalDevice t14=new Tablet ("d14",12.9,"Intel Core i5",4,"grey","Apple",3500.0,4,1,"3G/4G");
   
      TechnicalDevice t15=new Tablet ("d15",8.0,"Intel Core i3",2,"grey","Samsung",1800.0,4,1,"3G/4G");
   
      f = new File ("TechnicalDevices.txt");
      os = new FileOutputStream (f);
      oos = new ObjectOutputStream(os);
      oos.writeObject(t1);
      oos.writeObject(t2);
      oos.writeObject(t3);
      oos.writeObject(t4);
      oos.writeObject(t5);
      oos.writeObject(t6);
      oos.writeObject(t7);
      oos.writeObject(t8);
      oos.writeObject(t9);
      oos.writeObject(t10);
      oos.writeObject(t11);
      oos.writeObject(t12);
      oos.writeObject(t13);
      oos.writeObject(t14);
      oos.writeObject(t15);
   
      oos.close();}
        catch(IOException e){}*/
   
        loadStoreData("TechnicalDevices.txt", "Customers.ser");
    }

    public final void customSettings() {

        this.getContentPane().setBackground(Color.decode("#E6E6E6"));
        this.setLocation(350,100);
    }

    private void loadStoreData(String productsFileName, String customerFileName) {

        if (!loadData("DEVICES", productsFileName)) {
            JOptionPane.showMessageDialog(this, "Error: Can't load productsinfo.\nplease try again.", "Error", JOptionPane.ERROR_MESSAGE);

        }
        if (!loadData("CUSTOMERS", customerFileName)) {

            JOptionPane.showMessageDialog(this, "Error: Can't load customers info.\nplease try again.", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        registerLoginBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Discover the latest in tech");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dreams Electronics Store");
        setResizable(false);
        setSize(new java.awt.Dimension(540, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(102, 102, 102));
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome to ELECTRO Stroe ");
        headerPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        getContentPane().add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 570, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/images/apple_450x310.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 510, 310));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Discover the latest in tech");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 280, 20));

        registerLoginBtn.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        registerLoginBtn.setForeground(new java.awt.Color(102, 102, 102));
        registerLoginBtn.setText("Register/Login");
        registerLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerLoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(registerLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerLoginBtnActionPerformed

        //open a new frame and pass the store object to take all the info of the store and customers from this object
        new LoginRegisterWindow(store).setVisible(true);

        this.dispose();
    }//GEN-LAST:event_registerLoginBtnActionPerformed

    //return Exception if you want what is the reason of the error 
    public boolean loadData(String type, String fileName) {

        File file = new File(fileName);

        try {

            if (!file.exists()) {
                file.createNewFile();
            }

            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(file));

            switch (type.toUpperCase()) {

                case "DEVICES":
                    while (true) {

                        try {

                            store.devices[store.getNumOfItems()] = (TechnicalDevice) ois.readObject();

                            System.out.println(store.devices[store.getNumOfItems()]);
                            store.setNumOfItems(1);//update counter of number of items

                        } catch (EOFException ex) {

                            break;
                        } catch (ClassNotFoundException ex) {
                            return false;
                        }

                    }
                    break;

                case "CUSTOMERS":
                    while (true) {

                        try {

                            store.customers[store.getNumOfCustomers()] = (Customer) ois.readObject();

                            store.setNumOfCustomers(1);

                        } catch (EOFException ex) {

                            break;
                        } catch (ClassNotFoundException ex) {

                            return false;
                        }

                    }
                    break;

            }

        } catch (IOException ex) {

            return ex instanceof java.io.EOFException;
        }

        return true;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {

           
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("MAC OS X".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                try {
                    new MainWindow().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registerLoginBtn;
    // End of variables declaration//GEN-END:variables
}
