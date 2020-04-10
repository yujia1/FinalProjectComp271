package Phonebook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

  public static void main(final String[] args) throws IOException {

    final Map<String, String> phoneBook = new TreeMap<>();
    BufferedReader reader;
    int size = phoneBook.size();
    Scanner input = new Scanner(System.in);

    System.out.println("Select a city: Chicago, New York, LA, Boston");
    String city = input.nextLine();
    if (city.equalsIgnoreCase("Chicago")) {
      reader = new BufferedReader(new FileReader("C:\\Users\\Karolina\\IdeaProjects\\Final Project 271\\src\\Phonebook\\Chicago.txt"));
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
