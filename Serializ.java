import java.io.*;

class person implements Serializable {
    private String name;
    private int age;
    private String contact;

    public person(String name, int age, String contact) {
    this.name = name;
    this.age = age;
    this.contact = contact;
    }

    public String getName() {
return name;
    }

public int getAge() {
 return age;
}

public String getContact() {
return contact;
}
}

public class Serializ {
public static void main(String[] args) {
        
person person = new person("Abhijeet", 19, "abhijeet@mythvendix.com");
        
try (FileOutputStream fileOut = new FileOutputStream("person.ser");
 ObjectOutputStream objectout = new ObjectOutputStream(fileOut)) {

objectout.writeObject(person);
System.out.println("Person object serialized successfully.");

} catch (IOException e) {
e.printStackTrace();
}

try (FileInputStream fileIn = new FileInputStream("person.ser");
    ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

person deserializPerson = (person) objectIn.readObject();
System.out.println("Person object deserialized successfully.");
System.out.println("Name: " + deserializPerson.getName());
System.out.println("Age: " + deserializPerson.getAge());
System.out.println("Contact: " + deserializPerson.getContact());

} catch (IOException | ClassNotFoundException e) {
e.printStackTrace();
}
}
}



