package OnTap.TaiLieu;

import java.util.ArrayList;
import java.util.Scanner;

public class DSTL {
    private ArrayList<TaiLieu> dstl;

    public DSTL() {
        dstl = new ArrayList<TaiLieu>(100);
    }
    
    public void themTaiLieu(TaiLieu tl) {
        dstl.add(tl);
    }
    public void nhapDS(Scanner sc) {
        int chon;
        String stop;
        TaiLieu tl;
        do {
            System.out.println("Nhap loai tai lieu\n(1.Sach-2.Tap Chi-3.Bao)");
            chon=sc.nextInt();
            sc.nextLine();
            switch (chon) { 
                case 1:
                    tl=new Sach();
                    break;
                case 2:
                    tl=new TapChi();
                case 3:
                    tl=new Bao();
                default:
                    tl=new Sach();
                    break;
            }
            tl.nhapTT();
            themTaiLieu(tl);
            System.out.println("Ban co muon nhap them sach(c/k)");
            stop=sc.nextLine();
        } while (stop.equals("c"));
    
    }
    public void timKiemMa(String maTL) {
        for(TaiLieu tl:dstl){
            if(maTL.equals(tl.getMaTaiLieu())){
                tl.inTT();
            }
        }
    }
    public void timKiemLoai(String loaiTL) {
        for(TaiLieu tl:dstl){
            if(loaiTL.equals("Sach")&&(tl instanceof Sach)){
                tl.inTT();
            }
            else if(loaiTL.equals("Tap Chi")&&(tl instanceof TapChi)){
                tl.inTT();
            }
            else if(loaiTL.equals("Bap")&&(tl instanceof Bao)){
                tl.inTT();
            }
        }
    }

    
}
