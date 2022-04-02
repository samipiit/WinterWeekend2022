package java_intermediate.fileIO.text_files;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class LearnTextFileIO {

    /*
    Two Different Types of Paths
        1. Absolute Path
        2. Relative Path
     */

    static String absPath;
    static String relPath;
    static String filepath;

    static FileInputStream fis;
    static InputStreamReader isr;
    static BufferedReader br;

    static FileOutputStream fos;
    static OutputStreamWriter osw;
    static BufferedWriter bw;


    public static void main(String[] args) {
        absPath = System.getProperty("user.dir");
        relPath = "\\src\\java_intermediate\\fileIO\\example.txt";
        filepath = absPath + relPath;
        File file = new File(filepath);

        // WRITING TO FILE (OUTPUT)
        try {
            String output = "We are learning to write to java text files";

            fos = new FileOutputStream(file);
            osw = new OutputStreamWriter(fos);
            bw = Files.newBufferedWriter(Path.of(filepath));

            bw.write(output);

        } catch (FileNotFoundException fnf) {
            System.out.println("FILE DOES NOT EXIST - CHECK PATH AND TRY AGAIN");
        } catch (IOException ioe) {
            System.out.println("ENCOUNTERED ISSUE WITH FILE INTERACTION (I/O) - PLEASE CHECK YOUR CODE AND TRY AGAIN");
        } finally {
            try {
                fos.close();
                osw.close();
                bw.close();
            } catch (IOException ioe) {
                System.out.println("UNABLE TO CLOSE RESOURCE! PLEASE CHECK YOUR CODE AND TRY AGAIN");
            }
        }


        // READING FILE (INPUT)
        try {
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("FILE DOES NOT EXIST - CHECK PATH AND TRY AGAIN");

        } catch (IOException ioException) {
            System.out.println("COULD NOT READ/WRITE TO/FROM THE FILE. PLEASE CHECK YOUR FILE FOR CORRUPTED DATA");

        } finally {
            try {
                fis.close();
                isr.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
