package stk.entities;
// Generated Jun 16, 2019 2:23:34 PM by Hibernate Tools 4.3.1



/**
 * Khachhang generated by hbm2java
 */
public class Khachhang  implements java.io.Serializable {


     private Integer id;
     private String ten;
     private int cmnd;
     private String diaChi;

    public Khachhang() {
    }

    public Khachhang(String ten, int cmnd, String diaChi) {
       this.ten = ten;
       this.cmnd = cmnd;
       this.diaChi = diaChi;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getCmnd() {
        return this.cmnd;
    }
    
    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }
    public String getDiaChi() {
        return this.diaChi;
    }
    
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }




}


