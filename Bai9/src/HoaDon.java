/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 9:42 PM
    
    ProjectName: Bai9
*/public class HoaDon extends KhachHang {
    private int chiSoDienCu;
    private int chiSoDienMoi;
    private double soTienPhaiTra;

    public HoaDon() {
        super();
    }

    public HoaDon(String ten, int soNha, String maSoCongTo, int chiSoDienCu, int chiSoDienMoi) {
        super(ten, soNha, maSoCongTo);
        this.chiSoDienCu = chiSoDienCu;
        this.chiSoDienMoi = chiSoDienMoi;
        this.soTienPhaiTra = soTienPhaiTra();
    }

    public int getChiSoDienCu() {
        return chiSoDienCu;
    }

    public void setChiSoDienCu(int chiSoDienCu) {
        this.chiSoDienCu = chiSoDienCu;
    }

    public int getChiSoDienMoi() {
        return chiSoDienMoi;
    }

    public void setChiSoDienMoi(int chiSoDienMoi) {
        this.chiSoDienMoi = chiSoDienMoi;
    }

    public double getSoTienPhaiTra() {
        return soTienPhaiTra;
    }

    public void setSoTienPhaiTra() {
        this.soTienPhaiTra = soTienPhaiTra();
    }
    public double soTienPhaiTra(){
        return (this.chiSoDienMoi-this.chiSoDienCu)*5.0;
    }
    @Override
    public String toString() {
        return "HoaDon{" +
                "chiSoDienCu=" + chiSoDienCu +
                ", chiSoDienMoi=" + chiSoDienMoi +
                ", soTienPhaiTra=" + soTienPhaiTra +
                ", ten='" + ten + '\'' +
                ", soNha=" + soNha +
                ", maSoCongTo='" + maSoCongTo + '\'' +
                '}';
    }
}
