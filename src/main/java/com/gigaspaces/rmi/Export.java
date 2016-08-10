package com.gigaspaces.rmi;

import com.gigaspaces.config.lrmi.nio.NIOConfiguration;
import com.gigaspaces.lrmi.GenericExporter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.rmi.Remote;

/**
 * Created by Barak Bar Orion
 * on 8/10/16.
 *
 * @since 12.0
 */
public class Export {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server impl = new ServerImpl();
        GenericExporter exporter = new GenericExporter(NIOConfiguration.create());
        Remote exported = exporter.export(impl);
        write(exported, "Exported.ser");
        System.out.println("Server exported");
        Thread.sleep(Integer.MAX_VALUE);
    }

    private static void write(Remote exported, String filename) throws IOException {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filename))) {
            os.writeObject(exported);
        }
    }
}
