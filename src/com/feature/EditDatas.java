package com.feature;

import java.util.Scanner;

import com.Run;
import com.controller.ControllerDB;
import com.models.Produk;

public class EditDatas {
    public static void showEditData() {
        Scanner input = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("Silahkan Pilih Produk yang Ingin Diedit");
        System.out.println("=====================================================");
        ControllerDB.readDB();
        System.out.println("-----------------------------------------------------");
        System.out.println("!!!Warning : Masukkan Nama Produk yang Benar");
        System.out.print("Nama Produk Yang akan Diperbarui Datanya : ");
        String produkName = input.nextLine();
        System.out.println("-----------------------------------------------------");
        System.out.println(" ");

        System.out.println("========================================");
        System.out.println("Pilih Pilih Data yang Ingin DIperbarui");
        System.out.println("=========================================");
        System.out.println("1. Nama Produk");
        System.out.println("2. Harga Produk");
        System.out.println("3. Stok Produk");
        System.out.println("4. Kembali ke Menu");
        System.out.println("------------------------------------------");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = input.nextInt();
        System.out.println("------------------------------------------");

        try {
            switch (pilihan) {
                case 1:
                    editNama(produkName);
                    break;
                case 2 :
                    editHarga(produkName);
                    break;
                case 3 :
                    editStok(produkName);
                    break;
                case 4 :
                    break;
                default:
                    System.out.println("Masukkan Pilihan yang Ada!!!!!");
                    showEditData();
            }
        } catch (Exception e) {
            System.out.println("Masukkan Pilihan dengan Benar!!!!!");
            showEditData();
        }
        input.close();
    }

    public static void editNama(String nama) {
        Scanner input = new Scanner(System.in);
        Produk produk = ControllerDB.getProdukbyNama(nama);
        System.out.println("========================================");
        System.out.println("EDIT NAMA");
        System.out.println("=========================================");
        System.out.println("Nama Lama Produk : "+produk.getName());
        System.out.print("Nama Baru Produk : ");
        String newName = input.nextLine();
        System.out.println("------------------------------------------");
        ControllerDB.updateNamaDB(produk.getId(), newName);
        System.out.println("Nama Produk Berhasil Diperbarui");
        System.out.println("------------------------------------------");
        Run.menuAwal();
        input.close();
    }

    public static void editHarga(String nama) {
        Scanner input = new Scanner(System.in);
        Produk produk = ControllerDB.getProdukbyNama(nama);
        System.out.println("========================================");
        System.out.println("EDIT HARGA");
        System.out.println("=========================================");
        System.out.println("Harga Produk Lama : "+produk.getPrice());
        System.out.print("Harga Produk Baru : ");
        Long newHarga = input.nextLong();
        System.out.println("------------------------------------------");
        ControllerDB.updateHargaDB(produk.getId(), newHarga);
        System.out.println("Harga Produk Berhasil Diperbarui");
        System.out.println("------------------------------------------");
        Run.menuAwal();
        input.close();
    }

    public static void editStok(String nama) {
        Scanner input = new Scanner(System.in);
        Produk produk = ControllerDB.getProdukbyNama(nama);
        System.out.println("========================================");
        System.out.println("EDIT STOK");
        System.out.println("=========================================");
        System.out.println("Stok Produk Lama : "+produk.getStock());
        System.out.print("Stok Produk Baru : ");
        int newStok = input.nextInt();
        System.out.println("------------------------------------------");
        ControllerDB.updateStokDB(produk.getId(), newStok);
        System.out.println("Stok Produk Berhasil Diperbarui");
        System.out.println("------------------------------------------");
        Run.menuAwal();
        input.close();
    }
}
