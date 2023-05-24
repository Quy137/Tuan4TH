/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1TH4;

import java.util.Scanner;

/**
 *
 * @author Wys.Dao
 */
public class testGiaoDich {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSach dsgiaodich = new DanhSach();
        int a;
        do {
            System.out.println("\n----------MENU----------");
            System.out.println("Hay nhap vao con so tuong ung trong menu:");
            System.out.println("1: Them vao danh sach giao dich dat.");
            System.out.println("2: Them vao danh sach giao dich nha.");
            System.out.println("3:Xuat thong tin danh sach giao dich dat.");
            System.out.println("4:Xuat thong tin danh sach giao dich nha.");
            System.out.println("5:Thong ke so luong giao dich.");
            System.out.println("6:Tinh trung binh thanh tien cua giao dich dat.");
            System.out.println("7:Xuat giao dich thang 9 nam 2013.");
            System.out.println("8:Thoat.");
            System.out.print("Chon: ");
            a = sc.nextInt();
            // nhập lại menu

            if (a < 1 || a > 8) {
                System.out.println("\n----------ERROR----------");
                System.out.println("Vui long chon trong khoang 1 toi 10!!!!!");

            } else {
                // vào menu
                switch (a) {
                    case 1: {
                        GiaoDichDat giaoDichDat = new GiaoDichDat();
                        System.out.println("Nhap thong tin cua giao dich dat");
                        sc.nextLine();
                        System.out.println("Nhap vao ma giao dich :");
                        String maGiaoDich = sc.nextLine();
                        System.out.println("Nhap ngay giao dich");
                        String ngayGiaoDich = sc.nextLine();
                        System.out.println("Nhap don gia:");
                        double donGia = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Nhap dien tich :");
                        double dienTich = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Chon loai dat");
                        String loaiDat = sc.nextLine();
                        GiaoDichDat GiaoDichDat = new GiaoDichDat(loaiDat, maGiaoDich, ngayGiaoDich, donGia, dienTich);
                        dsgiaodich.addDat(GiaoDichDat);
                        break;
                    }
                    case 2: {
                        GiaoDichNha giaoDichNha = new GiaoDichNha();
                        System.out.println("Nhap thong tin cua giao dich dat");
                        sc.nextLine();
                        System.out.println("Nhap loai nha :");
                        String loaiNha = sc.nextLine();
                        System.out.println("Nhap dia chi :");
                        String diaChi = sc.nextLine();
                        System.out.println("Nhap vao ma giao dich :");
                        String maGiaoDich = sc.nextLine();
                        System.out.println("Nhap ngay giao dich");
                        String ngayGiaoDich = sc.nextLine();
                        System.out.println("Nhap don gia:");
                        double donGia = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Nhap dien tich :");
                        double dienTich = sc.nextDouble();
                        sc.nextLine();
                        GiaoDichNha GiaoDichNha = new GiaoDichNha(loaiNha, diaChi, maGiaoDich, ngayGiaoDich, donGia, dienTich);
                        dsgiaodich.addNha(GiaoDichNha);
                        break;
                    }
                    case 3: {
                        dsgiaodich.xuatthongtindat();
                        break;
                    }
                    case 4: {
                        dsgiaodich.xuatthongtinnha();
                        break;
                    }
                    case 5: {
                        int lua = 0;
                        System.out.println("\nChon thong ke  so luong cua danh sach: ");
                        System.out.println("1. Danh sach nha.");
                        System.out.println("2. Danh sach dat.");
                        System.out.print("Chon: ");
                        lua = sc.nextInt(); 
                        switch (lua) {
                            case 1: {
                                System.out.println("\nSo luong nha: " + dsgiaodich.soluongnha());
                                break;
                            }
                            case 2: {
                                System.out.println("\nSo luong dat: " + dsgiaodich.soluongdat());
                                break;
                            }
                        }break;
                    }
                    case 6: {
                        System.out.println(dsgiaodich.trungbinhthanhtien());
                        break;
                    }
                    case 7: {
                        dsgiaodich.xuatgiaodich9();
                        break;
                    }
                    case 8: {
                        System.out.println("Xin cam on");
                        break;
                    }
                }
            }
        } while (a !=9);
        sc.close();
    } }