package Test.Bai1;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao;
    Scanner sc = new Scanner(System.in);

    public KySu() {
    }

    public KySu(String hoTen, String ngaySinh, String gioitinh, String diachi, String nganhDaoTao) {
        super(hoTen, ngaySinh, gioitinh, diachi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public void nhapTT() {
        super.nhapTT();
        System.out.println("Nhap nganh dao tao: ");
        
        nganhDaoTao = sc.nextLine();
    }

    public void inTT() {
        super.inTT();
        System.out.println("Nganh dao tao: " + nganhDaoTao);
    }
}
