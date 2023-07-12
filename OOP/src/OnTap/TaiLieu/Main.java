package OnTap.TaiLieu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        DSTL ds=new DSTL();
        System.out.println("Nhap thong tin tl:");
        ds.nhapDS(sc);

        System.out.println("Tim tai lieu theo ma");
        String ma=sc.nextLine();
        ds.timKiemMa(ma);
        System.out.println("Tim tai lieu theo loai");
        String loai=sc.nextLine();
        ds.timKiemLoai(loai);
    }
}
