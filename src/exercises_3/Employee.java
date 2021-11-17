package exercises_3;

public class Employee {
    private String maNhanVien;
    private String ten;
    private int namSinh;
    private String donVi;
    private String trinhDo;

    public Employee() {
    }

    public Employee(String maNhanVien, String ten, int namSinh, String donVi, String trinhDo) {
        this.maNhanVien = maNhanVien;
        this.ten = ten;
        this.namSinh = namSinh;
        this.donVi = donVi;
        this.trinhDo = trinhDo;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

}
