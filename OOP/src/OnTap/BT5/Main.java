package OnTap.BT5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Laptop lap[]=new Laptop[10];
        lap[1]=new Laptop();
        lap[2]=new Laptop();
        lap[1].nhapTT(sc);
        lap[2].nhapTT(sc);
        lap[1].inTT();
        lap[2].inTT();
    }
}
