package OnTap.CanBo;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu(String hoTen, String diaChi, String gioiTinh, String nganhDaoTao) {
        super(hoTen, diaChi, gioiTinh);
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu() {
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public void nhapTT(Scanner sc) {
        super.nhapTT(sc);
        System.out.print("Nhap  nganh dao tao: ");
        nganhDaoTao = sc.nextLine();
    }

    public void inTT() {
        super.inTT();
        System.out.println("Nganh dao tao: " + nganhDaoTao);
    }
}
