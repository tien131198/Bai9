/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 9:41 PM
    
    ProjectName: Bai9
*/public class KhachHang {
    protected String ten;
    protected int soNha;
    protected String maSoCongTo;

    public KhachHang() {
    }

    public KhachHang(String ten, int soNha, String maSoCongTo) {
        this.ten = ten;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(String maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }

}
