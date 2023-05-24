/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1TH4;


/**
 *
 * @author Wys.Dao
 */
public class GiaoDichDat extends Giaodich {
    public String loaiDat;

    public GiaoDichDat(String loaiDat, String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public GiaoDichDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public GiaoDichDat() {
    }

   
    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaidat(String loaidat) {
        if(loaidat.equals("A")||loaidat.equals("B")||loaidat.equals("C")){
        this.loaiDat = loaidat;
    }else{
        System.out.println("chi duoc nhap:[A,B,C]");
    } 
    }
    
    double thanhtien(){
        double thanhtien=0.0;
        if(this.loaiDat.equals("C")||this.loaiDat.equals("B")){
            thanhtien = this.dienTich*this.donGia;
        }else if(this.loaiDat.equals("A")){
            thanhtien = this.dienTich*this.donGia*1.5;
        }    
        return thanhtien;  
    }

    @Override
    public String toString() {
        return super.toString()  + "\nloaiDat=" + loaiDat + '}';
    }

    
}
