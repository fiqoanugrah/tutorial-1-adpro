## **Hi! :wave:, I'm Muhammad Fiqo Anugrah and this is my Exercise repo for Tutorial 1 Adpro C**

> Reflection 1 :
> Clean Code Principles Applied:

1. Meaningful Names: Saya menggunakan nama _variables, methods_ , and _Classes_ yang deskriptif dan berarti (misalnya, ProductController, deleteProduct, productService) untuk memastikan kode tersebut mudah dipahami.

2. Small Functions: Saya melakukan upaya untuk menjaga _methods_ agar tetap ringkas, dengan fokus pada satu _responsibility_. Contohnya, createProductPost hanya menangani create produk, sedangkan deleteProduct khusus menangani operasi deletion.

3. Refactoring: Sepanjang proses pengembangan, saya terus-menerus merombak kode untuk meningkatkan keterbacaan dan mengurangi kompleksitas dari kode". Ini termasuk menyederhanakan conditional expressions yang dapat digunakan kembali ke dalam metode yang terpisah.

4. Coding Style yang konsisten: Saya tetap berupaya menggunakan gaya kode yang konsisten dari indentasi, spasi, dan pengurutan methods, yang meningkatkan keterbacaan dan kemudahan maintainability.

> Secure Coding Practices Applied:

1. Memastikan Validasi dan Penanganan Kesalahan yang Tepat: Saya menerapkan validasi input pengguna dan penanganan kesalahan yang kuat untuk mengelola nilai atau perilaku yang tidak terduga dengan anggun, terutama di metode kontroler kami.

2. Menggunakan CSRF Protection: Dengan memanfaatkan fitur CSRF protection bawaan Spring Security, saya memastikan semua form submission kdilindungi dari serangan CSRF.

3. Saya Menerapkan Keamanan pada Tingkat Metode: Menggunakan Spring Security, saya membatasi akses ke operasi tertentu berdasarkan peran pengguna, memperkuat keamanan aplikasi.



> Improvement Areas:

Kesalahan dalam kode awal adalah menggunakan @GetMapping untuk operasi delete. Untuk memperbaiki, saya ganti dengan @PostMapping pada metode delete di ProductController, sehingga lebih sesuai dengan praktik RESTful dan meningkatkan keamanan.
