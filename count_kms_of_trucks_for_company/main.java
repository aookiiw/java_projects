package count_kms_of_trucks_for_company;

import java.util.Scanner;

public class main {
    public static Scanner input = new Scanner(System.in);

    static int askNumOfTrucks(){
        System.out.println("Please input the number of tracks that are in your company: ");
        int num = input.nextInt();
        return num;
    }

    static int showMenu(){
        System.out.println("- - - - - - - - - -");
        System.out.println("MAIN MENU");
        System.out.println("1. Input data");
        System.out.println("2. Kms of truck");
        System.out.println("3. List of KMS that truck has done this month");
        System.out.println("4. Total KMS");
        System.out.println("0. EXIT");
        System.out.println("Please select the option");
        int option = input.nextInt();
        System.out.println("- - - - - - - - - -");

        return option;
    }

    static int askWhichTruckToCheck(int[][] kmsCamioDia){
        System.out.println("Which truck you want to check?");
        for (int i = 0; i < kmsCamioDia.length; i++) {
            System.out.println("Truck number: " + (i+1));
        }
        int num = input.nextInt() - 1;
        return num;
    }
    static void menuAction(int option, int[][] kmsCamioDia, int days){
        int truck;
        while (option != 0){
            switch (option){
                case 1:
                    introduirDadesDia(kmsCamioDia);
                    break;
                case 2:
                    truck = askWhichTruckToCheck(kmsCamioDia);
                    int kmsOfTruck = kmsCamio(kmsCamioDia, truck);
                    System.out.println(kmsOfTruck);
                    break;
                case 3:
                    truck = askWhichTruckToCheck(kmsCamioDia);
                    int[] kmsOfTruckMonthly = llistatKmCamioMes(kmsCamioDia, truck, days);
                    showKmsOfTruckMontly(kmsOfTruckMonthly, truck);
                    break;
                case 4:
                    int totalKms = kmsTotals(kmsCamioDia);
                    System.out.println("Total KMS done this month is: " + totalKms);
            } option=showMenu();
        }
    }

    public static int kmsTotals(int[][] kmsCamioDia){
        int total = 0;
        for (int i = 0; i < kmsCamioDia.length; i++) {
            for (int j = 0; j < kmsCamioDia[i].length; j++) {
                total += kmsCamioDia[i][j];
            }
        }
        return total;
    }
    static void showKmsOfTruckMontly(int[]kmsOfTruckMonthly, int truck){
        System.out.println("Truck number " + truck);
        for (int i = 0; i < kmsOfTruckMonthly.length; i++) {
            if (kmsOfTruckMonthly[i] != 0){
                System.out.println("Day " + (i+1));
                System.out.println(kmsOfTruckMonthly[i]);
            }
        }
    }

    public static int[] llistatKmCamioMes(int[][] kmsCamioDia, int camio, int days){
        int[] llistatKmCamioMes = new int[days];

        for (int i = 0; i < llistatKmCamioMes.length; i++) {
            llistatKmCamioMes[i] = kmsCamioDia[camio][i];
        }
        return llistatKmCamioMes;
    }

    public static void introduirDadesDia(int[][] kmsCamioDia){
        for (int i = 0; i < kmsCamioDia.length; i++) {
            System.out.println("KMS of truck number: "+ (i + 1));
            for (int j = 0; j < kmsCamioDia[i].length; j++) {
                if (kmsCamioDia[i][j] == 0){
                    System.out.println("KMS done: ");
                    kmsCamioDia[i][j] = input.nextInt();
                    break;
                }
            }
        }

    }

    public static int kmsCamio(int[][] kmsCamioDia, int camio){
        int totalKmsForTruck = 0;
        for (int i = 0; i < kmsCamioDia[camio].length; i++) {
            totalKmsForTruck+=kmsCamioDia[camio][i];
        }
        System.out.println("Truck number " + (camio+1) + " has done these kms: ");
        return totalKmsForTruck;
    }

    public static void main(String[] args) {
        int numofTrack = askNumOfTrucks();
        int days = 30;
        int[][] kmsCamioDia = new int[numofTrack][days];

        int option = showMenu();

        menuAction(option, kmsCamioDia, days);



    }
}
