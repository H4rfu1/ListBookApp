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
            "Dassault Rafale (dijuluki sebagai Squall dalam Bahasa Inggris) adalah pesawat tempur serbaguna generasi ke-4.5, bermesin dua, dan bersayap delta asal Prancis yang dibuat oleh Dassault Aviation. Rafale dirancang sebagai pesawat berpangkalan di daratan maupun di kapal induk. Program pesawat Rafale terdiri dari tiga versi pesawat tempur mesin-kembar multi-peran, versi satu-tempat duduk Rafale C, versi dua-tempat duduk Rafale B dan versi AL (kapal induk) adalah Rafale M. Tiga versi pesawat tempur ini dilengkapi dengan mesin, sistem tempur dan navigasi, sistem managemen pesawat dan sistem kontrol penerbangan yang sama. Mereka semua dapat melakukan semua tipe misi dari penyerangan daratan sampai superioritas udara. ",
            "Eurofighter Typhoon adalah pesawat tempur multirole generasi keempat dengan desain sayap Delta dan Canard buatan konsorsium bersama negara-negara Eropa dalam Eurofighter GmbH, Holding Company Eurofighter GmbH terdiri atas tiga perusahaan aeronautical ternama seperti Alenia Aeronautica (Itali), BAE System (United Kingdom), EADS ( Prancis, Jerman dan Spanyol) yang dibentuk mulai tahun 1986. Proyek tersebut dikelola oleh NATO Eurofighter and Tornado Management Agency. Sampai saat ini Typoon sudah dipakai di British Royal Air Force, German Luftwaffe, Italian Air Force, Spanish Air Force dan Austrian Air Force serta Saudi Arabia telah meneken kontrak pembelian senilai U.S$ 9.5 billion untuk 72 unit pesawat berbeda dengan Dassault Rafale yang belum menghasilkan kontrak di satu negarapun meskipun pengembangannya dilakukan bersama-sama pada awalnya. ",
            "F-16 sendiri dikenal memiliki kemampuan tempur di udara yang sangat baik, dengan inovasi seperti tutup kokpit tanpa bingkai yang memperjelas penglihatan, gagang pengendali samping untuk memudahkan kontrol pada kecepatan tinggi, dan kursi kokpit yang dirancang untuk mengurangi efek g-force pada pilot. Pesawat ini juga merupakan pesawat tempur pertama yang dibuat untuk menahan daya belokan pada percepatan 9g. F-16 mempunyai senapan M61 Vulcan pada bagian dalam badan pesawat serta 11 lokasi pylon untuk mnggotong senjata dan peralatan misi lainya. Nama resmi dari F-16 sendiri ialah\"Fighting Falcon\", tetapi \"Viper\" lebih umum digunakan oleh kru darat dan pilot-pilot pesawat tersebut, karena kemiripan bentuknya dengan ular Viperidae dan Starfighter Colonial Viper dari acara TV Battlestar Galactica.",
            "F-22 Raptor adalah pesawat tempur siluman buatan Amerika Serikat. Pesawat ini awalnya direncanakan untuk dijadikan pesawat tempur superioritas udara untuk digunakan menghadapi pesawat tempur Uni Soviet, tetapi pesawat ini juga dilengkapi peralatan untuk serangan darat, peperangan elektronik, dan sinyal intelijen. Pesawat ini melalui masa pengembangan yang panjang, versi prototipnya diberi nama YF-22, tiga tahun sebelum secara resmi dipakai diberi nama F/A-22, dan akhirnya diberi nama F-22A ketika resmi mulai dipakai pada Desember 2005. Lockheed Martin Aeronautics adalah kontraktor utama yang bertanggungjawab memproduksi sebagian besar badan pesawat, persenjataan, dan perakitan F-22. Kemudian mitranya, Boeing Integrated Defense Systems memproduksi sayap, peralatan avionik, dan pelatihan pilot dan perawatan. ",
            "F-35 Lightning II adalah hasil pengembangan dari pesawat X-35 dalam program Joint Strike Fighter. Pesawat ini adalah pesawat tempur supersonik berkursi tunggal, bermesin tunggal, yang dapat melakukan banyak fungsi, antara lain pertempuran udara-ke-udara, dukungan udara jarak dekat, dan pengeboman taktis. Pengembangan pesawat ini dibiayai oleh Amerika Serikat, Britania Raya dan beberapa negara lainnya. Pesawat ini dikembangkan dan diproduksi oleh industri kedirgantaraan yang dipimpin oleh Lockheed Martin serta dua rekan utamanya, BAE Systems dan Northrop Grumman. Pesawat demonstrasi pertama kali terbang pada tahun 2000, dan pesawat versi produksi pertama kali terbang pada 15 Desember 2006. ",
            "Sukhoi SU-27 adalah pesawat tempur yang awalnya diproduksi oleh Uni Soviet, dan dirancang oleh Biro Desain Sukhoi. Pesawat ini direncanakan untuk menjadi saingan utama generasi baru pesawat tempur Amerika Serikat (yaitu F-14 Tomcat, F-15 Eagle, F-16 Fighting Falcon, dan F/A-18 Hornet). SU-27 memiliki jarak jangkau yang jauh, persenjataan yang berat, dan kelincahan yang tinggi. Pesawat ini sering disebut sebagai hasil persaingan antara Sukhoi dengan Mikoyan-Gurevich, karena Su-27 dan MiG-29 berbentuk mirip. Ini adalah keliru, karena SU-27 dirancang sebagai pesawat interseptor dan pesawat tempur superioritas udara jarak jauh, sedangkan MiG-29 dirancang untuk mengisi peran pesawat tempur pendukung jarak dekat. ",
            "Sukhoi Su-33 adalah pesawat tempur angkatan laut yang dikembangkan oleh Sukhoi pada tahun 1982 untuk dipakai di atas kapal induk. Pesawat ini merupakan pengembangan dari Su-27, dan sebelumnya diberi nama Su-27K. Perbedaan Su-27 dengan Su-33 adalah Su-33 dilengkapi peralatan untuk diluncurkan dan mendarat di kapal induk (seperti cantolan belakang dan sayap lipat), dapat dipasang canard, dan dapat mengisi bahan bakar di udara. Sesuai dengan misinya, pesawat ini bisa dianggap sebanding dengan F-14 Tomcat Amerika Serikat, sedangkan MiG-29K 'Fulcrum-D' sebanding dengan F/A-18 Hornet. ",
            "Sukhoi Su-35 (kode NATO: Flanker-E) adalah pesawat tempur multiperan, kelas berat, berjelajah panjang, dan bertempat duduk tunggal asal Rusia. Pesawat ini dikembangkan dari Su-27, dan awalnya diberi nama Su-27M. Pesawat ini dikembangkan untuk menandingi F-15 Eagle dan F-16 Fighting Falcon. Karena kesamaan fitur dan komponen yang dikandungnya, Su-35 dianggap sebagai sepupu dekat Sukhoi Su-30MKI, sebuah varian Su-30 yang diproduksi untuk India. Pesawat ini sendiri merupakan seri flanker terakhir dan merupakan pengisi kekosongan generasi antara generasi 4 dan generasi 5, bisa dimasukkan dalam generasi 4++.",
            "Sukhoi Su-57 adalah pesawat tempur siluman, kursi tunggal, mesin ganda multiperan generasi kelima yang dikembangkan sejak 2002 untuk superioritas udara dan operasi serangan. Pesawat ini adalah produk dari PAK FA , program pesawat tempur generasi kelima dari Angkatan Udara Rusia . Nama internal Sukhoi untuk pesawat tersebut adalah T-50 . Su-57 direncanakan menjadi pesawat pertama dalam dinas militer Rusia yang menggunakan teknologi siluman . Penerbangan perdananya berlangsung pada 29 Januari 2010 dan pesawat produksi pertama direncanakan akan dikirimkan pada tahun 2020. Pesawat tempur ini dirancang untuk memiliki supercruise , kemampuan supermanuver , siluman , dan avionik canggih untuk mengatasi pesawat tempur generasi sebelumnya serta pertahanan darat dan laut. Su-57 dimaksudkan untuk menggantikan MiG-29 dan Su-27 di Angkatan Udara Rusia.",
            "T-50 Golden Eagle adalah pesawat latih (trainer) supersonik buatan Amerika Serikat-Korea Selatan. Dikembangkan oleh Korean Aerospace Industries dengan bantuan Lockheed Martin. Program ini juga melahirkan A-50, atau T-50 LIFT, sebagai varian serang ringan. Walaupun militer Amerika Serikat tidak ada rencana untuk membeli pesawat ini, tetapi penamaan militer amerika secara resmi diminta untuk pesawat ini guna menghindari konflik penamaan dikemudian hari. Program T/A-50 dimaksudkan sebagai pengganti dari berbagai pesawat latih dan serang ringan. Ini termasuk T-38 dan F-5B untuk pelatihan dan Cessna A-37BClose Air Support; yang dioperasikan AU Republik Korea. Program ini pada awalnya dimaksudkan untuk mengembangkan pesawat latih (trainer) secara mandiri yang mampu mencapai kecepatan supersonik untuk melatih dan mempersiapkan pilot bagi pesawat KF-16 (F-16 versi Korea).",
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
            "Henry Cloud",
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
