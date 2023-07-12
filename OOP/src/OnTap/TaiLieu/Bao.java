package OnTap.TaiLieu;

public class Bao extends TaiLieu{
    private int ngayPhatHanh;

    public Bao() {
    }

    public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    public void nhapTT() {
        super.nhapTT();
        System.out.println("Nhap ngay phat hanh");
        ngayPhatHanh=sc.nextInt();
    }
    public void inTT() {
        super.inTT();
        System.out.println("Ngay phat hanh: ");
    }
}
