import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 9:41 PM
    
    ProjectName: Bai9
*/public class Main {
    public static void main(String[] args) {
        QuanLyKhachHang quanLyKhachHang = new QuanLyKhachHang();
        while(true){
            System.out.println("Chuong trinh quan ly khach hang");
            System.out.println("Nhan 1: Them khach hang");
            System.out.println("Nhan 2: Xoa khach hang");
            System.out.println("Nhan 3: Sua khach hang");
            System.out.println("Nhan 4: Kiem tra so tien dien");
            System.out.println("Nhan 5: Hien thi thong tin quan ly");
            System.out.println("Nhan 0: Thoat khoi chuong trinh");
            Scanner scanner = new Scanner(System.in);
            String luaChon = scanner.nextLine();
            switch (luaChon){
                case "1": {
                    HoaDon hoaDon = new HoaDon();
                    quanLyKhachHang.nhapThongTin(hoaDon);
                    quanLyKhachHang.themKhachHang(hoaDon);
                    break;
                }
                case "2":{
                    System.out.println("Nhap ma so cong to");
                    String maSoCongTo = scanner.nextLine();
                    System.out.println(quanLyKhachHang.xoaKhachHang(maSoCongTo));
                    break;
                }
                case "3":{
                    System.out.println("Nhap ma so cong to");
                    String maSoCongTo = scanner.nextLine();
                    quanLyKhachHang.suaKhachHang(maSoCongTo);
                    break;
                }
                case "4":{
                    System.out.println("Nhap ma so cong to");
                    String maSoCongTo = scanner.nextLine();
                    System.out.println(quanLyKhachHang.soTienPhaiTra(maSoCongTo));
                    break;
                }
                case "5":{
                    quanLyKhachHang.hienThiDanhSach();
                    break;
                }
                case "0":{
                    System.out.println("Thoat khoi chuong trinh");
                    System.exit(0);
                }
                default:
                    break;
            }
        }
    }
}
