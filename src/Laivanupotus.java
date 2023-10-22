import java.util.Scanner;

public class Laivanupotus {

    public static void main(String[] args) {
        int koko = 5;
        char[][] pelilauta = new char[koko][koko];

        alustaPelilauta(pelilauta);

        Scanner scanner = new Scanner(System.in);

        do {
            piirraPelilauta(pelilauta);
            int rivi = kysyKoordinaatti("Rivi", koko);
            if (rivi == 0) {
                break;
            }

            int sarake = kysyKoordinaatti("Sarake", koko);

            pelilauta[rivi - 1][sarake - 1] = 'X'; // Ammutut näkyvät "X" kun pelilauta piirretään uudestaan

        } while (true);

        System.out.println("Peli päättyi.");
        scanner.close();
	}

}
