package com.csc;

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
}
