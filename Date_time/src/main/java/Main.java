import com.khanhnhb.date_time.LocalDateDemo;
import com.khanhnhb.exception.PrintAllYearException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws PrintAllYearException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input from year: ");
        String from = sc.nextLine();

        System.out.print("Input end year: ");
        String to = sc.nextLine();

        LocalDateDemo localDateDemo = new LocalDateDemo();
        localDateDemo.printAllYear(from, to);
    }
}
