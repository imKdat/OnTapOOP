package OnTap.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class DSTS {
    private ArrayList<SinhVien> dsts;

    public DSTS() {
        dsts=new ArrayList<SinhVien>(20);
    }
    public void themTS(SinhVien sv) {
        dsts.add(sv);
    }

    public void nhapTS(Scanner sc) {
        SinhVien sv;
        int chon;
        int n;
        System.out.println("Nhap vao so luong thi sinh:");
        n=sc.nextInt();
        for(int i=0;i < n;i++){
            System.out.println("Thi sinh thuoc khoi nao\n(1.Khoi A-2.Khoi B-3.Khoi C)");
            chon=sc.nextInt();
            switch (chon) {
                case 1:
                    sv=new KhoiA("Toan","Ly","Hoa");
                    break;
                case 2:
                    sv=new KhoiB("Toan","Hoa","Sinh");
                    break;
                case 3:
                    sv=new KhoiC("Van","Su","Dia");
                default:
                    sv=new KhoiA("Toan","Ly","Hoa");
                    break;
            }
            sv.nhapTT(sc);
            themTS(sv);
        }
    }
    public void inTT() {
        for(int i=0;i<dsts.size();i++){
            System.out.println("Thi sinh thu "+(i+1));
            dsts.get(i).inTT();
        }
    }
    public void timKiemSBD(String sbd) {
        for(SinhVien sv: dsts){
            if(sbd.equals(sv.getsBD())){
                sv.inTT();
            }
        }
    }
    public void timKiemTS() {
    }
}
