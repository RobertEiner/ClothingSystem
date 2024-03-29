package Util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public int readInt (String message) {
        System.out.println(message);
        int answer = scanner.nextInt();
        scanner.nextLine();

        return answer;
    }

    public double readDouble (String message) {
        System.out.println(message);
        double answer = scanner.nextDouble();
        scanner.nextLine();

        return answer;
    }

    public String readString(String message) {
        System.out.println(message);

        return scanner.nextLine();
    }
}
