class Karyawan {
    double hitungGaji(double gajiPokok) {
        return gajiPokok;
    }

    double hitungGaji(double gajiPokok, double bonus) {
        return gajiPokok + bonus;
    }
}

class Manajer extends Karyawan {
    @Override
    double hitungGaji(double gajiPokok) {
        return gajiPokok + 2000000; 
    }
}

class KaryawanTetap extends Karyawan {
    @Override
    double hitungGaji(double gajiPokok) {
        return gajiPokok + 1000000;
    }
}

public class PolimorfismeGaji {
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();
        Manajer manajer = new Manajer();
        KaryawanTetap karyawanTetap = new KaryawanTetap();

        System.out.println("Gaji Karyawan: " + karyawan.hitungGaji(5000000));
        System.out.println("Gaji Manajer: " + manajer.hitungGaji(5000000));
        System.out.println("Gaji Karyawan Tetap: " + karyawanTetap.hitungGaji(5000000));
    }
}
