import java.io.*;
public class FileOperation{
    public static void main(String[] args){
        String filename="demo.txt";//file path
        try{
            File file = new File(filename);
            //create
            if(file.createNewFile()){
             System.out.println("File created  Successfully!");   
            }
            else{
                System.out.println("File Alredy Exits!");
            }
            //write
            FileWriter writer = new FileWriter(filename);
            writer.write("Java Programing Lab\n");
            writer.close();
            System.out.println("File Written Successfully!");
            //read information from the file
            FileReader reader = new FileReader(filename);
            int ch;
            while((ch=reader.read())!=-1){
                System.out.print((char)ch);
            }
            reader.close();
            //Append new content
            FileWriter appender = new FileWriter(filename,true);
            appender.write("Java Programming\n");
            appender.close();
        

        //Delete 
        if(file.delete()){
            System.out.println("File deleted Successfully!!");

        }

        else{
             System.out.println("File cannot be deleted**");
        }
    }
        catch(IOException e){
            System.out.println("Error" +e.getMessage());
        }
    }
}