package Academy.day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Day2 {



    public Day2() throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader(new File("")));
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num == 11) {
            System.out.println("You  win!");
        } else {
            System.out.println("Try one more time");
        }
    }
}
