package Phonebook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

  public static void main(final String[] args) throws InterruptedException, IOException {

      final Map<String, String> phoneBook = new TreeMap<>();
      String name;
      int number;
      BufferedReader reader;
      int size = phoneBook.size();

      System.out.println("Select a city: Chicago, New York, LA, Boston");
      final Scanner input = new Scanner(System.in);
      if (input.equals("Chicago")) {
        reader = new BufferedReader(new FileReader("Chicago.txt"));
        String line = reader.readLine();
        while (line != null) {
          String[] splitLine = line.split(" ");
          for(String pair: splitLine) {
            phoneBook.put(splitLine[0], splitLine[1]);
          }


        }


      }
    }
  }
