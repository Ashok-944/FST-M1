package Activity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        File file = new File("sample.txt");
        boolean fStatus = file.createNewFile();

        FileWriter writer = new FileWriter(file);
        writer.write("Hello! This is a test file.");
        writer.close();

        String fileData = FileUtils.readFileToString(file, "UTF8");
        System.out.println("Data in file: " + fileData);

        File destDir = new File("destDir");
        destDir.mkdir();

        FileUtils.copyFileToDirectory(file, destDir);

        File newFile = FileUtils.getFile(destDir, "sample.txt");

        String newFileData = FileUtils.readFileToString(newFile, "UTF8");
        System.out.println("Data in copied file: " + newFileData);
    }
}
