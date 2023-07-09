package OnTap.BT5;

public class ManHinh {
    private String maMH, loaiMH, doPG, hangSX, chiuLuc;
    private int donGia;
    private boolean chongLoa;
    public ManHinh() {
    }
    public ManHinh(String maMH, String loaiMH, String doPG, String hangSX, String chiuLuc, int donGia,
            boolean chongLoa) {
        this.maMH = maMH;
        this.loaiMH = loaiMH;
        this.doPG = doPG;
        this.hangSX = hangSX;
        this.chiuLuc = chiuLuc;
        this.donGia = donGia;
        this.chongLoa = chongLoa;
    }
    public String getMaMH() {
        return maMH;
    }
    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }
    public String getLoaiMH() {
        return loaiMH;
    }
    public void setLoaiMH(String loaiMH) {
        this.loaiMH = loaiMH;
    }
    public String getDoPG() {
        return doPG;
    }
    public void setDoPG(String doPG) {
        this.doPG = doPG;
    }
    public String getHangSX() {
        return hangSX;
    }
    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }
    public String getChiuLuc() {
        return chiuLuc;
    }
    public void setChiuLuc(String chiuLuc) {
        this.chiuLuc = chiuLuc;
    }
    public int getDonGia() {
        return donGia;
    }
    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    public boolean isDoChongLoa() {
        return chongLoa;
    }
    public void setDoChongLoa(boolean doChongLoa) {
        this.chongLoa = doChongLoa;
    }
    public void chongLoa() {
        if(loaiMH=="FullHD"){
            chongLoa=true;
        }
        else{
            chongLoa=false;
        }
    }
}
