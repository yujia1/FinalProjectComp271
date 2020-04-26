package Phonebook;

public class phoneBook {
    public String city;
    public String category;
    public String name;
    public String phoneNum;

    /**
     *
     * @param city
     * @param category
     * @param name
     * @param phoneNum
     * under mysql for mac or sql for window system,
     * object is phoneBook
     * you have to set up primary key as phone num,
     * other three attribute city, category,and name, which can be same.
     *
     * host info: "localhost", which is one argument of your function.
     * port: 3306;
     * user: yjia1
     * password: 0000000 
     */
    phoneBook(String city, String category, String name, String phoneNum){
        this.city = city;
        this.category = category;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    phoneBook(String name){
        this.name = name;
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
