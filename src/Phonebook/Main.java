package Phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {


  public static void main(final String[] args) throws IOException {

    final Map<String, String> phoneBook = new TreeMap<>();
    BufferedReader reader;
    int size = phoneBook.size();
    Scanner input = new Scanner(System.in);
    File userHomeDirectory = new File(System.getProperty("user.dir"));

    System.out.println("Select a city: Chicago, New York, LA, Boston");
    String city = input.nextLine();

    if (city.equalsIgnoreCase("Chicago")) {
      File dataFile = new File(userHomeDirectory + File.separator + "src" + File.separator + "Phonebook" + File.separator + "Chicago.txt");
      reader = new BufferedReader(new FileReader(dataFile));
      String line = reader.readLine();

      while (line != null) {
        String[] splitLine = line.split(":");
        line = reader.readLine();
        for (String pair : splitLine) {
          phoneBook.put(splitLine[0], splitLine[1]);
        }
      }
    } else if (city.equalsIgnoreCase("LA")) {
      File dataFile = new File(userHomeDirectory + File.separator + "src" + File.separator + "Phonebook" + File.separator + "LA.txt");
      reader = new BufferedReader(new FileReader(dataFile));
      String line = reader.readLine();

      while (line != null) {
        String[] splitLine = line.split(":");
        line = reader.readLine();
        for (String pair : splitLine) {
          phoneBook.put(splitLine[0], splitLine[1]);
        }
      }
    }

    ArrayList<Map.Entry<String, String>> arr = new ArrayList<>(size);
    arr.addAll(phoneBook.entrySet());
    for (Map.Entry<String, String> mapEntry : arr) {
      System.out.println(mapEntry);
    }
  }
}
