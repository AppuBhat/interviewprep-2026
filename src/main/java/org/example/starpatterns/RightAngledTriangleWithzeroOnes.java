package org.example.starpatterns;

public class RightAngledTriangleWithzeroOnes {
    public static void main(String[] args) {
        int n=15;
        for(int i=0;i<n;i++){
            String row =" ";
            for(int j=0;j<=i;j++){
                if(j%2==0){
                    row = row+"1 ";
                }else{
                    row = row+"0 ";
                }
            }
            System.out.println(row);
        }
    }
}
