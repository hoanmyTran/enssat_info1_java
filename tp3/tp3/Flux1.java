package tp3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * This class provides a method to create a file with a name provided by the user and write to it.
 */
public class Flux1 {

    /**
     * Creates a file with the given filename and writes to it.
     *
     * @param filename the name of the file to be created
     */
    private static void createAndWriteToFile(String filename) {
        Path path = Paths.get(filename);
        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.CREATE_NEW)) {
            String header = "----------liste des villes----------\n";
            writer.write(header);
            System.out.println("Enter the number of data :");
            int nbData = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < nbData; i++) {
                System.out.println("Enter the city:");
                String city = scanner.nextLine();
                System.out.println("Enter the number of population:");
                String population = scanner.nextLine();
                System.out.println("Enter the country:");
                String country = scanner.nextLine();
                String content = city + "\t " + population + "\t " + country+ "\n";
                writer.write(content);
            }

            String footer = "----------fin liste des villes----------\n";
            writer.write(footer);
            System.out.println("Data written to file.");
        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exists: " + path);
        } catch (IOException e) {
            System.out.println("An error occurred while creating or writing to the file.");
            e.printStackTrace();
        }
    }

    private static void readAndPrintFileContent(String filename) {
        Path path = Paths.get(filename);
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the filename:");
        try (Scanner scanner = new Scanner(System.in)) {
            String filename = scanner.nextLine();
            createAndWriteToFile(filename);
            readAndPrintFileContent(filename);
        }
    }
}