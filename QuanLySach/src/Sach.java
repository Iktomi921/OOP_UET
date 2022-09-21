public class Sach {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private TacGia tacG;

    public Sach(String tenSach, double giaBan, int namXuatBan, TacGia tacG) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
        this.tacG = tacG;
    }

    public String getTenSach() {
        return tenSach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public TacGia getTacG() {
        return tacG;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public void setTacG(TacGia tacG) {
        this.tacG = tacG;
    }

    public void inTenSach(){
        System.out.println(this.tenSach);
    }

    public boolean cungNam (Sach sachKhac) {
        return this.namXuatBan == sachKhac.namXuatBan;
    }
}
