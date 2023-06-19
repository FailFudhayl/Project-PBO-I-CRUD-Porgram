package com.feature;
import java.util.Scanner;

import com.Run;
import com.controller.ControllerDB;

public class InsertDatas {
    public static void insertDatas() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("=====================================================");
            System.out.println("Silahkan Masukkan Data Produk Baru Anda");
            System.out.println("=====================================================");
            System.out.print("Nama Produk  : ");
            String namaProduk = input.nextLine();
            System.out.print("Harga Produk : ");
            Long harga = input.nextLong();
            System.out.print("Stok Produk  : ");
            int stok = input.nextInt();
            System.out.println("-----------------------------------------------------");
            System.out.println("-----------------------------------------------------");
            ControllerDB.insertDB(namaProduk, harga, stok);
            System.out.println("Selamat Data Produk Baru Anda Berhasil Diinput");
            Run.menuAwal();
            input.close();
        } catch (Exception e) {
            System.out.println("Data Produk Baru Anda Gagal Diinput");
            Run.menuAwal();
        }
        System.out.println("------------------------------------------------------");
    }
}
