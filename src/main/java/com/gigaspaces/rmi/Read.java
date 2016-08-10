package com.gigaspaces.rmi;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by Barak Bar Orion
 * on 8/10/16.
 *
 * @since 12.0
 */
public class Read {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Server proxy = read("Exported.ser", Server.class);
        int random = proxy.rnd();
        System.out.println("Random is " + random);

    }

    private static <T> T read(String filename, Class<T> cls) throws IOException, ClassNotFoundException {
        try(ObjectInputStream os = new ObjectInputStream(new FileInputStream(filename))){
               return cls.cast(os.readObject());
        }
    }
}
