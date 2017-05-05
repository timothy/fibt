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
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author Timothy Bradford
 */
public class XLSFile {

    //Example formulas from: https://www.extendoffice.com/documents/excel/853-excel-convert-birthdate-to-age.html
    public String bDataFormula1 = "=DATEDIF(F2,TODAY(),\"Y\") & \" Years, \" & DATEDIF(F2,TODAY(),\"YM\") & \" Months, \" & DATEDIF(F2,TODAY(),\"MD\") & \" Days\"";
    public String bDataFormula2 = "=DATEDIF(A2,NOW(),\"y\")";
    public String bDataFormula3 = "=ROUNDDOWN(YEARFRAC(A2, TODAY(), 1), 0)";

    private Workbook wb = new HSSFWorkbook();
    private Sheet sheet = wb.createSheet("Friend's Birthday & Contact Info");
    Row columnRow;

    public XLSFile() {
        columnRow = sheet.createRow(0);

//String firstName, String lastName, String address, String email, String phoneNumber, BirthdayDateTime birthday
        columnRow.createCell(0).setCellValue("First Name");//A
        columnRow.createCell(1).setCellValue("Last Name");//B
        columnRow.createCell(2).setCellValue("Address");//C
        columnRow.createCell(3).setCellValue("Email");//D
        columnRow.createCell(4).setCellValue("Phone Number");//E
        columnRow.createCell(5).setCellValue("Birth Day");//F
        columnRow.createCell(6).setCellValue("Age");//G
    }

    public void populatColumns() {

    }

    public String getAgeFormula(int rowNum) {
        return "=DATEDIF(F" + rowNum + ",TODAY(),\"Y\") & \" Years, \" & DATEDIF(F" + rowNum + ",TODAY(),\"YM\") & \" Months, \" & DATEDIF(F" + rowNum + ",TODAY(),\"MD\") & \" Days\"";
    }

    public void saveFile() throws FileNotFoundException, IOException {
        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("workbook.xls");
        wb.write(fileOut);
        fileOut.close();
    }

    public void addRow(People p) {
        Row row = sheet.createRow(sheet.getLastRowNum() + 1);

        row.createCell(0).setCellValue(p.getFirstName());//A
        row.createCell(1).setCellValue(p.getLastName());//B
        row.createCell(2).setCellValue(p.getAddress());//C
        row.createCell(3).setCellValue(p.getEmail());//D
        row.createCell(4).setCellValue(p.getPhoneNumber());//E
        row.createCell(5).setCellValue(p.getBirthday().toString());//F

        // Cell cell = row.createCell(6);
        //cell.setCellFormula(bDataFormula1);
        // cell.setCellType(CellType.FORMULA);
        row.createCell(6).setCellValue(getAgeFormula(row.getRowNum() + 1));//G
    }

}
