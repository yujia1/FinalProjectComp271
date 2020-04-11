package Phonebook;

public class Options {
  private String city;

  private String business;

  private String name;

  public Options(final String city, final String business, final String name) {
    if (city == null) {
      throw new IllegalArgumentException("City is null");
    }

    if (business == null) {
      throw new IllegalArgumentException("Business is null");
    }

    if (name == null) {
      throw new IllegalArgumentException("Name is null");
    }

    this.city = city;
    this.business = business;
    this.name = name;
  }

  public String getCity() {
    return this.city;
  }

  public String getBusiness() {
    return this.business;
  }

  public String getName() {
    return this.name;
  }
}


