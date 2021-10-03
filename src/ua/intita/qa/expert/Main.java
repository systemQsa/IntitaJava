package ua.intita.qa.expert;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Info object1 = new Info();
        object1.setName("Alex");
        object1.setGroup('A');
        object1.setLessons(new String[]{"english", "math", "algorithms", "medicine"});
        object1.setAge(24);
        object1.setAverageGrade((byte) 85);
        object1.setStudent(true);
        object1.setWeight(47.8);
        object1.setCloseSize(32);
        try (XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("info.xml")))) {
            xmlEncoder.writeObject(object1);
            xmlEncoder.flush();
        } catch (IOException e) {
            e.getMessage();
        }

        Info object2 = new Info();
        try (XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("info.xml")))) {
            object2 = (Info) xmlDecoder.readObject();

        } catch (FileNotFoundException e) {
            e.getMessage();
        }
        System.out.println(object2.getName() + " " + object2.getAge() + " " + object2.getGroup());
    }
}
