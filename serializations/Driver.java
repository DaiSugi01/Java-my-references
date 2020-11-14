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
            FileOutputStream fos = new FileOutputStream("dg.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);
            oos.close();
            FileInputStream fis = new FileInputStream("dg.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            d = (DungeonGame) ois.readObject();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("***** After *****");
        System.out.println(d);
    }
}
