public class Main {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(21,9,2003);
        Ngay ngay2 = new Ngay(19,5,2003);

        TacGia tg1 = new TacGia("Vuong", ngay1);
        TacGia tg2 = new TacGia("Du", ngay2);

        Phim phim1 = new Phim("Java la de", 100.0, 2020, tg1);
        Phim phim2 = new Phim("OOP la de", 200.0, 2019, tg2);

        phim1.inTenSach();
        phim2.inTenSach();

        System.out.printf("Check nam xuat ban: " + phim2.cungNam(phim1));
    }
}
