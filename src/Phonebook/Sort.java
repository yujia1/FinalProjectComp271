package Phonebook;

import java.util.ArrayList;
import java.util.Map;

public class Sort {
  public static String findName(final ArrayList<Map.Entry<String, String>> arr, final String name) {
    final int size = arr.size();
    int low = 0;
    int high = size - 1;
    int mid = (low + high) / 2;

    while (low < high) {

      if (arr.get(mid).getKey().compareTo(name) < 0) {
        low = mid + 1;
      } else if (arr.get(mid).getKey().compareTo(name) > 0) {
        high = mid - 1;
      }
    }
    return arr.get(mid).getKey() + " " + arr.get(mid).getValue();
  }
}