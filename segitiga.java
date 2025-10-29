import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
        double luasNya, kelilingNya, tinggiNya, alasNya, sisiNya;
        Scanner albani = new Scanner(System.in);

        System.out.println("Masukan sisinya :");
        sisiNya = albani.nextDouble();

        System.out.println("Masukan alasnya:");
        alasNya = albani.nextDouble();

        System.out.println("Masukan tinggiNya:");
        tinggiNya = albani.nextDouble();

        luasNya = 0.5*alasNya*sisiNya;
        kelilingNya = sisiNya*alasNya;

        System.out.println("keliling segitiga =" + kelilingNya);
        System.out.println("luas segitiga = " + luasNya);

        albani.close();
    }
}