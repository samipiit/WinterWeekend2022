package java_intermediate.fileIO;

import java.io.*;

public class LearnFileIO {

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

    public static void main(String[] args) {
        absPath = System.getProperty("user.dir");
        relPath = "\\src\\java_intermediate\\fileIO\\example.txt";
        filepath = absPath + relPath;

        File file = new File(filepath);

        try {
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException fnf) {
            System.out.println("FILE DOES NOT EXIST - CHECK PATH AND TRY AGAIN");
        } catch (IOException ioe) {
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
