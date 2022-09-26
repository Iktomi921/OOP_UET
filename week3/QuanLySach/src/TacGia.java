public class TacGia {
    private String ten;
    private Ngay ngaySinh = new Ngay();

    public TacGia(String ten, Ngay ngaySinh) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getTen() {
        return ten;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }
}
