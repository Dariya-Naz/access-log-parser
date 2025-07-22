package com.stepup;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count=0;
        while (true) {
            String path = new Scanner(System.in) .nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if ((fileExists==false) || (isDirectory==true)) {
                System.out.println("Файл не существует или является директорией");
                continue;
            }
            if (fileExists==true) {
                System.out.println("Путь указан верно");
                count+=1;
                System.out.println("Это файл номер "+count);
            }
        }
        }
    }