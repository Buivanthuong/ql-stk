package stk.entities;
// Generated Jun 16, 2019 2:23:34 PM by Hibernate Tools 4.3.1



/**
 * Quydinh generated by hbm2java
 */
public class Quydinh  implements java.io.Serializable {


     private Integer id;
     private int soLoai;
     private int soNgayDaoHan;
     private boolean thayDoiLaiXuat;
     private int tienGoiToiThieu;

    public Quydinh() {
    }

    public Quydinh(int soLoai, int soNgayDaoHan, boolean thayDoiLaiXuat, int tienGoiToiThieu) {
       this.soLoai = soLoai;
       this.soNgayDaoHan = soNgayDaoHan;
       this.thayDoiLaiXuat = thayDoiLaiXuat;
       this.tienGoiToiThieu = tienGoiToiThieu;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public int getSoLoai() {
        return this.soLoai;
    }
    
    public void setSoLoai(int soLoai) {
        this.soLoai = soLoai;
    }
    public int getSoNgayDaoHan() {
        return this.soNgayDaoHan;
    }
    
    public void setSoNgayDaoHan(int soNgayDaoHan) {
        this.soNgayDaoHan = soNgayDaoHan;
    }
    public boolean isThayDoiLaiXuat() {
        return this.thayDoiLaiXuat;
    }
    
    public void setThayDoiLaiXuat(boolean thayDoiLaiXuat) {
        this.thayDoiLaiXuat = thayDoiLaiXuat;
    }
    public int getTienGoiToiThieu() {
        return this.tienGoiToiThieu;
    }
    
    public void setTienGoiToiThieu(int tienGoiToiThieu) {
        this.tienGoiToiThieu = tienGoiToiThieu;
    }




}


