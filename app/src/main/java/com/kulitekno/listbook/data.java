package com.kulitekno.listbook;
import java.util.ArrayList;

public class data {
    private static String[] bookNames = {
            "Boundaries: When to Say Yes, How to Say No to Take Control of Your Life",
            "Cryptocurrency Investing Bible: The Ultimate Guide About Blockchain, Mining, Trading, ICO, Ethereum",
            "Food: What the Heck Should I Eat?",
            "Hooked: How to Build Habit-Forming Products",
            "How to Study 7th Edition",
            "Influence: The Psychology of Persuasion",
            "Life 3.0: Being Human in the Age of Artificial Intelligence",
            "The 5 Second Rule: Transform your Life, Work, and Confidence with Everyday Courage",
            "The Seven Principles for Making Marriage Work",
            "The Art of Computer Programming"
    };

    private static String[] bookDetails = {
            "Buku` Batas: kapan berkata iya dan tidak, bagaimana berkata iya dan tidak dapat mengontrol kehidupanmu`. Buku ini akan mengajarkan bagaimana kita berkata tidak dan iya. apa dampak dari berkata iya dan tidak dalam memutuskan sesuatu. Dan kapan waktu tepatnya kita harus berkata iya atau tidak. Mengapa  berkata iya dan tidak tersebut penting dan krusial sehingga akan dapat menentukan arah hidup. apa sebenarnya arti dari hal tersebut. Perataan iya dan tidak terlihat sederhana akan tetapi dalam maknanya. selengkapnya dibahas dalam buku ini.",
            "Buku ini sangat menarik untuk dibaca. buku yang membahas mata uang digital. mata uang yang menjamin keamanan dan kepercayaan antar penggunanya. setiap transaksi dapat dilihat oleh semua ornag dan saling melihat satu sama lainnya. dalam buku ini akan dijelaskan apa mata uang digital itu. bagaimana cara kerja dari mata uang digital tersebut. dan apaah saya bisa berinvestasi atau tidak bergantung dengan keadaan mta uang digital tersebut. baca selengkapya dalam buku ini.",
            "Buku `Apa yang harus saya makan?`. Makanan menjadi hal pokoko karena akan mensuplai kebutuhan dari tiap sel yang ada didalam tubuh. tapi bagaimana dengan kualitas dan keadaaa makanan yang kita makan tersebut tidak mengganggu dn atau merusak sel di tiap tubuh kita. apa yang harusnya dimakan dan apa yang harsunya dihindari. banyak spekulasi di media yang menyatakan makanan a itu menyehatkan akan tetapi beberapa saat kemudian mengatakan kembali bahwa makanan a tersebut tidak sehat. bagai mana terus kalau spekulasi dan infomasi yang diperoleh begitu banyak dan bias. apa yang harus kita makan sebetulnya. dalam buku ini dibahas apa yang harus kita makan.",
            "Buku `Ketagihan: Bagaimana membangun kebiasaaan membuat produk`. sebanyak 70 persen setia pemilik smartphone akan mengecek hp sebanyak minimal 15 kali dalam sehari. dan tak dapat dipungkiri juga kadang kita melakukannya bahkan sampai ratusan kali dalam sehari. kita secara tidak sadar dan sengaja melakukan cek notifikasi wa atau notif media sosial. tidak sengaja mebuka yoututbe, facebook, instagram hanya sejkedar melihat tapi kenyataannya melakukan scroll bejam jam. secara tidak sadar sebenarnya kita telah ketagihan. dalam perusahaan produk menjadi titik penting, bisa pelanggan sudah tidak melirik produknya mereka akn pergi begitu saja. disini lah penting untuk membuat kebiasaan untuk terus  berinovasi dan mempertahankan kebiasaaan meciptakan produk. selengkapnya dapat deiperoleh dari buku ini.",
            "Buku `Bagai mana cara belajar`. Buku yang sangat menarik dimana dalam buku ini kana diceritaan bagaimana sih cara terbaik dalam mempelajari sesuatu. Bagaimana menentukan titik awal dan titik akhir atau titik berhasil dalam mempelajari sesuatu. Dalam buku ini akan juga diceritakan apa saja yang harus dilakukan dalam belajar, apa yang perlu disiapkan semuanya terangkum dalam buku ini. mengingat buku ini telah mengalami perjalanan panjang perubahan dari feedback yang diperoleh sampai saat ini sudah mencapai edisi ke 7. Buku yang penting karena hal pertama yang harus dipelajari dari esensi manusia adalah belajar dan yang utama dalam belajar adalah kemampuan membaca. `iqro`",
            "Buku `Mempengaruhi: psikologi dari membujuk`. Secaa tidak sadar kadag kita akan memihak dan atau mengikuti sesuatu karena ketidak sadaran. secara tidak sengaja menyetujuan suatu ajakan atau bujukan. secra tidak mengerti kenapa kita bisa menginnginkan sesuatu itu padahal iklan lain tidak tapi entah kenapa kalau orang tertentu tau akat kata ajaib tertentu kita bisa memihak dan terpikat. Pak robet telah melakukan penelitian dan pprose pengungkapan fakta dari berbagai sisi dan dalam waktu yang tidak singkat. dalam berbagai penelitian dan percobaan tersebut ditemukan beberapa prinssip yang ditemukan yang menjadi kunci atau metode dalam membujuk. hal hal tersebut secara ringkas dan rinci tertuang didalam buku ini.",
            "Buku `kehidupan 3.0: Hidup di masa kecerdasan buatan`. Dalam buku ini diceritana bagai mana kehidupan dalam masa kecerdasan buatan, banyak sekali cerita cerita mengenai bagai mana kehidupan di msaa kecerdasan buatan ini dan pengaruhnya dalam kehidupan dan berbagai aspek kehidupan. bagaimana kehidupan mendatang dan bagai mana pada masa kecerdasan ini bnyak hal yang berubah. banyak sekali perkembangan teknologi yang teradi dan pekerjaan banyak dikerjakan oleh kecerdasan buatan. semua cerita dan keadaannya tertuang didalam buku ini.",
            "Buku `Aturan 5 detik : mengubah hidup, kerja dan kepecayaan diri denga keberanian setiap hari`. Buku karangan Mel robin ini merupakan buku yang menarik untuk dibaca. dalam aturan lima detik tersebut telah mengubah kehidupan semua orang termasuk mel robin sendiri. bagaiaman hal tersebut bisa dilakukan. bagaimana bisa selama kitabmenggunaka aturan 5 detik tersebut bisa mengubah hidup. kenpa juga keberanian dalam kehidupan setiap hari juga menjadi faktor penting. setiap pertanyaan tersebut akan dijawab dalam buku ini. 5 detik saja dapat mengubah hidupmu.",
            "Buku `tujuh prinsip sukses dalam pernikahan`. Seperti namanya buku ini akan menjadi panduan setiap pasangan agar dapat menjalankan pernikahannya. buku ini telah di kembangkan dan disusun berdasarkan penelitian yang telah penulis lakukan dari berbagai organisasi dan lembaga yang lainnya. buku ini memuat tujuh prinsip yang harus diikuti agar sukses dalam pernikahan. tanpa adanya prinsip yang baik dan jelas perniahan bisa menjadi sebuah bencana dan enghalang mimpi di mas depan. temukan lebih jelasnya dalam buku ini.",
            "Buku `Seni pemrograman komputer`. Dalam buku ini akan dijabarkan apa itu algoritma dan bagaimana perancangannya. melihat algoritma tidak hanya sebagai aturan dan angjah saja tapi bagai mana memahami algoritma menjadi suatu seni yang tak dapat diindahkan lagi. setiap kegiatan akan ada unsur kaitan dengan algoritma dan dalam buku ini akan menjelaskan bagai mana sesuatu algoritma dijalankan dan fakta fakta dibalik kebenaran adanya algoritma. dijelaskan pula beberapa stilah dan hal yang terjadi dilatarbelakang yang tidak tampak dipermukaan pula dibahas rinci dalam buku ini.",
    };

    private static int[] bookImages = {
            R.drawable.b1,
            R.drawable.b2,
            R.drawable.b3,
            R.drawable.b4,
            R.drawable.b5,
            R.drawable.b6,
            R.drawable.b7,
            R.drawable.b8,
            R.drawable.b9,
            R.drawable.b10,
    };

    private static String[] penulis = {
            "Henry Cloud and John Townsend",
            "Alan T. Norman",
            "Mark Hyman",
            "Nir Enyal",
            "Fry, Ronald W.",
            "Robert B. Cialdini, Ph.D.",
            "Max Tegmark",
            "Mel Robbins",
            "John M. Gottman, Ph.D.",
            "Donald Knuth, dkk",
    };

    private static String[] terbit = {
            "2001",
            "2018",
            "2017",
            "2016",
            "2011",
            "2009",
            "2017",
            "2017",
            "2009",
            "2012",
    };

    private static String[] halaman = {
            "357",
            "120",
            "614",
            "535",
            "250",
            "278",
            "440",
            "252",
            "277",
            "664",
    };

    private static String[] genre ={
            "Pengembangan diri",
            "Mata Uang Digital",
            "makanan dan nutrisi",
            "Produktifitas",
            "Pendidikan",
            "Psikologi",
            "Kecerdasan Butan",
            "Manajemen Waktu",
            "Keluarga",
            "Pemrograman Komputer",
    };


    static ArrayList<book> getListData() {
        ArrayList<book> list = new ArrayList<>();
        for (int i = 0; i < bookNames.length; i++) {
            book book = new book();
            book.setName(bookNames[i]);
            book.setDetail(bookDetails[i]);
            book.setPhoto(bookImages[i]);
            book.setPenulis(penulis[i]);
            book.setTerbit(terbit[i]);
            book.setHalaman(halaman[i]);
            book.setGenre(genre[i]);
            list.add(book);
        }
        return list;
    }
}
