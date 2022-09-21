public class Phim {
    private String tenPhim;
    private double giaBan;
    private int namXuatBan;
    private TacGia tacG;

    public Phim(String tenSach, double giaBan, int namXuatBan, TacGia tacG) {
        this.tenPhim = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
        this.tacG = tacG;
    }

    public String getTenSach() {
        return tenPhim;
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
        this.tenPhim = tenSach;
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
        System.out.println(this.tenPhim);
    }

    public boolean cungNam (Phim phimKhac) {
        return this.namXuatBan == phimKhac.namXuatBan;
    }
}
