package exercise.java.serializations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver {

    public static void main(String[] args) {
        DungeonGame d = new DungeonGame();
        System.out.println("***** Before *****");
        System.out.println(d);

        try {

            /**
             * Output Object
             */
            FileOutputStream fos = new FileOutputStream("dg.ser");
            // if there is no dg.ser, FileOutputStream create new file.
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // if this cannot find dg.ser, ObjectOutputStream create new file.
            oos.writeObject(d);
            oos.close();

            /**
             * Input Object
             * */
            // if this cannot find dg.ser, throws error
            FileInputStream fis = new FileInputStream("dg.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            // readObject() returns Object type object. so you need to cast it to particular object.
            d = (DungeonGame) ois.readObject();
            ois.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("***** After *****");
        System.out.println(d);
    }
}
