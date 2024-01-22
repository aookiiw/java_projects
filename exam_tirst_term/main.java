package exam_tirst_term;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Actividad1
        String text = input.nextLine();
        int contVocals = 0;
        int contSpaces = 0;
        StringBuilder newtext = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                char letter = text.charAt(i);
                if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' ||
                        letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                    contVocals++;
                } else if (letter == ' '){
                    contSpaces++;
                } else {
                    newtext.append(letter);
                }
            }
        System.out.println("Missatge final: " + newtext);
        System.out.println("S’han suprimit " + contSpaces + " espais i " + contVocals + " vocals");

//         Actividad 2
        System.out.println("Fullname:");
        String fullname = input.nextLine();
        System.out.println("DNI:");
        String dni = input.nextLine();
        System.out.println("City:");
        String city = input.nextLine();
        System.out.println("Phone:");
        String telefono = input.nextLine();

        String[] words = fullname.toLowerCase().split(" ");
        StringBuilder normalFullname = new StringBuilder();

        for (String word : words) {
            normalFullname.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
            normalFullname.append(" ");
        }

        if (dni.length() != 9 && Character.isLetter(dni.charAt(8))) {
            dni = "dni incorrecte";
        } else {
            dni = dni.substring(0, 8) + Character.toUpperCase(dni.charAt(8));
        }

        city = Character.toUpperCase(city.charAt(0)) + city.substring(1).toLowerCase();

        int count = 0;
        StringBuilder phoneOK = new StringBuilder("+93 ");
        for (int i = 0; i < telefono.length(); i++) {
            if (count == 3) {
                phoneOK.append(" ");
                count = 0;
            }
            phoneOK.append(telefono.charAt(i));
            count++;
        }
        System.out.println("FullName: " + normalFullname);
        System.out.println("DNI: " + dni);
        System.out.println("City: " + city);
        System.out.println("Phone: " + phoneOK);

//        Actividad 3

        int totalCromos = input.nextInt();

        int[] frequencies = new int[50];

        for (int i = 0; i < totalCromos; i++) {
            int cromo = input.nextInt();
            frequencies[cromo]++;
        }

        System.out.println("Cromos repetits:");
        for (int i = 0; i <= 50; i++) {
            if (frequencies[i] > 1) {
                System.out.println(i + ":" + frequencies[i]);
            }
        }

//Actividad 4
        System.out.println("Years: ");
        int years = input.nextInt();
        System.out.println("Products: ");
        int products = input.nextInt();

        int[][] statistics = new int[years][products];
        int best = 0;
        int worst = 0;
        int MAX = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;

        for (int i = 0; i < statistics.length; i++) {
            System.out.println("Year"+i);
            for (int j = 0; j < statistics[0].length; j++) {
                System.out.println("Product" + j);
                statistics[i][j] = input.nextInt();
            }
        }

        count = 0;
        for (int i = 0; i < statistics[0].length; i++) {
            count = 0;
            for (int j = 0; j < statistics.length; j++) {
                count = count + statistics[j][i];
            }
            if (count > MAX) {
                best = i;
                MAX = count;
            }
            if (count < MIN){
                worst = i;
                MIN = count;
            }
        }

        System.out.println("Producte més venut: Producte" + best + " amb " + MAX + " unitats venudes ");
        System.out.println("Producte menys venut: Producte"+ worst + " amb " + MIN + " unitats venudes");

    }
}
