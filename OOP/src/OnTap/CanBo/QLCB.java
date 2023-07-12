package OnTap.CanBo;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> ds;

    public QLCB() {
        this.ds = new ArrayList<CanBo>(30);
    }

    public void themCB(CanBo cb) {
        ds.add(cb);
    }

    public void nhapCB(Scanner sc) {
        CanBo cb;
        int chon = 0, n = 0;

        System.out.print("Nhap vao so luong can bo: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ban la (1.Cong nhan-2.Ky su-3.Nhan vien):");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    cb = new CongNhan();
                    break;
                case 2:
                    cb = new KySu();
                    break;
                case 3:
                    cb = new NhanVien();
                    break;
                default:
                    cb = new CongNhan();
                    break;
            }
            cb.nhapTT(sc);
            themCB(cb);

        }

    }

    public void inTT() {
        for (int i = 0; i < ds.size(); i++) {
            System.out.println("Can bo thu " + (i + 1) + " :");
            ds.get(i).inTT();
        }
    }

    public void timKiem(String loaiCB) {
        for (CanBo cb : ds) {
            if (loaiCB.equals("Cong Nhan") && (cb instanceof CongNhan)) {
                cb.inTT();
            }
            if (loaiCB.equals("Ky Su") && (cb instanceof KySu)) {
                cb.inTT();
            }
            if (loaiCB.equals("Nhan Vien") && (cb instanceof NhanVien)) {
                cb.inTT();
            }
        }
    }
}
