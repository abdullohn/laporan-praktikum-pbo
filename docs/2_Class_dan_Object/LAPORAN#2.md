# Laporan Praktikum #2 - Pengantar Konsep PBO

## Kompetensi

 Mahasiswa dapat memahami deskripsi dari class dan object 

 Mahasiswa memahami implementasi dari class 

 Mahasiswa dapat memahami implementasi dari attribute 

 Mahasiswa dapat memahami implementasi dari method 

 Mahasiswa dapat memahami implementasi dari proses instansiasi

 Mahasiswa dapat memahami implementasi dari try-catch 

 Mahasiswa dapat memahami proses pemodelan class diagram menggunakan UML 

## Ringkasan Materi

Class dan Object
 Pada pertemuan sebelumnya anda sudah diberikan banyak penjelasan secara semantic (makna) mengenai deskripsi dari class dan object. Secara singkat class adalah abstraksi dari sebuah object (nyata ataupun tdk nyata) (roger s pressman). Apabila kita ingin membuat class mahasiswa, maka kita perlu melakukan abstraksi (mengindikasi bagian – bagian penting yang merepresentasikan benda itu sendiri) dari object mahasiswa itu sendiri. Contoh salah satu attribute yang mengidentifikasi jika seseorang itu mahasiswa adalah Nim (Nomor Induk Mahasiswa), dan Nim tidak akan anda temui pada attribute dosen. Selain attribute abstraksi juga digunakan untuk behavior (perilaku) , contoh salah satu perilaku yang bisa dilakukan oleh mahasiswa adalah mengikuti UAS, dan anda juga tidak akan pernah menemui perilaku tersebut pada object dosen. Oleh karena itu sangat mudah untuk seorang perancang system dalam memodelkan sebuah class dari sebuah object tertentu.  Setelah kita memahami secara semantic pengertian dari class dan object, maka langkah selanjutnya adalah bagaimana cara melakukan implementasi class pada pendekatan Object Oriented Programming, terutama pada bahasa pemrograman java. Berikut adalah sintaks dari deklarasi class pada pemrograman java : 

 ![Materi1](img/Materi1.PNG)

 Aturan penulisan class adalah sebagai berikut: 
 1. Berupa kata benda, 
 2. Diawali dengan HURUF BESAR, 
 3. Jika terdiri dari lebih dari 1 kata, maka antar kata satu dengan kata yang lain digandeng, dan tiap huruf awal dari tiap kata menggunakan HURUF BESAR. 

Untuk Access Modifier tidak dibahas pada jobsheet ini, melainkan akan dibahas pada jobsheet berikutnya

Contoh deklarasi class: 

![Materi2](img/Materi2.PNG)

Attribute
Untuk melakukan pendeklarasian attribute dapat dilakukan dengan sintaks sebagai berikut: 

![Materi3](img/Materi3.PNG)

Aturan penulisan atribut adalah sebagai berikut: 
1. Berupa kata benda, 
2. Diawali dengan HURUF KECIL, 
3. Jika terdiri dari 2 atau lebih kata, kata pertama diawali HURUF KECIL sedangkan kata selanjutnya diawali HURUF BESAR. Dan antar kata disambung tidak (dipisah).

Contoh deklarasi attribute: 

![Materi4](img/Materi4.PNG)

Method
Method adalah suatu blok dari program yang berisi kode program nama dan properti yang dapat digunakan kembali. Method dapat mempunyai nilai balik atau tidak. Method yang tidak mempunyai nilai balik dipanggil dalam pernyataan yang akan dikerjakan, sedangkan method yang mempunyai nilai balik dipanggil dari suatu ekpresi. Kata kunci untuk mengembalikan/mengeluarkan suatu nilai adalah return Method dengan tipe data void, berarti tidak memiliki nilai balik, berarti tidak memerlukan kata kunci return di dalamnya. Method dengan tipe data bukan void, berarti memerlukan suatu nilai balik, yaitu harus memerlukan return di dalamnya 
 
Deklarasi method dapat dilakukan dengan sintaks sebagai berikut:

![Materi5](img/Materi5.PNG)

Contoh method dengan tipe void dan method yang mengembalikan nilai (return)

![Materi8](img/Materi8.PNG)

Aturan penulisan method adalah sebagai berikut: 
1. Berupa kata kerja, 
2. Diawali dengan HURUF KECIL, 
3. Jika terdiri dari 2 atau lebih kata, kata pertama diawali HURUF KECIL sedangkan kata selanjutnya diawali HURUF BESAR. Dan antar kata disambung tidak (dipisah). 

Contoh deklarasi method: 

![Materi6](img/Materi6.PNG)

Object  
Setelah Class dibuat, langkah selanjutnya adalah membuat Object. Proses pembuatan Object dari suatu Class disebut instansiasi. Format dasar instansiasi adalah sebagai berikut: 

![Materi7](img/Materi7.PNG)

Try – catch
Untuk menangani error di Java, digunakan sebuah statement yang bernama try - catch. Statement tersebut digunakan untuk mengurung eksekusi yang menampilkan error dan dapat membuat program tetap berjalan tanpa dihentikan secara langsung. Error yang ditangani oleh try – catch biasa disebut dengan exception. 

UML

Unified Modeling Language ( UML ) adalah tujuan umum, perkembangan, bahasa pemodelan di bidang rekayasa perangkat lunak , yang dimaksudkan untuk menyediakan cara standar untuk memvisualisasikan desain sistem. UML menyediakan sembilan jenis diagram yaitu Diagram kelas (Class Diagram), Diagram paket (Package Diagram), Diagram use-case (Usecase Diagram), Diagram interaksi dan sequence (Sequence Diagram), Diagram komunikasi (Communication Diagram), Diagram statechart (Statechart Diagram), Diagram aktivitas (Activity Diagram), Diagram komponen (Component Diagram), dan Diagram deployment (deployment diagram). Pada materi ini yang akan dipelajari adalah diagram class (class diagram). 
 

## Percobaan

### Percobaan 1
Pada percobaan ini, membuat sebuah class diagram dimana ada sebuah data karyawan dimana tiap karyawan memiliki id,nama,jenis kelamin,jabatan,dan gaji. Dan dapat menampilkan data diri pribadi dan melihat gajinya.
#### class Diagram

![Percobaan1](img/Percobaan1.PNG)

2. Sebutkan Class apa saja yang bisa dibuat dari studi kasus 1!

jawab :
Class Karyawan dan Class KaryawanMain

3. Sebutkan atribut beserta tipe datanya yang dapat diidentifikasi dari masing-masing class dari studi kasus 1! 

Jawab :
- id : Int 
- Nama : String 
- Jenis kelamin : String
- Jabatan : String 
- Gaji  : Int

4. Sebutkan method-method yang sudah anda buat dari masing-masing class pada studi kasus 1! 

jawab :
Public void tampilDataDiri() dan  TampilGaji().

### Percobaan 2

Pada percobaan tersebut, membuat sebuah program berdasarkan class diagram, yaitu class diagram Mahasiswa

![Percobaan2](img/Percobaan2.PNG)

Contoh link kode program : [Mahasiswa1841720209](../../src/2_Class_dan_Object/Mahasiswa1841720209Abdulloh.java)

Setelah membuat program class Mahasiswa, selanjutnya membuat class main, yaitu sebuah instance dari class Mahasiswa.


![Percobaan3](img/Percobaan3.PNG)

Contoh link kode program : [MahasiswaMain1841720209Abdulloh](../../src/2_Class_dan_Object/MahasiswaMain1841720209Abdulloh.java)

7. Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas!

jawab :
Proses pendeklarasian atribut terjadi pada class mahasiswa dari baris 2 sampai dengan baris 5

8. Jelaskan pada bagian mana proses pendeklarasian method pada program diatas! 

jawab :
Proses pendeklarasian method terjadi di class mahasiswa pada baris ke 7

9. Berapa banyak objek yang di instansiasi pada program diatas! 

jawab :
Banyak objek pada instansiasi hanya satu yaitu pada class MahasiswaMain

10. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101” ? 

jawab:
Sebenernya hanyalah menampilkan objek

11. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()” 

jawab :
Sebenarnya cuma untuk menampilkan output yang dihasilkan

### Percobaan 3

Pada percobaan ini mahasiswa diharapkan membuat pemrograman dengan Class Barang dimana pada pemrograman tersebut memiliki argument/parameter dan memiliki return.


![Percobaan4](img/Percobaan4.PNG)

Contoh link kode program : [Barang1841720209Abdulloh](../../src/2_Class_dan_Object/Barang1841720209Abdulloh.java)


![Percobaan5](img/Percobaan5.PNG)

Contoh link kode program : [BarangMain1841720209Abdulloh](../../src/2_Class_dan_Object/BarangMain1841720209Abdulloh.java)

7. Apakah fungsi argumen dalam suatu method? 

jawab :
Fungsi argumen dalam suatu method adalah fungsi yang  memberi nilai bedasarkan suatu method

8. Ambil kesimpulan tentang kegunaan dari kata kunci return , dan kapan suatu method harus memiliki return!

jawab:
Return adalah kata kunci untuk mengembalikan atau mengelluarkan suatu nilai, method  dengan tipe data void , berarti tidak memerlukan kata kunci return di dalamnya method dengan tipe data bukan void berarti memerlukan kata return

## Tugas


#### 1. Class Diagram Pada Studi Kasus Persewaan Video Game

![tugas1](img/tugas1.PNG)

#### 2. Program dari No 1

![Tugas2](img/Tugas2.PNG)

Contoh link kode program : [Peminjaman1841720209Abdulloh](../../src/2_Class_dan_Object/Peminjaman1841720209Abdulloh.java)

#### Program Mainnya

![Tugas3](img/Tugas3.PNG)

Contoh link kode program : [PeminjamanMain1841720209Abdulloh](../../src/2_Class_dan_Object/PeminjamanMain1841720209Abdulloh.java)

#### 3. Class Lingkaran

![Tugas4](img/Tugas4.PNG)

Contoh link kode program : [Lingkaran1841720209Abdulloh](../../src/2_Class_dan_Object/Lingkaran1841720209Abdulloh.java)

##### Program Main Class Lingkaran

![Tugas5](img/Tugas5.PNG)

Contoh link kode program : [LingkaranMain1841720209Abdulloh](../../src/2_Class_dan_Object/LingkaranMain1841720209Abdulloh.java)

#### 4. Class Tugas Barang 

![Tugas6](img/Tugas6.PNG)

Contoh link kode program : [TugasBarang1841720209Abdulloh](../../src/2_Class_dan_Object/TugasBarang1841720209Abdulloh.java)

##### Program Main Class Tugas Barang

![Tugas7](img/Tugas7.PNG)

Contoh link kode program : [TugasBarangMain1841720209Abdulloh](../../src/2_Class_dan_Object/TugasBarangMain1841720209Abdulloh.java)

## Kesimpulan

Jadi dari pembelajaran tersebut kita dapat memahami deskripsi class dan object, implementasi dari class tersebut, dan implementasi dari method, proses intansiasi, try-catch. kita juga dapat memahami proses pemodelan class diagram menggunakan UML.

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

Abdulloh