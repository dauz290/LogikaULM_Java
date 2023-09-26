package percabangan;

public class PernyataanIfElse {

    public static void main(String[] args) {
        double diskon = 0, totalBelanja = 5000;

        if (totalBelanja >= 100000) {
            diskon = totalBelanja / 10;
        } else {
            diskon = totalBelanja * 2.5/100;
        }
        System.out.println("Diskon = " + diskon);
    }
}
