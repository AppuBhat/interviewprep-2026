package org.example.starpatterns;

public class RightAngled0s1s {
    public static void main(String[] args) {
      int  toggle =1;
       for(int i=0;i<5;i++){
           String row = " ";
           for(int j=0;j<=i;j++){
               row = row + " "+ toggle;
               toggle = 1 - toggle;
//               if(toggle==0){
//                   toggle =1;// Toggle between 0 and 1
//               }
//               else{
//                   toggle =0;
//               }
           }
              System.out.println(row);
       }
    }
}
