package Test.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> dscb;

    public QLCB() {
        dscb = new ArrayList<CanBo>(10);

    }

    public void themCB(CanBo cBo) {
        dscb.add(cBo);
    }

    public void nhapDS(Scanner sc) {
        CanBo cBo;
        System.out.println("Nhap so luong can bo: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap thong tin: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap can bo thu " + (i + 1) + ":");
            System.out.println("Chon loai can bo\n" + "1-Ky su\n2-Nhan vien\n3-Cong nhan");
            int chon = sc.nextInt();
            sc.nextLine();
            cBo = new CanBo();

            switch (chon) {
                case 1:
                    cBo = new KySu();

                    break;
                case 2:
                    cBo = new NhanVien();
                    break;
                case 3:
                    cBo = new CongNhan();
                    break;
                default:
                    cBo = new KySu();
                    break;
            }
            cBo.nhapTT();
            themCB(cBo);
        }

    }
    public void timKiemCanBo(String name) {
        
        for(CanBo cBo:dscb){
            if(name.equals(cBo.getHoTen())){
               cBo.inTT();  
            }
        }
    }

}
