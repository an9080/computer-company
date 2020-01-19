package store.classes;


import java.io.*;
public class DesktopComputer extends TechnicalDevice implements Serializable{
   private String opticalDrive; 
   public DesktopComputer(String ID, double size, String pType, int ram, String color,String b,double p, int q, String opticalD){
      super(ID,size,pType,ram,color,b,p,q);
      opticalDrive=opticalD;}

   public double getPrice(){
      double Price=0.0;
      if(opticalDrive=="CD Burner")
         Price+=100;
      if(opticalDrive=="DVD Optical Drive") 
         Price+=230;
      if(opticalDrive=="SuperMulti DVD Burner") 
         Price+=270;
      return  Price;}

   public String toString(){
      return super.toString()+"\n the opticalDrive is : "+opticalDrive;}}