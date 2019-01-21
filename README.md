# Soal praktek

1. Buatlah project dengan springboot untuk membuat aplikasi dengan tema e-commerce (Toko online)
2. Ketentuan minimal system yang harus di handle
    - Master data toko
    - Master data produk
    - Transaksi Penjualan (Flow transaksi bebas)
    - Master pelanggan

# Soal teori

1. Apa fungsi Hibernate ORM dan jelaskan mengapa?
Hibernate adalah sebuah objek yang melakukan "mapping" data dari model representasi objek ke relasional repsesentasi data.   
Menghubungkan antara tabel database dengan Class java, serta mengubah tipe data java ke tipe data SQL. 
2. Jelaskan menurut pendapat anda dari beberapa fungsi annotation di hibernate seperti berikut:
    - ```@Entity```
    untuk menandai suatu "class" agar bisa di mapping ke dalam tabel.
    - ```@Table```
    jika sebuah "class" telah di beri annotation @Entity maka annotation ini mejadi opsional akan digunakan atau tidak.
    - ```@Column```
    jika sebuah "class" telah di beri annotation @Entity maka annotation ini mejadi opsional akan digunakan atau tidak.
    - ```@OneToOne```
    untuk menghubungkan suatu relasi atau hubungan antara satu tabel ke satu tabel lain yang terhubung dengan tabel tsb.
    - ```@ManyToOne```
    untuk menghubungkan suatu relasi atau hubungan antara banyak tabel ke beberapa tabel yang harus terhubung. 
    - ```@OneToMany```
    untuk menghubungkan suatu relasi atau hubungan antara satu tabel ke beberapa tabel yang terhubung dengan tabel tsb.
    contoh didalam tabel jenis alfabet terdapat abjad kemudian abjad harus terhubung dengan A,B,C dst..
    - ```@JoinColumn```
    annotation ini untuk menggabungkan "Column" dalam sebuah tabel
    - ```@JoinTable```
    untuk menggabungkan tabel dengan tabel
    - ```@GeneratedValue```
    untuk mendapatkan random id ataupun random string
    
3. Jelaskan menurut pendapat anda mengenai Dependency injection di springframework?

4. Jelaskan menurut pendapat anda mengenai container / context di spring framework?
container/context pada spring framework adalah tempat kita untuk meletakan kode pemrograman yang kita buat.
5. Jelaskan menurut pendapat anda fungsi dari beberapa fitur annotation di spring frameork seperti berikut:
    - ```@ComponentScan```
    annotation ini digunakan untuk mengetahui mana package yang berisi konten yang kita sebutkan
    - ```@Autowired```
    untuk menggantikan "setter dan constuctor injection" dan semua field atau property yang memiliki annotation @Autowired
    akan diisikan secara default dengan tipe data yang sesuai
    - ```@Bean```
    
    - ```@Component```
    generik untuk semua komponen spring annotation ini sudah satu paket dengan @Repository @Service dan @Controller
    - ```@Repository```
    untuk menandai semua Class yang berisi stereotype (Data Acces Object) pada persistence layer.
    - ```@Service```
    stereotype (Data Access Object) pada service layer
    - ```@Controller```
    stereotype (Data Access Object) pada presentation layer 
    - ```@RestController```
    
    - ```@RequestMapping```
    annotiation untuk meminta class untuk menghandle mapping dengan metode yang flexible
    - ```@GetMapping```
    request untuk mengambil mapping HTTP
    - ```@PostMapping```
    request untuk memberikan mapping HTTP
    - ```@PutMapping```
    
    - ```@DeleteMapping```
    request untuk menghapus mapping HTTP
## Cara mengerjakan

- Fork repository ini, kemudian setelah di fork, clone ke local komputer anda.
- Setelah selesai silahkan di push ke repository masing-masing.
- Selamat mengerjakan :) & good luck
