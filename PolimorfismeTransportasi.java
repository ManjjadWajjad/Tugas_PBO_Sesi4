class Kendaraan {
    int kecepatanMaksimal(int kecepatan) {
        return kecepatan;
    }

    int kecepatanMaksimal(int kecepatan, int tambahan) {
        return kecepatan + tambahan;
    }
}

class Mobil extends Kendaraan {
    @Override
    int kecepatanMaksimal(int kecepatan) {
        return kecepatan + 20;
    }
}

class Motor extends Kendaraan {
    @Override
    int kecepatanMaksimal(int kecepatan) {
        return kecepatan + 10;
    }
}

public class PolimorfismeTransportasi {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan();
        Mobil mobil = new Mobil();
        Motor motor = new Motor();

        System.out.println("Kecepatan Dasar: " + kendaraan.kecepatanMaksimal(60));
        System.out.println("Kecepatan Mobil: " + mobil.kecepatanMaksimal(60));
        System.out.println("Kecepatan Motor: " + motor.kecepatanMaksimal(60));
    }
}
