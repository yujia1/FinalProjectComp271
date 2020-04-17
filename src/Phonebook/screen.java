package Phonebook;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class screen extends JFrame{
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
    private JButton NewButton;
    private JButton searchButton;
    private JButton addButton;
    private JButton removeButton;
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
    private JPanel panelMain1;
    private JLabel label4;
    private JList listPeople;
    private DefaultListModel listPeopleModel;
    private ArrayList<phoneBook> people;
    screen(){
        super("Phone Book");
        this.setContentPane(this.panelMain1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        people = new ArrayList<phoneBook>();
        listPeopleModel = new DefaultListModel();
        listPeople.setModel(listPeopleModel);
        addButton.setEnabled(false);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addButtonClick(e);
            }
        });

        listPeople.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                listPeopleSelection(e);
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchButtonClick(e);
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeButtonClick(e);
            }
        });

        BostonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BostonButtonClick(e);
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
        ChicagoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChicagoButtonClick(e);
            }
        });

        RestaurantButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RestaurantButtonClick(e);
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
    }

    public void searchButtonClick(ActionEvent e){

    }
    public void removeButtonClick(ActionEvent e){

    }

    public void  BostonButtonClick(ActionEvent e){
        int personNum = listPeople.getSelectedIndex();
        if (personNum >= 0){
            phoneBook p = people.get(personNum);
            p.setCity("Boston");
            textCity.setText(p.getCity());
            addButton.setEnabled(true);
        }else{
            addButton.setEnabled(false);
        }
    }

    public void ChicagoButtonClick(ActionEvent e){
        int personNum = listPeople.getSelectedIndex();
        if (personNum >= 0){
            phoneBook p = people.get(personNum);
            p.setCity("Chicago");
            textCity.setText(p.getCity());
            addButton.setEnabled(true);
        }else{
            addButton.setEnabled(false);
        }
    }

    public void NewYorkButtonClick(ActionEvent e){
        int personNum = listPeople.getSelectedIndex();
        if (personNum >= 0){
            phoneBook p = people.get(personNum);
            p.setCity("New York");
            textCity.setText(p.getCity());
            addButton.setEnabled(true);
        }else{
            addButton.setEnabled(false);
        }
    }

    public void LosAngelesButtonClick(ActionEvent e){
        int personNum = listPeople.getSelectedIndex();
        if (personNum >= 0){
            phoneBook p = people.get(personNum);
            p.setCity("Los Angeles");
            textCity.setText(p.getCity());
            addButton.setEnabled(true);
        }else{
            addButton.setEnabled(false);
        }
    }

    public void RestaurantButtonClick(ActionEvent e){
        int personNum = listPeople.getSelectedIndex();
        if (personNum >= 0){
            phoneBook p = people.get(personNum);
            p.setCategory("Restaurant");
            textCity.setText(p.getCategory());
            addButton.setEnabled(true);
        }else{
            addButton.setEnabled(false);
        }
    }

    public void EmergencyButtonClick(ActionEvent e){
        int personNum = listPeople.getSelectedIndex();
        if (personNum >= 0){
            phoneBook p = people.get(personNum);
            p.setCategory("Emergency");
            textCity.setText(p.getCategory());
            addButton.setEnabled(true);
        }else{
            addButton.setEnabled(false);
        }
    }

    public void SchoolButtonClick(ActionEvent e){
        int personNum = listPeople.getSelectedIndex();
        if (personNum >= 0){
            phoneBook p = people.get(personNum);
            p.setCategory("School");
            textCity.setText(p.getCategory());
            addButton.setEnabled(true);
        }else{
            addButton.setEnabled(false);
        }
    }

    public void CompanyButtonClick(ActionEvent e){
        int personNum = listPeople.getSelectedIndex();
        if (personNum >= 0){
            phoneBook p = people.get(personNum);
            p.setCategory("Company");
            textCity.setText(p.getCategory());
            addButton.setEnabled(true);
        }else{
            addButton.setEnabled(false);
        }
    }

    public void addButtonClick(ActionEvent e){
        phoneBook person = new phoneBook(
                textCity.getText(),
                textCategory.getText(),
                textName.getText(),
                textPhone.getText()
        );
        people.add(person);
        refreshPeopleList();
    }

    public void listPeopleSelection( ListSelectionEvent e){
        int personNumber = listPeople.getSelectedIndex();
        if (personNumber >=0){
            phoneBook p = people.get(personNumber);
            textName.setText(p.getName());
            textPhone.setText(p.getPhoneNum());
            textCategory.setText(p.getCategory());
            textCity.setText(p.getCity());
            addButton.setEnabled(true);
        }else {
            addButton.setEnabled(false);
        }
    }

    public void refreshPeopleList(){
        listPeopleModel.removeAllElements();
        System.out.println("Removing all people from list!");
        for (phoneBook p:people){
            System.out.println("Adding person to list: " + p.getName());
            listPeopleModel.addElement(p.getName());
        }
    }

    public void addContact(phoneBook person){
        people.add(person);
        refreshPeopleList();
    }

    public static void main(String[] args) {
        screen screen = new screen();
        screen.setVisible(true);

    }
}
