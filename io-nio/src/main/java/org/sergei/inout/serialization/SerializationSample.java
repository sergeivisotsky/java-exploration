package org.sergei.inout.serialization;

import java.io.*;

/**
 * @author Sergei Visotsky
 */
public class SerializationSample {

    private void writeObjects(Animal... animals) {
        try(FileOutputStream fos = new FileOutputStream(
                new File(String.valueOf(
                        this.getClass().getResourceAsStream("src/main/resources/files/serialized_obj.txt"))));
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(animals[0]); // FIXME: Object is not written into the file
            oos.writeObject(animals[1]); // FIXME: Object is not written into the file

            try(FileInputStream fis = new FileInputStream(
                    new File(String.valueOf(
                        this.getClass().getResourceAsStream(("src/main/resources/files/serialized_obj.txt")))));
                ObjectInputStream ois = new ObjectInputStream(fis)) {

                Animal catRead = (Animal) ois.readObject();
                Animal dogRead = (Animal) ois.readObject();

                System.out.println(catRead);
                System.out.println(dogRead);

            } catch (IOException e) {
                e.getMessage();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.getMessage();
        }
    }

    public static void main(String[] args) {

        Animal cat = Animal
                       .newBuilder()
                            .withId(1L)
                            .withName("Francisk")
                            .withType("cat")
                            .withBreed("persian")
                            .withWeight(1.5)
                       .build();

        Animal dog = Animal
                        .newBuilder()
                            .withId(2L)
                            .withName("Adam")
                            .withType("dog")
                            .withBreed("Golden retriever")
                            .withWeight(3.2)
                        .build();

        SerializationSample fileSerializer = new SerializationSample();
        fileSerializer.writeObjects(cat, dog);

    }

}
