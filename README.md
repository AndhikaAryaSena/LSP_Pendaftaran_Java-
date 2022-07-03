# LSP_Pendaftaran_Java-

Program ini adalah contoh program untuk pendaftaran sekolah dengan menggunakan Java dengan library Hibernate

Membuat Package Program

![image](https://user-images.githubusercontent.com/108450178/177038965-b0d13361-54d8-433f-8b1e-fb2671eba7da.png)

Memasukkan Library

![image](https://user-images.githubusercontent.com/108450178/177038969-b4d28a83-26a3-4589-b766-ec398d4dd47b.png)

 
Membuat JFrameForm login dalam package pendaftaran.com.view

![image](https://user-images.githubusercontent.com/108450178/177038971-f6fc86ae-52ee-452c-8234-570e74d38c0a.png)
 
Pembuatan class dan inisialisasi komponen yang sudah dibuat

![image](https://user-images.githubusercontent.com/108450178/177038975-df6f6e39-1d29-4346-bc75-0e1d566a87c7.png)

Memasukkan perintah kedalam button yang ada di form login untuk berpindah ke form lainnya

![image](https://user-images.githubusercontent.com/108450178/177039005-39e257ea-b6df-412c-908c-89ebc8a99a5b.png)

Dalam perintah button diatas dibagi menjadi 2 kondisi, jika username & password berisikan user, maka akan ditampilkan form untuk user, jika username & password berisikan admin maka akan ditampilkan form untuk admin. Pada gambar dibawah ini adalah perintah untuk menampilkan form saat dilakukan run program.

![image](https://user-images.githubusercontent.com/108450178/177039015-15273d06-70f8-43b1-8c84-a3c80a9df85c.png)
 
Pembuatan javaclass PendaftaranApp dalam pendaftaran.com.model

![image](https://user-images.githubusercontent.com/108450178/177039023-841f8196-14f1-453c-a47f-0963f466913b.png)

Dalam class PendaftaranApp ini, digunakan sebagai pembuatan isi tabel, entitas yang terbuat adalah Id dengan nama kolom, No_UN, Nama_Lengkap, Jenis_Kelamin, Tanggal_Lahir, Asal_Sekolah, dan Agama dengan tipe data semuanya String.
 
![image](https://user-images.githubusercontent.com/108450178/177039032-04a3d279-f55c-44fd-bdad-856a53f6675f.png)

Pembuatan java interface PendaftaranDao dan Java class PendaftaranImpl di dalam pendaftaran.com.dao

![image](https://user-images.githubusercontent.com/108450178/177039044-590de8fe-ff45-4e2c-87af-f6c708c60344.png)

Dalam interface PendaftaranDao hanya membuat objek Save, Update, Delete, get dan getlist dari class PendaftaranApp dengan nama objek pendaftaran, objek tersebut belum ada perintah karena ini adalah java interface, maka akan dibuat di dalam package yang sama yaitu Javaclass Implementasi.
 
![image](https://user-images.githubusercontent.com/108450178/177039052-5ed5abb8-f60d-4518-9faf-113da7232cdb.png)
![image](https://user-images.githubusercontent.com/108450178/177039068-15e3fc0c-2bbd-4af8-b142-ce3c28db5f0a.png)
![image](https://user-images.githubusercontent.com/108450178/177039080-890760b9-216b-4c2d-8e5d-3238fb7f2bf5.png)

Dalam Javaclass PendaftaranImpl mengimplementasikan interface yang ada yaitu PendaftaranDao dengan mengisi perintah untuk Save, Delete, Update, get dan getlist. Di dalam perintah program tersebut dilakukan session factory yang berguna untuk membuka sesi untuk memulai transaksi dan commit dari perintah yang diberikan, pada perintah tersebut juga dilakukan try dan catch sehingga jika ketika program dijalankan saat di try gagal, maka akan berlanjut ke dalam catch yang berisi pesan error dan melakukan rollback.
 
Pembuatan Java Class PendaftaranController dalam package pendaftaran.com.controller 

![image](https://user-images.githubusercontent.com/108450178/177039096-c604efd3-4200-4bd3-aaee-fbeef63a6840.png)

 
Dalam controller ini membuat objek baru untuk form utama yaitu pendaftaranUtama yang berisikan button dan tabel yang perintahnya akan digunakan.

![image](https://user-images.githubusercontent.com/108450178/177039113-1197728b-8e03-4f44-a88e-19022a1c77d8.png)
 
Button clear diatas digunakan untuk menghapus text yang berada di text area.

![image](https://user-images.githubusercontent.com/108450178/177039119-8216c73a-0cd2-4842-aa65-7df00b431ccf.png)
 
Pada button save melakukan pembuatan objek instan PendaftaranApp untuk melakukan set pada variabel yang sudah ditentukan seperti UNNUM, NAMA, GENDER, TTL, ASALSKL, AGM. Dalam potongan program try dan catch dilakukan pemanggilan objek dari PendaftaranImpl extends PendaftaranDao untuk perintah save. Setelah data tersimpan dilakukan clear dan tabel akan mengambil data dari database dengan perintah getAllData.

![image](https://user-images.githubusercontent.com/108450178/177039125-6481b28e-d79f-4528-bf76-8ccce3f1cde1.png)
 
Pada button update melakukan hal yang sama untuk pembuatan objek instan dan pengambilan data pada try dan catch.
 
![image](https://user-images.githubusercontent.com/108450178/177039156-79f3c5f1-c236-45ed-a1e3-76a7ed1d21d6.png)

Pada button delete, harus memilih data di dalam tabel terlebih dahulu untuk menghapus, setelah data sudah dipilih melakukan pembuatan objek instan dan lakukan perintah delete pada objek yang sudah dipilih dengan kondisi target adalah UNNUM, kemudian dilakukan pertanyaan apakah ingin dihapus dan jika ya akan dilakukan pengambilan objek dari Implemen

![image](https://user-images.githubusercontent.com/108450178/177039183-945f7b6d-cd17-4fcb-b720-42aa23f48484.png)
 
Pada method getAllData dan getData dilakukan pengambilan objek dari table model dan menyambungkan method ke dalam form PendaftaranBaru.java

Pembuatan PendaftaranTableModel.java di dalam package pendaftaran.com.model

![image](https://user-images.githubusercontent.com/108450178/177039192-2df33562-1eee-4c1c-bcfa-d73db4aab3db.png)
 
Dalam tabel model ini dilakukan extends dengan AbstractTableModel, dan membuat objek listpendaftaran dengan tipe array, setelah itu membuat header dengan tipe data String untuk tampilan nama kolom pada tabel.
Potongan program dibawah ini berguna untuk mengatur ukuran tabel sesuai dengan isinya, kemudian menyesuaikan kolom dengan panjangnya, melakukan pengambilan index dengan memanggil data dari database contohnya dari pendaftaran getUNNUM.
Untuk nama kolom diambil dari header yang telah dibuat.

![image](https://user-images.githubusercontent.com/108450178/177039198-8ed494ff-b76c-4f3c-8417-c7468fae91c9.png)

Membuat PendaftaranUtil.java dalam package pendaftaran.com.config
 
![image](https://user-images.githubusercontent.com/108450178/177039207-e76f81dc-bc2b-42eb-bb3f-5caa66e76bc6.png)
![image](https://user-images.githubusercontent.com/108450178/177039223-996f8f09-5797-4313-b292-422701bb6ee9.png)

PendaftaranUtil ini berguna untuk membuat dan menyambungkan session yang berada di dalam PendaftaranImpl.

Membuat Jframe Form PendaftaranUtama.java untuk form user dan admin

![image](https://user-images.githubusercontent.com/108450178/177039232-5907607a-4099-477c-bc5a-0ab3eb4cfc83.png)
![image](https://user-images.githubusercontent.com/108450178/177039238-caea4aa0-2241-4b90-9b9a-ab0f5f1a60fb.png)

Dalam 1 frame tersebut terdapat 2 panel dimana jPanel1 berguna sebagai interface user dan jPanel2 sebagai interface admin.
 
![image](https://user-images.githubusercontent.com/108450178/177039242-eea2247f-dd0f-4ec5-85b6-8289a200bfbc.png)
![image](https://user-images.githubusercontent.com/108450178/177039253-669b03a3-87e0-4694-a478-91437a87fd56.png)
![image](https://user-images.githubusercontent.com/108450178/177039260-d48c693e-bad4-42a0-91cd-549e9467ea8f.png)
 
Dalam javax swing tersebut dilakukan encapsulate Textfield agar dapat dilakukan perintah get, kemudian membuat objek baru PendaftaranController, setelah itu melakukan inisialisasi semua komponen, memanggil method getAllData dan menyembunyikan jPanel3 yang berisi tabel dan text field untuk mengupdate pada bagian admin.


![image](https://user-images.githubusercontent.com/108450178/177039270-138dd484-849a-4ed3-9d7b-f04c1d2abfdb.png)
![image](https://user-images.githubusercontent.com/108450178/177039272-cafc252e-f001-4de6-bc67-2a245b68903f.png)

Untuk perintah button seperti save, update, delete cukup memanggil method yang berada di dalam PendaftaranController. Untuk menampilkan data dalam tabel memanggil method getData dari PendaftaranController juga.
Untuk button hide, show dan back tidak menggunakan PendaftaranController karena tidak ada methodnya, sehingga harus dibuatkan perintah secara manual di bagian tersebut.

Bagian terakhir adalah koneksikan program dengan database

![image](https://user-images.githubusercontent.com/108450178/177039285-60db4da4-0100-40be-95a7-2320a1681f03.png)

Memilih driver yang tersedia


![image](https://user-images.githubusercontent.com/108450178/177039291-0149d794-2698-4517-aa79-b8eb181aeb79.png)

Melakukan test koneksi hingga terlihat Connection Succeeded pada pojok kiri kotak dan klik finish.
 
![image](https://user-images.githubusercontent.com/108450178/177039295-eaa19543-8b43-4ae2-acc5-150052d4b895.png)
 
![image](https://user-images.githubusercontent.com/108450178/177039302-e95035e3-907a-4309-a68a-f9bf2c51d0d5.png)

Diatas ini adalah tampilan dari hibernate.cfg 

OUTPUT PROGRAM :

![image](https://user-images.githubusercontent.com/108450178/177039435-f1d50a96-3c5d-4b05-b9f0-cacd4cb284a4.png)
![image](https://user-images.githubusercontent.com/108450178/177039444-bb5355f9-ec43-4467-8a54-107fcef2be76.png)
![image](https://user-images.githubusercontent.com/108450178/177039451-e6b54fbd-e637-40f2-95a7-0e07449f8f15.png)
![image](https://user-images.githubusercontent.com/108450178/177039454-9f3d80fc-fca1-4c1d-b42a-f63d156c2c5d.png)

 
 
