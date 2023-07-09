package OnTap.BT5;

public class OCung {
    private String loaiOC, maOC, tocDoQuay, tocDoDoc, tocDoGhi;
    private int donGia, dungLuong;

    public OCung(String loaiOC, String maOC, String tocDoQuay, String tocDoDoc, String tocDoGhi, int donGia,
            int dungLuong) {
        this.loaiOC = loaiOC;
        this.maOC = maOC;
        this.tocDoQuay = tocDoQuay;
        this.tocDoDoc = tocDoDoc;
        this.tocDoGhi = tocDoGhi;
        this.donGia = donGia;
        this.dungLuong = dungLuong;
    }

    public OCung() {
    }

    public String getLoaiOC() {
        return loaiOC;
    }

    public void setLoaiOC(String loaiOC) {
        this.loaiOC = loaiOC;
    }

    public String getMaOC() {
        return maOC;
    }

    public void setMaOC(String maOC) {
        this.maOC = maOC;
    }

    public String getTocDoQuay() {
        return tocDoQuay;
    }

    public void setTocDoQuay(String tocDoQuay) {
        this.tocDoQuay = tocDoQuay;
    }

    public String getTocDoDoc() {
        return tocDoDoc;
    }

    public void setTocDoDoc(String tocDoDoc) {
        this.tocDoDoc = tocDoDoc;
    }

    public String getTocDoGhi() {
        return tocDoGhi;
    }

    public void setTocDoGhi(String tocDoGhi) {
        this.tocDoGhi = tocDoGhi;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

}
