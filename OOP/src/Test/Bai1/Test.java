package Test.Bai1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        QLCB qlcb = new QLCB();
        qlcb.nhapDS(sc);

        
        System.out.println("Nhap ten can tim kiem: ");
        String name=sc.nextLine();

        qlcb.timKiemCanBo(name);
        
    }
}
