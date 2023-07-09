package OnTap.TaiLieu;

public class TapChi extends TaiLieu {
    private int soPhatHanh,thangPhatHanh;

    public TapChi() {
    }

    public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
    public void nhapTT() {
        super.nhapTT();
        System.out.println("Nhap so phat hanh: ");
        soPhatHanh=sc.nextInt();
        System.out.println("Nhap thang phat hanh: ");
        thangPhatHanh=sc.nextInt();
    }
    public void inTT() {
        super.inTT();
        System.out.println("So phat hanh: "+soPhatHanh);
        System.out.println("Thang phat hanh: "+thangPhatHanh);

    }
}
