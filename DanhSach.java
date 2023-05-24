/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1TH4;

import java.util.ArrayList;

/**
 *
 * @author Wys.Dao
 */
public class DanhSach {
    public ArrayList<GiaoDichDat> listDat = new ArrayList<>();
    public ArrayList<GiaoDichNha> listNha =new ArrayList<>();

   

    public DanhSach() {
    }
    
    public void addDat(GiaoDichDat gdd) {
        this.listDat.add(gdd);
    }
    
    public void xuatthongtindat() {
        for(GiaoDichDat GiaoDichDat : listDat) {
            System.out.println(GiaoDichDat);
        }
    }
    
    public void addNha(GiaoDichNha gdn) {
        this.listNha.add(gdn);
    }
    
    public void xuatthongtinnha() {
        for (GiaoDichNha GiaoDichNha : listNha) {
            System.out.println(GiaoDichNha);
        }
    }
    
    public int soluongdat() {
        return this.listDat.size();
    }
    
    public int soluongnha() {
        return this.listNha.size();
    }
    
    double trungbinhthanhtien(){
        double trungbinhthanhtien=0.0;
        for(GiaoDichDat obj: listDat){
            trungbinhthanhtien += obj.thanhtien();
            trungbinhthanhtien/=listDat.size();
        }
        return trungbinhthanhtien;
    }
    
    public void xuatgiaodich9() {
    System.out.println("Cac giao dich dat ngay thang 9 nam 2013:");
    for (int i = 0; i < listDat.size(); i++) {
        String[] dateGiaoDichDat = listDat.get(i).getNgayGiaoDich().split("/");
        if (dateGiaoDichDat.length == 3 && dateGiaoDichDat[1].equals("09") && dateGiaoDichDat[2].equals("2013")) {
            GiaoDichDat GiaoDichDat = listDat.get(i);
            System.out.println(listDat.get(i).toString());
        }
    }
    
    System.out.println("Cac giao dich nha ngay thang 9 nam 2013:");
    for (int i = 0; i < listNha.size(); i++) {
        String[] dateGiaoDichNha = listNha.get(i).getNgayGiaoDich().split("/");
        if (dateGiaoDichNha.length == 3 && dateGiaoDichNha[1].equals("09") && dateGiaoDichNha[2].equals("2013")) {
            GiaoDichNha GiaoDichNha = listNha.get(i);
            System.out.println(listNha.get(i).toString());
        }
    }
}
}
