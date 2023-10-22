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
    // Alustetaan pelilauta ja käytetään ruudukkona viivaa "-"
    private static void alustaPelilauta(char[][] pelilauta) 
    	{
        for (int i = 0; i < pelilauta.length; i++) 
        	{
            for (int j = 0; j < pelilauta[i].length; j++) 
            	{
                pelilauta[i][j] = 'O';
            	}
        	}
    	}
    // Piirretään pelilauta
    private static void piirraPelilauta(char[][] pelilauta) 
    {
        System.out.println("  1 2 3 4 5");
        for (int i = 0; i < pelilauta.length; i++) 
        	{
            System.out.print((i + 1) + " ");
            for (int j = 0; j < pelilauta[i].length; j++) 
            	{
                System.out.print(pelilauta[i][j] + " ");
            	}
            System.out.println();
        	}
    }
    // Kysytään pelaajalta koordinaatteja, syöttämällä "0", peli loppuu
    private static int kysyKoordinaatti(String koordinaatti, int koko) {
        Scanner scanner = new Scanner(System.in);
        int arvo;
        do {
            System.out.print(koordinaatti + " (1-" + koko + ", 0 lopettaa): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Virheellinen syöte. Anna kokonaisluku.");
                scanner.next();
            }
            arvo = scanner.nextInt();
            if (arvo < 0 || arvo > koko) {
                System.out.println("Virheellinen syöte. Anna arvo väliltä 1-" + koko + ".");
            }
        } while (arvo < 0 || arvo > koko);
        return arvo;
    }
}

