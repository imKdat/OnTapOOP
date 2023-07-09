package OnTap.TaiLieu;

import java.util.Scanner;

public class TaiLieu {
    Scanner sc = new Scanner(System.in);
    
    private String maTaiLieu,tenNhaXuatBan;
    private int soBanPhatHanh;
    public TaiLieu() {
    }
    public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }
    public String getMaTaiLieu() {
        return maTaiLieu;
    }
    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }
    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }
    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }
    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }
    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public void nhapTT() {
        System.out.println("Nhap ma tai lieu: ");
        maTaiLieu=sc.nextLine();
        System.out.println("Nhap ten nha xuat ban: ");
        tenNhaXuatBan=sc.nextLine();
        System.out.println("Nhap so ban phat hanh: ");
        soBanPhatHanh=sc.nextInt();
    }
    public void inTT() {
        System.out.println("Ma tai lieu: "+maTaiLieu);
        System.out.println("Ten nha xuat ban: "+tenNhaXuatBan);
        System.out.println("So ban phat hanh: "+soBanPhatHanh);
    }
}
