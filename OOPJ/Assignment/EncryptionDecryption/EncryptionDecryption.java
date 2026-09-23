package EncryptDecrypt;

import java.io.*;
import java.util.Scanner;

public class EncryptionDecryption {

    static final int KEY = 5;

    // Encrypt file
    public static void encrypt(String inFile, String outFile) {

        try {
            FileReader fr = new FileReader(inFile);
            FileWriter fw = new FileWriter(outFile);

            int ch;

            while ((ch = fr.read()) != -1) {

                char newChar = (char) (ch + KEY);

                fw.write(newChar);
            }

            fr.close();
            fw.close();

            System.out.println("File encrypted successfully.");
            System.out.println("Encrypted file: " + outFile);

        } catch (IOException e) {

            System.out.println("Error while encrypting file.");
            System.out.println(e.getMessage());
        }
    }

    // Decrypt file
    public static void decrypt(String inFile, String outFile) {

        try {
            FileReader fr = new FileReader(inFile);
            FileWriter fw = new FileWriter(outFile);

            int ch;

            while ((ch = fr.read()) != -1) {

                char newChar = (char) (ch - KEY);

                fw.write(newChar);
            }

            fr.close();
            fw.close();

            System.out.println("File decrypted successfully.");
            System.out.println("Decrypted file: " + outFile);

        } catch (IOException e) {

            System.out.println("Error while decrypting file.");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== FILE MENU =====");
            System.out.println("1. Encrypt File");
            System.out.println("2. Decrypt File");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter input file: ");
                    String inFile = sc.next();

                    System.out.print("Enter encrypted file: ");
                    String encFile = sc.next();

                    encrypt(inFile, encFile);
                    break;

                case 2:

                    System.out.print("Enter encrypted file: ");
                    String encIn = sc.next();

                    System.out.print("Enter decrypted file: ");
                    String decFile = sc.next();

                    decrypt(encIn, decFile);
                    break;

                case 3:

                    System.out.println("Program terminated.");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}