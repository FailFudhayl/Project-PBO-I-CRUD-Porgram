# App.java
didalam 'App.java' terdapat method main yang berisi 

Run.menuAwal();
yang akan memanggil atau menampilkan menu atau fitur yang terdapat di dalam method atau class menu

# com
terdapat beberapa package yaitu:
1. config
2. controller
3. feature
4. models
5. class Run

## 1. config
terdapat method MyConfig
MyConfig : berguna untuk menghubungkan code dengan database

## 2. Controllers
terdapat beberapa method yang gunanya untuk mengontrol database
readDB : berfungsi untuk print atau mengambil semua data dari database
insertDB : berfungsi memasukkan data ke dalam database
updateNamaDB : berfungsi untuk update nama di database
updateHargaDB : berfungsi untuk update harga di database
updateStokDB : berfungsi untuk update stok di database
deleteDB : berfungsi menghapus 1 row produk di database
getProdukbyNama : berfungsi mengambil objek produk dari database berdasarkan nama produknya

## 3.feature
terdapat beberapa class yaitu :

### DeleteDatas
terdpat method hapusData yang dipanggil akan menampilkan menu untuk menghapus data

### EditDatas
terdapat beberapa method :
1. showeditData : menampilkan piihan edit data 
2. editNama : menampilkan menu untuk edit nama serta untuk update/edit nama dari database
3. editHarga : menampilkan menu untuk edit harga serta untuk update/edit harga dari database
4. editStok : menampilkan menu untuk edit stok serta untuk update/edit stok dari database

### InsertDatas
terdapat method insertDatas untuk menampilkan menu untuk memasukkan data ke dalam database dan juga langsung memasukkan data ke dalam database

### ReadDB 
terdapat method showData yang menampilakn semua database produk


## 4. Models
terdapat class produk 
produk : sebuah class yang menampung atribut atibut dari objek produk

## 5. method run 
berfungsi untuk menampilkan menu utama dalam aplikasi ini