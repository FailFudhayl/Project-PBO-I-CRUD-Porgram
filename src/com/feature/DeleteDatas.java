package com.feature;

import java.util.Scanner;

import com.Run;
import com.controller.ControllerDB;

public class DeleteDatas {
    public static void hapustDatas() {
        Scanner input = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("Silahkan Pilih Data Produk yang Ingin Dihapus");
        System.out.println("=====================================================");
        ControllerDB.readDB();
        System.out.println("-----------------------------------------------------");
        System.out.println("!!!Warning : Masukkan Nama Produk yang Benar");
        System.out.print("Nama Produk  : ");
        String namaProduk = input.nextLine();
        System.out.println("-----------------------------------------------------");
        if (ControllerDB.deletDB(namaProduk)) {
            System.out.println("Selamat Data Produk Baru Anda Berhasil Dihapus");
        } else {
            System.out.println("Data Produk Baru Anda Gagal Dihapus");
        }
        System.out.println("------------------------------------------------------");
        Run.menuAwal();
        input.close();
    }
}
