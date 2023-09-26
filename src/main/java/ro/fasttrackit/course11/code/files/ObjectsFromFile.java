package ro.fasttrackit.course11.code.files;

import ro.fasttrackit.course11.code.person.Person;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectsFromFile {
    public static void main(String[] args) throws IOException {
        List<Person> people = readPeople();
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("============================");
        Person person1 = Person.builder()
                .firstName("Mike")
                .lastName("Greene")
                .build();

        Person person2 = Person.builder()
                .firstName("Alex")
                .age(54)
                .build();

        System.out.println(person1);
        System.out.println(person2);
    }

    public static List<Person> readPeople() throws IOException {
        Scanner scanner = new Scanner(Path.of("files/people.txt"));
        List<Person> people = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            people.add(convertLineToPerson(line));
        }

        return people;
    }

    private static Person convertLineToPerson(String line) {
        String[] tokens = line.split("[|]");

        if (tokens.length < 2) {
            return null;
        }

        return Person.builder()
                .firstName(tokens[0])
                .lastName(tokens.length == 2 ? tokens[1] : null)
                .age(tokens.length == 3 ? parseAge(tokens[2]) : 18)
                .build();



//        return new Person(tokens[0],
//                tokens.length == 2 ? tokens[1] : "Unknown",
//                tokens.length == 3 ? parseAge(tokens[2]) : 18);
    }

    private static int parseAge(String ageString) {
        return Integer.parseInt(ageString.replaceAll("[^0-9]", ""));
    }
}
