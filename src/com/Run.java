package com;

import java.util.Scanner;
import com.feature.DeleteDatas;
import com.feature.EditDatas;
import com.feature.InsertDatas;
import com.feature.ReadDB;

public class Run {
    public static void menuAwal() {
        System.out.println("==================================");
        System.out.println("WELCOME TO CRUD DATABASE PROGRAM");
        System.out.println("==================================");
        System.out.println("1. Read/Show Data");
        System.out.println("2. Insert Data");
        System.out.println("3. Update/Edit Data");
        System.out.println("4. Delete Data");
        System.out.println("5. Keluar");
        System.out.println("----------------------------------");
        choice();
    }

    public static void choice() {
        System.out.print("Masukkan pilihan anda : ");
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        System.out.println("----------------------------------");
        System.out.println(" ");

        try {
            switch (pilihan) {
                case 1:
                    ReadDB.showData();
                    break;
                case 2:
                    InsertDatas.insertDatas();
                    break;
                case 3:
                    EditDatas.showEditData();
                    break;
                case 4:
                    DeleteDatas.hapustDatas();
                    break;
                case 5:
                    System.out.println("----------------------------------");
                    System.out.println("Terimakasih Telah Berkunjung");
                    System.out.println("----------------------------------");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Masukkan pilihan yang benar");
                    choice();
            }
        } catch (Exception e) {
            System.out.println("MASUKKAN INPUTAN YANG BENARR!!!!");
        }
        

        input.close();
    }
}
