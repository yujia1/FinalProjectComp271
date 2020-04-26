package Phonebook;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class screen extends JFrame {
    private JPanel city;
    private JPanel categories;
    private JPanel contact;
    private JPanel operator;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JPanel search;
    private JPanel add;
    private JPanel remove;
    private JButton searchButton;
    private JButton addButton;
    private JButton removeButton;
    private JButton SaveButton;
    private JTextField textCity;
    private JTextField textCategory;
    private JTextField textName;
    private JTextField textPhone;
    private JButton NewYorkButton;
    private JButton ChicagoButton;
    private JButton LosAngelesButton;
    private JButton BostonButton;
    private JButton RestaurantButton;
    private JButton SchoolButton;
    private JButton CompanyButton;
    private JButton EmergencyButton;
    private JPanel panelMain;
    private JLabel label4;
    private JList list;
    private DefaultListModel listModel;
    private ArrayList<phoneBook> people;

    screen() {
        super("Phone Book");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        people = new ArrayList<phoneBook>();
        listModel = new DefaultListModel();
        list.setModel(listModel);

        SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SaveButtonClick(e);
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addButtonClick(e);
            }
        });

        // searching
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchButtonClick(e);
            }
        });
        // removing
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeButtonClick(e);
            }
        });

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                listPeopleSelection(e);
            }
        });

        ChicagoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChicagoButtonClick(e);
            }
        });

        NewYorkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewYorkButtonClick(e);
            }
        });

        LosAngelesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LosAngelesButtonClick(e);
            }
        });

        BostonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BostonButtonClick(e);
            }
        });

        SchoolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SchoolButtonClick(e);
            }
        });

        CompanyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CompanyButtonClick(e);
            }
        });

        EmergencyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmergencyButtonClick(e);
            }
        });

        RestaurantButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RestaurantButtonClick(e);
            }
        });

    }
    public void ChicagoButtonClick(ActionEvent e){
        int index = list.getSelectedIndex();
        if (index >= 0){
            phoneBook p = people.get(index);
            p.setCity("Chicago");
            textCity.setText(p.getCity());
        }
    }

    public void NewYorkButtonClick(ActionEvent e){
        int index = list.getSelectedIndex();
        if (index >= 0){
            phoneBook p = people.get(index);
            p.setCity("New York");
            textCity.setText(p.getCity());
        }
    }

    public void LosAngelesButtonClick(ActionEvent e){
        int index = list.getSelectedIndex();
        if (index >= 0){
            phoneBook p = people.get(index);
            p.setCity("Los Angeles");
            textCity.setText(p.getCity());
        }
    }

    public void BostonButtonClick(ActionEvent e){
        int index = list.getSelectedIndex();
        if (index >= 0 ){
            phoneBook p = people.get(index);
            p.setCity("Boston");
            textCity.setText(p.getCity());
        }
    }

    public void SchoolButtonClick(ActionEvent e){
        int index = list.getSelectedIndex();
        if (index >=0 ){
            phoneBook p = people.get(index);
            p.setCategory("School");
            textCategory.setText(p.getCategory());
        }
    }

    public void CompanyButtonClick(ActionEvent e){
        int index = list.getSelectedIndex();
        if (index >= 0){
            phoneBook p = people.get(index);
            p.setCategory("Company");
            textCategory.setText(p.getCategory());
        }
    }

    public void RestaurantButtonClick(ActionEvent e){
        int index = list.getSelectedIndex();
        if (index >= 0){
            phoneBook p = people.get(index);
            p.setCategory("Restaurant");
            textCategory.setText(p.getCategory());
        }
    }

    public void EmergencyButtonClick(ActionEvent e){
        int index = list.getSelectedIndex();
        if (index >= 0){
            phoneBook p = people.get(index);
            p.setCategory("Emergency");
            textCategory.setText(p.getCategory());
        }
    }


    // searching
    public void searchButtonClick(ActionEvent e){

        phoneBook p = new phoneBook(textName.getText());
        String name = p.getName();
        int index = binarySearch(name);
        if (index >= 0){
            phoneBook person = people.get(index);
            textCity.setText(person.getCity());
            textCategory.setText(person.getCategory());
            textName.setText(person.getName());
            textPhone.setText(person.getPhoneNum());
        }
    }
    // binary search string
    public int binarySearch(String name){
        int left = 0;
        int right = people.size() - 1;

        while (left <= right){
            int mid = (left + right ) /2;
            int res = name.compareTo(people.get(mid).getName());
            if (res == 0){
                 return mid;
            }else if (res > 0){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }

    // remove
    public void removeButtonClick(ActionEvent e){
        int index = list.getSelectedIndex();
        people.remove(index);
        mergeSort(people);
        refreshList();
    }
    // save
    public void SaveButtonClick(ActionEvent e){
        int index = list.getSelectedIndex();
        if(index >= 0){
            phoneBook p = people.get(index);
            p.setCity(textCity.getText());
            p.setCategory(textCategory.getText());
            p.setName(textName.getText());
            p.setPhoneNum(textPhone.getText());
            refreshList();
        }
        mergeSort(people);
    }

    // merge sort of arrayList
    public ArrayList<phoneBook> mergeSort(ArrayList<phoneBook> people){
        ArrayList<phoneBook> left = new ArrayList<phoneBook>();
        ArrayList<phoneBook> right = new ArrayList<phoneBook>();
        int index;
        if (people.size() == 1){
            return people;
        }else{
            index = people.size() / 2;
            for (int i = 0; i < index; i ++){
                left.add(people.get(i));
            }
            for (int j= index; j < people.size();j++){
                right.add(people.get(j));
            }
            // sort the left and right
            left = mergeSort(left);
            right = mergeSort(right);

            // merge back
            merge(left, right, people);
        }
        return people;
    }
    private void merge(ArrayList<phoneBook> left, ArrayList<phoneBook> right, ArrayList<phoneBook> people){
        int leftIndex = 0;
        int rightIndex = 0;
        int peopleIndex =0;

        while (leftIndex < left.size() && rightIndex < right.size()){
            if ((left.get(leftIndex).getName().compareTo(right.get(rightIndex).getName()))<0){
                people.set(peopleIndex, left.get(leftIndex));
                leftIndex++;
            }else {
                people.set(peopleIndex, right.get(rightIndex));
                rightIndex++;
            }
            peopleIndex++;
        }

        ArrayList<phoneBook> rest;
        int restIndex;
        if (leftIndex >= left.size()){
            rest = right;
            restIndex = rightIndex;
        }else{
            rest = left;
            restIndex = leftIndex;
        }
        for (int i = restIndex; i < rest.size(); i++){
            people.set(peopleIndex, rest.get(i));
            peopleIndex++;
        }
    }

    public void listPeopleSelection(ListSelectionEvent e){
        int index = list.getSelectedIndex();
        if (index >=0 ){
            phoneBook p = people.get(index);
            textCity.setText(p.getCity());
            textCategory.setText(p.getCategory());
            textName.setText(p.getName());
            textPhone.setText(p.getPhoneNum());
            SaveButton.setEnabled(true);
        }else{
            SaveButton.setEnabled(false);
        }
    }


    public void addButtonClick(ActionEvent e){
        phoneBook p = new phoneBook(textCity.getText(),
                                    textCategory.getText(),
                                    textName.getText(),
                                    textPhone.getText());
        people.add(p);
        refreshList();
    }

    public void refreshList(){
        listModel.removeAllElements();
        System.out.println("Removing all contact from list!");
        mergeSort(people);
        for (phoneBook p: people){
            System.out.println("Adding person to list: " + p.getName());
            listModel.addElement(p.getName());
        }
    }
    // add
    public void addPhonebook(phoneBook p){
        people.add(p);
        refreshList();
    }

    public static void main(String[] args) {

        screen screen = new screen();
        screen.setVisible(true);

        phoneBook Joey = new phoneBook("Chicago", "School", "Joey","123-456-789");
        phoneBook Richard = new phoneBook("Los Angeles", "Restaurant", "Richard","123-456-898");
        phoneBook YuJia = new phoneBook("Boston", "Company", "YuJia","123-456-897");
        phoneBook Aoqi = new phoneBook("New York", "Emergency", "Aoqi","123-456-896");

        screen.addPhonebook(Joey);
        screen.addPhonebook(Richard);
        screen.addPhonebook(YuJia);
        screen.addPhonebook(Aoqi);

    }
}
