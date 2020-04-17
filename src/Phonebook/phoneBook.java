package Phonebook;

public class phoneBook {
    public String city;
    public String category;
    public String name;
    public String phoneNum;
    phoneBook(String city, String category, String name, String phoneNum){
        this.city = city;
        this.category = category;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
