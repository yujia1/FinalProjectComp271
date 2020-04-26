# FinalProjectComp271

Project Title: Phonebooks App
Team Members: 
Adriana Ene - aene@luc.edu
Karolina Senkow - ksenkow@luc.edu 
Yu Jia - yjia1@luc.edu
We will be meeting weekly via Zoom to discuss project progress. 
Version control: https://github.com/aene1/Final-COMP271.git

Abstract:
The goal of this project is to create an app which will display multiple phonebooks, each labelled by a different city name. The objective is to allow a user to access a specific city’s phonebook, and will break that contact information down into four categories: restaurants, emergency services, schools, and companies. From there, they will be able to search for a particular name/number, and add/remove/edit a name/number. In the case that the user were to search only part of a name or part of a phone number, the program will return every match containing that substring.

We will be using multiple data structures for this project. We will map phone numbers to names using a TreeMap in order to ensure that key-map pairs are stored in sorted order. The TreeMap will be added to an ArrayList. The user will be allowed to perform a variety of functions. They can search for a particular name or phone number, which will be done using binary search. The name and phone number for that value will be returned. The user can also add/remove/edit entries in the phonebook. 

Figures:

Figure 1. When the user opens the app, they will see 4 buttons, each containing a different city’s phonebook.


Figure 2. After the user presses on the button for a city, they will be taken to the options menu. The options will include: find contact information for restaurants, emergency services, schools, or companies. 

Figure 3. Users will then be presented four more choices: search for contact, add, remove, or edit a contact’s information.

Project Design:
We will be using IntelliJ’s Android Studio plugin to create the app.

Milestones: 
Create the app with its layout.
Add the functionality of each city as shown in Figure 1.
After choosing a city, display four subcategories as seen in Figure 2.
Populate the phonebooks with telephone numbers and addresses.
Display the option to search/add/remove/edit contacts as seen in Figure 3.
Set up the binary search for each phonebook.
Create methods to add/remove/edit contacts.

Related Projects:
http://math.hws.edu/eck/cs124/javanotes5/source/PhoneDirectoryFileDemo.java
Our project will be different from this one because it will return all cases that contain the substring that the user searches for, whereas this code simply returns “name not found”.
http://java.worldbestlearningcenter.com/2013/06/phonebook_4507.html
Our project is different from the ones listed because it will be an android application that will open and will have different features based on cities and what you need to look for. 


