import java.util.Objects;

public class Person {
    private final String NAME;
    private final String SURNAME;
    private Integer age;
    private String currentCity;

    public Person(String NAME, String SURNAME) {
        this.NAME = NAME;
        this.SURNAME = SURNAME;
    }

    public Person(String NAME, String SURNAME, Integer age, String currentCity) {
        this.NAME = NAME;
        this.SURNAME = SURNAME;
        this.age = age;
        this.currentCity = currentCity;
    }

    public String getNAME() {
        return NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public Integer getAge() {
        return age;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public boolean hasAge() {
        return getAge() != null;
    }

    public boolean hasCity() {
        return getCurrentCity() != null;
    }

    public void happyBirthday() {
        if (hasAge()) age += 1;
    }

    public PersonBuilder newChildBuilder(){
        return new PersonBuilder()
                .setSurname(SURNAME)
                .setCurrentCity(currentCity);
    }

    @Override
    public String toString() {
        return "Person{" +
                "NAME='" + NAME + '\'' +
                ", SURNAME='" + SURNAME + '\'' +
                ", age=" + age +
                ", currentCity='" + currentCity + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME, SURNAME);
    }
}
