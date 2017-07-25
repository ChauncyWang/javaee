package com.chava96;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestPoi {
    public static void main(String[] args) {
        try {
            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet sheet = wb.createSheet("new sheet");
            for(int i =0;i < 10;++i) {
                HSSFRow row = sheet.createRow((short)i);
                for(int j = 0;j < 10;++j) {
                    if (i <= j) {
                        Cell cell = row.createCell(j);
                        cell.setCellValue(String.format("%2d*%2d=%4d", i, j, i * j));
                    }
                }
            }
            wb.write(new FileOutputStream("1.xls"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
