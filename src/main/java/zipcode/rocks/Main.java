package zipcode.rocks;

import jdk.internal.jimage.ImageStrings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        String student_source = "FakeData.csv";

        // Load data file into an ArrayList<Person> of Person objects.
        Main programObject = new Main();

        List listOfStudents = programObject.handWrittenLoadOfData();

        int numberOfPersons = listOfStudents.size();
        for (int i = 0; i< numberOfPersons; i++){
            System.out.println(listOfStudents.get(i).toString());
        }
    }

    private List loadCSVFile(String student_source) {
        ArrayList<Person> records = new ArrayList<>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);

        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                records.add(this.getRecordFromLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("File NOT FOUND.");
            e.printStackTrace();
        }
        return records;
    }

    private Person getRecordFromLine(String line) {
        // take the String of lastname,firstname and create a new Person object with it.
        String[] values = line.split(COMMA_DELIMITER);
        Person newPerson = new Person(values[0], values[1]);
        return newPerson;
    }

    private List handWrittenLoadOfData() {
        ArrayList<Person> students = new ArrayList<>();

        Person newPersonCoreye = new Person("Coreye", "Ross");
        newPersonCoreye.setFavoriteBeverage("Water");
        newPersonCoreye.setFavoriteColor("Black");
        newPersonCoreye.setBirthMonth("October");
        newPersonCoreye.setHavePets(false);
        students.add(newPersonCoreye);

        Person newPersonWill = new Person("Will", "Chapman");
        newPersonWill.setFavoriteBeverage("Water");
        newPersonWill.setFavoriteColor("Purple");
        newPersonWill.setBirthMonth("December");
        newPersonWill.setHavePets(false);
        students.add(newPersonWill);

        Person newPersonJosue = new Person("Josue", "Castro");
        newPersonJosue.setFavoriteBeverage("Coffee");
        newPersonJosue.setFavoriteColor("Blue");
        newPersonJosue.setBirthMonth("June");
        newPersonJosue.setHavePets(true);
        students.add(newPersonJosue);

        Person newPersonMo = new Person("Mohammed", "N");
        newPersonMo.setFavoriteBeverage("Snapple");
        newPersonMo.setFavoriteColor("Green");
        newPersonMo.setBirthMonth("August");
        newPersonMo.setHavePets(false);
        students.add(newPersonMo);

        Person newPersonJared = new Person("Jared", "Thacker");
        newPersonJared.setFavoriteBeverage("Water");
        newPersonJared.setFavoriteColor("Green");
        newPersonJared.setBirthMonth("December");
        newPersonJared.setHavePets(false);
        students.add(newPersonJared);

        Person newPersonJonathan = new Person("Jonathan", "Diehl");
        newPersonJonathan.setFavoriteBeverage("Coffe");
        newPersonJonathan.setFavoriteColor("Green");
        newPersonJonathan.setBirthMonth("February");
        newPersonJonathan.setHavePets(true);
        students.add(newPersonJonathan);

        Person newPersonBryan = new Person("Bryan", "Smith");
        newPersonBryan.setFavoriteBeverage("Water");
        newPersonBryan.setFavoriteColor("Brown");
        newPersonBryan.setBirthMonth("May");
        newPersonBryan.setHavePets(false);
        students.add(newPersonJonathan);


        Person newPersonIan = new Person("Ian", "Gordon");
        newPersonIan.setFavoriteBeverage("Water");
        newPersonIan.setFavoriteColor("Green");
        newPersonIan.setBirthMonth("April");
        newPersonIan.setHavePets(true);
        students.add(newPersonJonathan);

        Person newPersonDiptika = new Person("Diptika", "Devi");
        newPersonDiptika.setFavoriteBeverage("Tea");
        newPersonDiptika.setFavoriteColor("Orange");
        newPersonDiptika.setBirthMonth("June");
        newPersonDiptika.setHavePets(false);
        students.add(newPersonJonathan);

        Person newPersonQian = new Person("Qian", "Wang");
        newPersonQian.setFavoriteBeverage("Tea");
        newPersonQian.setFavoriteColor("Orange");
        newPersonQian.setBirthMonth("June");
        newPersonQian.setHavePets(false);
        students.add(newPersonQian);

        Person newPersonTim = new Person("Tim", "Linkous");
        newPersonTim.setFavoriteBeverage("Water");
        newPersonTim.setFavoriteColor("Green");
        newPersonTim.setBirthMonth("September");
        newPersonTim.setHavePets(false);
        students.add(newPersonTim);

        Person newPersonPeter = new Person("Peter", "Beever");
        newPersonPeter.setFavoriteBeverage("Latte");
        newPersonPeter.setFavoriteColor("Purple");
        newPersonPeter.setBirthMonth("February");
        newPersonPeter.setHavePets(true);
        students.add(newPersonPeter);

        Person newPersonTeddy = new Person("Teddy", "Archibald");
        newPersonTeddy.setFavoriteBeverage("Half&Half");
        newPersonTeddy.setFavoriteColor("Red");
        newPersonTeddy.setBirthMonth("March");
        newPersonTeddy.setHavePets(false);
        students.add(newPersonTeddy);

        return students;
    }

}
