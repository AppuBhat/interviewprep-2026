package org.example.starpatterns;

public class FourCrossFourMatrix {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            String row = " ";
            for(int j=0;j<5;j++){
                row = row+"* ";
            }
            System.out.println(row);
        }
    }

}
