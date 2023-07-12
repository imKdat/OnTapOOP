package OnTap.BT5;

public class RAM {
    private String loaiRam, maRam;
    private int dungLuong, donGia,soThanh;

    public RAM() {
    }

    

    public RAM(String loaiRam, String maRam, int dungLuong, int donGia, int soThanh) {
        this.loaiRam = loaiRam;
        this.maRam = maRam;
        this.dungLuong = dungLuong;
        this.donGia = donGia;
        this.soThanh = soThanh;
    }



    public String getLoaiRam() {
        return loaiRam;
    }

    public void setLoaiRam(String loaiRam) {
        this.loaiRam = loaiRam;
    }

    public String getMaRam() {
        return maRam;
    }

    public void setMaRam(String maRam) {
        this.maRam = maRam;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }



    public int getSoThanh() {
        return soThanh;
    }



    public void setSoThanh(int soThanh) {
        this.soThanh = soThanh;
    }
    
}
