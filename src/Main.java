import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // Task 1
//        fileHandler();
//        consoleHandler();
        // Task 3
//        computeAndWrite();
        // Task 4
//        copyFile();

    }

    private static void copyFile() {
        File copying = new File("copying.txt");
        File copied = new File("copied.txt");

        try {
            Files.copy(copying.toPath(), copied.toPath());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void computeAndWrite() throws IOException {

        ArrayList<Integer> numbers = new ArrayList<>();

        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            Integer num = scanner.nextInt();
            numbers.add(num);
            System.out.println(num);
        }
        scanner.close();

        int result = 0;
        for (Integer number : numbers) {
            result += number;
        }

        System.out.println(result);

        OutputStream outputStream = new FileOutputStream("output.txt");
        outputStream.write(String.valueOf(result).getBytes());




    }

    private static void fileHandler() throws IOException {
        Logger logger = Logger.getLogger("MyLogger");

        logger.setLevel(Level.FINE);

        FileHandler handler = new FileHandler("logs.txt");

        handler.setFormatter(new SimpleFormatter());

        logger.addHandler(handler);

        logger.fine("This is a FINE level log message");
    }

    public static void consoleHandler() {
        Logger logger = Logger.getLogger("MyLogger");

        logger.setLevel(Level.FINE);

        ConsoleHandler handler = new ConsoleHandler();

        handler.setLevel(Level.FINE);

        logger.addHandler(handler);

        logger.fine("This is a FINE level log message.");
    }
}



