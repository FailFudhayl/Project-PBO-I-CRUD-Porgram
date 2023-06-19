package com.feature;

import com.Run;
import com.controller.ControllerDB;

public class ReadDB {
    public static void showData() {
        System.out.println("==================================");
        System.out.println("Inilah Data Produk Anda Saat ini");
        System.out.println("==================================");
        ControllerDB.readDB();
        System.out.println("----------------------------------");
        System.out.println(" ");
        Run.menuAwal();
    }
}
