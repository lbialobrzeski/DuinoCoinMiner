package pl.lukaszbialobrzeski;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = null;
        System.out.println("Username?");
        userName = sc.nextLine();

        System.out.println(
                "Use lower difficulty? (Y/N) [Leave empty for default of True]");
        String diffChoice = "";
        diffChoice = sc.nextLine();
        sc.close();
        boolean useLowerDiff = diffChoice.toLowerCase().equals("n");
    }
}