package OnTap.TaiLieu;

public class Sach extends TaiLieu {
    private int soTrang;
    private String tenTacGia;

    public Sach() {
    }

    public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soTrang, String tenTacGia) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soTrang = soTrang;
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public void nhapTT() {
        super.nhapTT();
        System.out.println("Nhap ten tac gia: ");sc.nextLine();
        tenTacGia = sc.nextLine();
        System.out.println("Nhap so trang: ");
        soTrang = sc.nextInt();
    }

    public void inTT() {
        super.inTT();
        System.out.println("Ten tac gia: " + tenTacGia);
        System.out.println("So trang: " + soTrang);
    }

}
