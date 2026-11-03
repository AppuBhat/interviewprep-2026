package org.example.starpatterns;

public class RightAngledTriangle {
    public static void main(String[] args) {
        int n=15;
        for(int i=0;i<n;i++){
            String row =" ";
            for(int j=0;j<i+1;j++){
                row = row+"* ";
            }
            System.out.println(row);
        }

    }
}
