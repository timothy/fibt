/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibt;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author Timothy Bradford
 */
public class XLSFile {

    private Workbook wb = new HSSFWorkbook();
    private Sheet sheet = wb.createSheet("Friend's Birthday & Contact Info");
    Row columnRow;
    int rowCount = 1;

    public XLSFile() {
        columnRow = sheet.createRow(0);
//String firstName, String lastName, String address, String email, String phoneNumber, BirthdayDateTime birthday
        Cell cell = columnRow.createCell(0);
        cell.setCellValue("First Name");
        cell.setCellValue("Last Name");
        cell.setCellValue("Address");
        cell.setCellValue("Email");
        cell.setCellValue("Phone Number");
        cell.setCellValue("Birth Day");
        cell.setCellValue("Age");
    }

    public void populatColumns() {

    }

    public void saveFile() throws FileNotFoundException, IOException {
        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("workbook.xls");
        wb.write(fileOut);
        fileOut.close();
    }

}
