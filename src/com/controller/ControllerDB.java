package com.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.config.MyConfig;
import com.models.Produk;
import com.models.Riwayat;

public class ControllerDB extends MyConfig{
    public static void readDB() {
        connection();
        try {
            query = "SELECT NAMA_PRODUK, HARGA, JUMLAH FROM produk_tabel";
            preparedStatement= connect.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(
                    String.format("%s - Rp.%d - Stok %d", resultSet.getString("NAMA_PRODUK"), resultSet.getInt("HARGA"), resultSet.getInt("JUMLAH"))
                );
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertDB(String produk,  Long harga, Integer stok) {
        connection();
        query= "INSERT INTO produk_tabel (NAMA_PRODUK, HARGA, JUMLAH) VALUES (?, ?, ?)";
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setString(1, produk);
            preparedStatement.setLong(2, harga);
            preparedStatement.setInt(3, stok);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateProdukDB(String nama, Long harga, int jumlah) {
        connection();
        query = "UPDATE produk_tabel SET HARGA=?, HARGA=? WHERE NAMA_PRODUK=?";
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setString(3, nama);
            preparedStatement.setLong(1, harga);
            preparedStatement.setInt(2, jumlah);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateNamaDB(int id, String name) {
        connection();
        query= "UPDATE produk_tabel SET NAMA_PRODUK=? WHERE ID=?";
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateHargaDB(int id, Long harga) {
        connection();
        query= "UPDATE produk_tabel SET HARGA=? WHERE ID=?";
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setLong(1, harga);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateStokDB(int id, Integer stok) {
        connection();
        query= "UPDATE produk_tabel SET JUMLAH=? WHERE ID=?";
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setInt(1, stok);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean deletDB(String nama) {
        connection();
        query= "DELETE FROM produk_tabel WHERE NAMA_PRODUK=?";
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setString(1, nama);
            int rowDelete = preparedStatement.executeUpdate();
            if (rowDelete>0) {
                return true;
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static Produk getProdukbyNama(String nama){
        Produk produk = null;
        connection();
        query = "SELECT * FROM produk_tabel WHERE NAMA_PRODUK=?";
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setString(1, nama);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                produk = new Produk(resultSet.getInt("ID"), resultSet.getString("NAMA_PRODUK"), resultSet.getLong("HARGA"), resultSet.getInt("JUMLAH"));
            }
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return produk;
    }
}
