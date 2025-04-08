class BangunDatar {
    double hitungLuas(double sisi) {
        return sisi * sisi; 
    }

    double hitungLuas(double panjang, double lebar) {
        return panjang * lebar; 
    }
}

class Lingkaran extends BangunDatar {
    @Override
    double hitungLuas(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }
}

class PersegiPanjang extends BangunDatar {
    @Override
    double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }
}

public class PolimorfismeBangunDatar {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        Lingkaran lingkaran = new Lingkaran();
        PersegiPanjang pp = new PersegiPanjang();

        System.out.println("Luas Persegi: " + bd.hitungLuas(4));
        System.out.println("Luas Persegi Panjang: " + bd.hitungLuas(4, 6));
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas(7));
    }
}
