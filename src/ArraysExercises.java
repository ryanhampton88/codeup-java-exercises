import java.util.*;
import java.lang.*;
import java.util.Arrays;
public class ArraysExercises {

    public static void main(String[] args) {

       Person person1 = new Person("Ryan");
       Person person2 = new Person ("Roman");
       Person person3 = new Person ("Rylan");
       Person person4 = new Person ("Carmela");

       Person[] personArray = new Person[3];

       personArray[0] = person1;
       personArray[1] = person2;
       personArray[2] = person3;

        for (Person individual : personArray) {
            System.out.println(individual.getName());
        }

        addPerson(person4, personArray);


    }
    public static Person addPerson(Person person, Person[] personArray) {

        List<Person> arrList = new ArrayList<Person>(Arrays.asList(personArray));
        arrList.add(person);
        personArray = arrList.toArray(personArray);

        for (Person individual: personArray) {
            System.out.println(individual.getName());
        }

        return null;
    }

}
