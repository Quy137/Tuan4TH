/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1TH4;


/**
 *
 * @author Wys.Dao
 */
public class GiaoDichNha extends Giaodich {
    public String loaiNha, diaChi;

    public GiaoDichNha(String loaiNha, String diaChi, String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public GiaoDichNha(String loaiNha, String diaChi) {
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public GiaoDichNha() {
    }

   

    public String getLoaiNha() {
        return loaiNha;
    }

     public void setLoainha(String loainha) {

            if(loaiNha.equals("cao cap")||loaiNha.equals("thuong")){
                this.loaiNha = loainha;
            }else{
                System.out.println("chi duoc nhap:[cao cap||thuong]");
            }
       
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
     double thanhtien(){
        double thanhtien = 0.0;
        if(this.loaiNha.equals("cao cap")){
            thanhtien = this.dienTich*this.donGia;
        }else if(this.loaiNha.equals("thuong")){
            thanhtien = this.dienTich*this.donGia*0.9;
        }
        return thanhtien;
    }

    @Override
    public String toString() {
        return super.toString() + "loaiNha=" + loaiNha + ", diaChi=" + diaChi + '}';
    }
    
    
}
