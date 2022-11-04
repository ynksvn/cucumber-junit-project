package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();
    //we want to keep it in class and be able to call it by class name

    static { //it will run first, before everything else.  it will only run one time //static block should be in static class - since we dont have main method, we need static block
        FileInputStream file = null;
        try {

            //Create FileInputStream object to open file as a stream in Java memory
            file = new FileInputStream("configuration.properties");
            //Load properties object with the file we opened using FileInputStream
            properties.load(file);
            file.close();//we need to close it, so it will not take a place in the memory

        } catch (IOException e) {
            System.out.println("File not found in ConfigurationReader class");
            e.printStackTrace(); // takes e from the exception type. It comes from java. It gives message from java
        }

    }
   public static String getProperty (String keyword){
        return properties.getProperty(keyword);
   }
   //getproperty only works for reading


//    The ConfigurationReader class is a way to provide some set up for our framework. We are able to take the properties file we create with key/value information and link that information with code. In this way we are providing some input to our program from outside of the code, which was the same purpose of using Scanner. This ConfigurationReader class has a static properties object created so we can access immediately without needed to create an object of this class.
//    Remember that this is a utility class, so we want to access the information with static references because we don't want to have to create objects of the class.
//    The thing is that we also don't need to directly access the properties object. That is why it is private because we don't need direct access to it, but instead can use the static method we create to access specific values based on the keys we give, from that properties file.
//    That static method, the utility method for getting the information from the file is the main focus of this utility class. All the components in this file are static because static members can only accept static members and on top of that we are able to use the functionality of the static block to make sure the first time this class is loaded it will load the properties files correctly, before anything else runs, to make sure we don't face any issue with loading it.

}
