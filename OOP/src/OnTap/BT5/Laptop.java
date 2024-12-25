package OnTap.BT5;

import java.util.Scanner;

/**
 * Laptop
 */
public class Laptop {
    protected String tenLap, maLap, loaiLap;
    protected int donGia;
    CPU cpu = new CPU();
    RAM ram = new RAM();
    ManHinh man = new ManHinh();//dev ngu
    OCung oc = new OCung();

    public Laptop(String tenLap, String maLap, String loaiLap, int donGia, CPU cpu, RAM ram, ManHinh man, OCung oc) {
        this.tenLap = tenLap;
        this.maLap = maLap;
        this.loaiLap = loaiLap;
        this.donGia = donGia;
        this.cpu = cpu;
        this.ram = ram;
        this.man = man;
        this.oc = oc;
    }

    public Laptop() {
    }

    public String getTenLap() {
        return tenLap;
    }

    public void setTenLap(String tenLap) {
        this.tenLap = tenLap;
    }

    public String getMaLap() {
        return maLap;
    }

    public void setMaLap(String maLap) {
        this.maLap = maLap;
    }

    public String getLoaiLap() {
        return loaiLap;
    }

    public void setLoaiLap(String loaiLap) {
        this.loaiLap = loaiLap;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void nhapTT(Scanner sc) {
        
        System.out.println("Chon loai laptop\n(1.Butterfly-2.Fly-3.Bee)");
        int chon = sc.nextInt();
        switch (chon) {
            case 1:
                loaiLap = "Butterfly";
                break;
            case 2:
                loaiLap = "Fly";
                break;
            case 3:
                loaiLap = "Bee";
                break;
            default:
                loaiLap = "Butterfly";
                break;
        }
        System.out.println("Nhap ten laptop: ");
        sc.nextLine();
        tenLap = sc.nextLine();
        System.out.println("Nhap ma laptop: ");
        maLap = sc.nextLine();
        System.out.println("Nhap ma cpu: ");
        cpu.setMaCPU(sc.nextLine());
        if (loaiLap == "Butterfly") {
            cpu.setLoaiCPU("i7");
            cpu.setDonGia(300);
        } else if (loaiLap == "Fly") {
            cpu.setLoaiCPU("i5");
            cpu.setDonGia(200);
        } else if (loaiLap == "Bee") {
            System.out.println("Chon loai cpu\n(1.i3-2.i5)");
            int chonC = sc.nextInt();
            if (chonC == 1) {
                cpu.setLoaiCPU("i3");
                cpu.setDonGia(100);
            } else {
                cpu.setLoaiCPU("i5");
                cpu.setDonGia(200);
            }
        }
        System.out.println("Nhap so thanh ram: ");
        ram.setSoThanh(sc.nextInt());
        System.out.println("Nhap loai ram\n(1.DDR3-2.DDR4)");
        int chonR = sc.nextInt();
        switch (chonR) {
            case 1:
                ram.setLoaiRam("DDR3");
                ram.setDonGia(100);
                break;
            case 2:
                ram.setLoaiRam("DDR4");
                ram.setDonGia(200);
                break;
            default:
                ram.setLoaiRam("DDR3");
                ram.setDonGia(100);
                break;
        }
        System.out.println("Nhap dung luong: ");
        ram.setDungLuong(sc.nextInt());
        System.out.println("Nhap ma ram: ");sc.nextLine();

        ram.setMaRam(sc.nextLine());

        System.out.println("Nhap ma man hinh: ");
        man.setMaMH(sc.nextLine());
        if (loaiLap == "Butterfly") {
            man.setLoaiMH("FullHD");
            man.chongLoa();
            System.out.println("Loai man hinh: " + man.getLoaiMH());
            System.out.println("Chon loai chong loa\n(1.Loai 1-2.Loai 2-3.Loai 3)");
            int choncl = sc.nextInt();
            if (choncl == 1) {
                man.setDonGia(2000);
            } else if (choncl == 2) {
                man.setDonGia(3000);
            } else if (choncl == 3) {
                man.setDonGia(4000);
            }
        } else if (loaiLap == "Fly") {
            man.setLoaiMH("HD");
            man.chongLoa();
            System.out.println("Loai man hinh: " + man.getLoaiMH());
            man.setDonGia(1000);
        } else if (loaiLap == "Bee") {
            man.setLoaiMH("HD");
            man.chongLoa();
            System.out.println("Loai man hinh: " + man.getLoaiMH());
            man.setDonGia(1000);
        }
        System.out.println("Do phan giai: ");sc.nextLine();
        man.setDoPG(sc.nextLine());
        System.out.println("Don gia: " + man.getDonGia());

        System.out.println("Tiêu chuẩn va chạm (1-t.chuẩn 1,2-t.chuẩn 2,3-t.chuẩn 3): ");
        int tc = sc.nextInt();
        if (tc == 1) {
            man.setChiuLuc("Loai 1");
        } else if (tc == 2) {
            man.setChiuLuc("Loai 2");
        } else if (tc == 3) {
            man.setChiuLuc("Loai 3");
        }
        System.out.println("Chon loai o cung\n(1.HDD-2.SSD)");
        int chonC = sc.nextInt();
        if (chonC == 1) {
            oc.setLoaiOC("HDD");
            System.out.println("Nhap ma o cung: ");
            sc.nextLine();
            oc.setMaOC(sc.nextLine());
            System.out.println("Nhap dung luong: ");
            oc.setDungLuong(sc.nextInt());
            System.out.println("Nhap don gia: ");
            oc.setDonGia(sc.nextInt());
            System.out.println("Nhap toc do quay(rpm): ");
            sc.nextLine();
            oc.setTocDoQuay(sc.nextLine());
        }
        if (chonC == 2) {
            oc.setLoaiOC("SSD");
            System.out.println("Nhap ma o cung: ");
            sc.nextLine();
            oc.setMaOC(sc.nextLine());
            System.out.println("Nhap dung luong: ");
            oc.setDungLuong(sc.nextInt());
            System.out.println("Nhap don gia: ");
            oc.setDonGia(sc.nextInt());
            System.out.println("Nhap toc do doc(MB/s): ");
            sc.nextLine();
            oc.setTocDoDoc(sc.nextLine());
            System.out.println("Nhap toc do ghi(MB/s): ");
            oc.setTocDoGhi(sc.nextLine());
        }
    }

    public void inTT() {
        System.out.println("Laptop: " + this.maLap + " " + this.loaiLap + " "
                + (this.donGia + ram.getDonGia() * ram.getSoThanh() * ram.getDungLuong()
                        + cpu.getDonGia() + man.getDonGia() + oc.getDonGia()));
        System.out.println("CPU: " + cpu.getMaCPU() + " " + cpu.getLoaiCPU() + " " + cpu.getDonGia());
        System.out.println("Ram: " + ram.getMaRam() + " " + ram.getLoaiRam() + " " + ram.getDungLuong() + " "
                + ram.getSoThanh() + " " + ram.getDonGia());
        if (oc.getLoaiOC() == "SSD") {
            System.out.println("O cung: " + oc.getMaOC() + " " + oc.getLoaiOC() + " " + oc.getDungLuong() + " "
                    + oc.getTocDoDoc() + " " + oc.getTocDoGhi() + " " + (oc.getDonGia() * oc.getDungLuong()));
        } else if (oc.getLoaiOC() == "HDD") {
            System.out.println("O cung: " + oc.getMaOC() + " " + oc.getLoaiOC() + " " + oc.getDungLuong() + " "
                    + oc.getTocDoQuay() + " " + (oc.getDonGia() * oc.getDungLuong()));
        }
        System.out.println(
                "Man hinh: " + man.getMaMH() + " " + man.getDoPG() + " " + man.getDonGia() + " " + man.isDoChongLoa());
    }

}