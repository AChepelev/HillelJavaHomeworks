package hw3.first;

import java.util.Objects;

public class Person {
    private String name;

    private String surname;

    private String patronymic;

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Person(String fullname) {
        String[] s = fullname.split(" ");
        this.name = s[0];
        this.surname = s[1];
        this.patronymic = s[2];
    }
}
