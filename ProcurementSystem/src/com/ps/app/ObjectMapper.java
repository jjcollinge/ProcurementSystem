
package com.ps.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Responsible for serializing and deserializing POJOs
 * @author JCollinge
 */
public class ObjectMapper {
    
    /**
     * Attempts to serialize a given object and store it in
     * the provided file name.
     * @param obj Object to serialize
     * @param filename File path to write to
     */
    public static void Serialize(Object obj, String filename)
    {
        try {
            FileOutputStream out = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(obj);
            out.close();
        } catch(IOException e) {
            System.out.println("Failed to load file: " + filename + ", it may not exist");
        }
    }
  
    /**
     * Attempts to deserialize data from a given file and
     * return the equivalent POJO.
     * @param filename File path to read from
     * @return POJO
     */
    public static Object Deserialize(String filename)
    {
        FileInputStream in = null;
        Object obj = null;
        try {
            in = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(in);
            obj = ois.readObject();
            in.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Failed to load file: " + filename + ", it may not exist");
        } catch (IOException ex) {
            System.out.println("IO Exception thrown, was it interrupted?");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            System.out.println("Cannot deserialize to this type because I can't find the class!");
        } 
        return obj;
    }
}
