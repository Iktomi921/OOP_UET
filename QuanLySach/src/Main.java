public class Main {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(21,9,2003);
        Ngay ngay2 = new Ngay(19,5,2003);

        TacGia tg1 = new TacGia("Vuong", ngay1);
        TacGia tg2 = new TacGia("Du", ngay2);

        Sach sach1 = new Sach("Java la de", 100.0, 2020, tg1);
        Sach sach2 = new Sach("OOP la de", 200.0, 2019, tg2);

        sach1.inTenSach();
        sach2.inTenSach();

        System.out.printf("Check nam xuat ban: " + sach2.cungNam(sach1 ));
    }
}
