import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

class Cat {
    String name = "Nina";
    double age = 1.5;

    public void meow() { // public methods let you call them even outside of the class
                         // for example on the instance of a class.
        System.out.println("Meow");
    }
}

class Dog { // Just one public class per file.
    String name;
    double age;

    public void bark() {
        System.out.println("Guau");
    }

    public Dog(String name, double age) {
        this.name = name;
        this.age = age;
    }
}

public class Variables {
    public static void main(String[] args) { // static means that it belongs to the class itself
                                             // and not to an instance of the class
        int integer = 1;
        double decimal = 2.2;
        boolean affirmation = true;
        char character = 'A';

        String word = "Word";
        int[] array = {1, 2, 3, 4}; 

        System.out.println(integer);
        System.out.println(decimal);
        System.out.println(affirmation);
        System.out.println(character);
        System.out.println(word);
        System.out.println(Arrays.toString(array));

        List<String> languages = new ArrayList<>();
        languages.add("Portuguese");
        languages.add("English");
        languages.add("Spanish");
        List<String> level = new LinkedList<>();
        level.add("B1");
        level.add("C1");
        level.add("C2");

        System.out.println("Language number 2 the programmer speaks");
        System.out.println(languages.get(2));
        System.out.println(level.get(2));

        Cat nina = new Cat();
        nina.meow();
        System.out.println(nina.name);
        System.out.println(nina.age);

        Dog uma = new Dog("Uma", 7);
        uma.bark();
        System.out.println(uma.name);
        System.out.println(uma.age);
    } 
}

// How does arrays, strings, lists and objects work