package Mashq3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileSearchAndRead {

    public static void main(String[] args) {
        String folderPath = "C:/imtihon1/new";
        String fileName = "PhoneNumbers.txt";

        File folder = new File(folderPath);
        File file = findFileInDirectory(folder, fileName);

        if (file != null) {
            System.out.println("Fayl topildi: " + file.getAbsolutePath());
            try {
                String content = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
                System.out.println("Fayl mazmuni: \n" + content);


                findAndPrintMultipleDigits(content);
            } catch (IOException e) {
                System.out.println("Faylni o'qishda xatolik yuz berdi: " + e.getMessage());
            }
        } else {
            System.out.println("Fayl topilmadi.");
        }
    }
    public static File findFileInDirectory(File directory, String fileName) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    File found = findFileInDirectory(file, fileName);
                    if (found != null) {
                        return found;
                    }
                } else if (file.getName().equals(fileName)) {
                    return file;
                }
            }
        }
        return null;
    }

    public static void findAndPrintMultipleDigits(String content) {
        Pattern pattern = Pattern.compile("\\+998\\d{9,}");
        Matcher matcher = pattern.matcher(content);

        System.out.println("Barcha raqamlar :");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
