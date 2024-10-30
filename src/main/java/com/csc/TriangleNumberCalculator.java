package com.csc;
import java.util.ArrayList;
import java.util.List;

public class TriangleNumberCalculator {


  public int value(int n){
   
    if (n<= 0)
    {
      return 0;
    }
    else{
        int _trianglenumb = value(n-1) + n;
        return  _trianglenumb;
    }
    
  }
 
      public int add(int _n, int _m)
      {  
        int newv = value(_n) + value (_m);
        return newv;
      }

      public int subtract(int _n, int _m)
      {  
        int newv = value(_n) - value (_m);
        return newv;
      }
      
       // The methods added for portfolio 
      public int multiply(int _n, int _m)
      {
         int mult = value ( _n) * value (_m);
         return  mult;
      }
      public double divide(int _n, int _m)
      {
         double div = (Double.valueOf(value(_n)) / value(_m));
         double divformat = Math.round(div*100.0)/100.0;
         return divformat ;
      }

      public List<Integer> sequence(int n)
       {
           List<Integer> sequenList = new ArrayList<>();
           
           for(int i = 1; i <= n; i++)
           {
               int valueOut = value(i);
               sequenList.add(valueOut);
           }

           return sequenList;
       }
}
