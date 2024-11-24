package com.kun.tests;

/**
 * ClassName: SimpleCSVReader
 * Package: com.kun.tests
 * Description:
 *
 * @Author KunJiang
 * @Create 11/23/24 4:31 PM
 * @Version 1.0
 */

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class SimpleCSVReader {

    private static final String CSV_FILE_PATH = "src/main/resources/user_data.csv";

    public static void main(String[] args) {
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE_PATH))) {
            // 读取 CSV 文件的所有行
            List<String[]> records = null;
            try {
                records = reader.readAll();
            } catch (CsvException e) {
                e.printStackTrace();
            }

            // 打印每一行内容
            for (String[] record : records) {
                System.out.println("Name: " + record[0] + ", Email: " + record[1] + ", Age: " + record[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

