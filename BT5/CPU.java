package OnTap.BT5;

public class CPU {
    private String maCPU,loaiCPU;
    private int donGia;
    
    public CPU() {
    }
    
    public CPU(String maCPU, String loaiCPU, int donGia) {
        this.maCPU = maCPU;
        this.loaiCPU = loaiCPU;
        this.donGia = donGia;
    }

    public String getMaCPU() {
        return maCPU;
    }
  
  public void setMaCPU(String maCPU) {
        this.maCPU = maCPU;
    }
    public String getLoaiCPU() {
        return loaiCPU;
    }
    public void setLoaiCPU(String loaiCPU) {
        this.loaiCPU = loaiCPU;
    }
    public int getDonGia() {
        return donGia;
    }
    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
}
