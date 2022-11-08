import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 9:48 PM
    
    ProjectName: Bai9
*/public class QuanLyKhachHang {
    private List<HoaDon> quanLyKhachHang;

    public QuanLyKhachHang() {
        this.quanLyKhachHang = new ArrayList<>();
    }

    public List<HoaDon> getQuanLyKhachHang() {
        return quanLyKhachHang;
    }

    public void setQuanLyKhachHang(List<HoaDon> quanLyKhachHang) {
        this.quanLyKhachHang = quanLyKhachHang;
    }
    // Lay thong tin khach hang tu ban phim
    public void nhapThongTin(HoaDon hoaDon){
        System.out.println("Nhap ten chu ho:");
        Scanner scanner = new Scanner(System.in);
        hoaDon.setTen(scanner.nextLine());
        System.out.println("Nhap so nha:");
        hoaDon.setSoNha(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhap ma so cong to");
        hoaDon.setMaSoCongTo(scanner.nextLine());
        System.out.println("Nhap chi so dien cu");
        hoaDon.setChiSoDienCu(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhap chi so dien moi");
        hoaDon.setChiSoDienMoi(scanner.nextInt());
        scanner.nextLine();
        hoaDon.setSoTienPhaiTra();
    }
    // them khach hang vao danh sach
    public void themKhachHang(HoaDon hoaDon){
        this.quanLyKhachHang.add(hoaDon);
    }
    //
    // kiem tra su ton tai khach hang
    public HoaDon tonTaiKhachHang(String maSoCongTo) {
        HoaDon hoaDon = this.quanLyKhachHang.stream().filter(o -> o.getMaSoCongTo().equals(maSoCongTo)).findFirst().orElse(null);
        if (hoaDon == null) {
            return null;
        }else{
            return hoaDon;
        }
    }
    // xoa khach hang
    public boolean xoaKhachHang(String maSoCongTo){
        HoaDon hoaDon = tonTaiKhachHang(maSoCongTo);
        if (hoaDon == null){
            return false;
        }else{
            quanLyKhachHang.remove(hoaDon);
            return true;
        }
    }
    //sua thong tin khach hang
    public void suaKhachHang(String maSoCongTo){
        HoaDon hoaDon = tonTaiKhachHang(maSoCongTo);
        if (hoaDon == null){
            System.out.println("Khong ton tai khach hang");
        }else{
            nhapThongTin(hoaDon);
        }
    }
    // tinh tien dien
    public Double soTienPhaiTra(String maSoCongTo){
        HoaDon hoaDon = tonTaiKhachHang(maSoCongTo);
        if (hoaDon == null){
            System.out.println("khong ton tai khach hang");
            return null;
        }else{
            return hoaDon.getSoTienPhaiTra();
        }
    }
    // hien thi thong tin danh sach
    public void hienThiDanhSach(){
        this.quanLyKhachHang.forEach(o-> System.out.println(o.toString()));
    }


}
