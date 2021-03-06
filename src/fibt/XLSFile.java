/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibt;

/**
 * Note: In order for this class to work you need to import the poi-3.16.jar file into the project's Libraries folder...
 * poi jar file can be found here: http://poi.apache.org/download.html
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * This will create an xls Excel document and can handle adding new people to the document.
 * This requires the import of https://poi.apache.org/
 *
 * @author Timothy Bradford
 */
public class XLSFile {

    //Example formulas from: https://www.extendoffice.com/documents/excel/853-excel-convert-birthdate-to-age.html
    public String bDataFormula1 = "=DATEDIF(F2,TODAY(),\"Y\") & \" Years, \" & DATEDIF(F2,TODAY(),\"YM\") & \" Months, \" & DATEDIF(F2,TODAY(),\"MD\") & \" Days\"";
    public String bDataFormula2 = "=DATEDIF(A2,NOW(),\"y\")";
    public String bDataFormula3 = "=ROUNDDOWN(YEARFRAC(A2, TODAY(), 1), 0)";
    public ArrayList<People> xls = new ArrayList<>();

    private Workbook wb = new HSSFWorkbook();
    private Sheet sheet = wb.createSheet("Friend's Birthday & Contact Info");
    Row columnRow;

    /**
     * Default constructor
     */
    public XLSFile() {
        columnRow = sheet.createRow(0);
        populatColumns();
    }

    /**
     * Set column titles
     */
    private void populatColumns() {
//String firstName, String lastName, String address, String email, String phoneNumber, BirthdayDateTime birthday
        Column c = new Column();
        columnRow.createCell(0).setCellValue(c.getFisrtName());//A
        columnRow.createCell(1).setCellValue(c.getLastName());//B
        columnRow.createCell(2).setCellValue(c.getAddress());//C
        columnRow.createCell(3).setCellValue(c.getEmail());//D
        columnRow.createCell(4).setCellValue(c.getPhoneNum());//E
        columnRow.createCell(5).setCellValue(c.getbDay());//F
        columnRow.createCell(6).setCellValue(c.getAge());//G
    }

    /**
     *
     * @param rowNum the row number of the birth date
     * @return the excel formula needed to calculate the birth date
     */
    public String getAgeFormula(int rowNum) {
        return "=DATEDIF(F" + rowNum + ",TODAY(),\"Y\") & \" Years, \" & DATEDIF(F" + rowNum + ",TODAY(),\"YM\") & \" Months, \" & DATEDIF(F" + rowNum + ",TODAY(),\"MD\") & \" Days\"";
    }

    /**
     * Saves the file to disc
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void saveFile() throws FileNotFoundException, IOException {
        saveFile("workbook.xls");
    }

    /**
     * Saves the file to disc
     *
     * @param directory the string path of directory to be saved to
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void saveFile(String directory) throws FileNotFoundException, IOException {
        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream(directory);
        wb.write(fileOut);
        fileOut.close();
    }

    /**
     * Adds a row with the persons data
     *
     * @param p a valid People object
     */
    public void addRow(People p) {
        xls.add(p);
        Row row = sheet.createRow(sheet.getLastRowNum() + 1);

        row.createCell(0).setCellValue(p.getFirstName());//A
        row.createCell(1).setCellValue(p.getLastName());//B
        row.createCell(2).setCellValue(p.getAddress());//C
        row.createCell(3).setCellValue(p.getEmail());//D
        row.createCell(4).setCellValue(p.getPhoneNumber());//E
        row.createCell(5).setCellValue(p.getBirthday().toString());//F

        // Cell cell = row.createCell(6);
        // cell.setCellFormula(bDataFormula1);
        // cell.setCellType(CellType.FORMULA);
        row.createCell(6).setCellValue(getAgeFormula(row.getRowNum() + 1));//G
    }

    /**
     * Imports the excel file from the default location
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void importFile() throws FileNotFoundException, IOException {
        importFile("workbook.xls");
    }

    /**
     * Imports the excel file from the default location
     *
     * @param filePath the path of the xls file
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void importFile(String filePath) throws FileNotFoundException, IOException {
        //String filePath = "workbook.xls";
        //String test = "C:\\Users\\^_^\\Documents\\NetBeansProjects\\FIBT\\workbook.xls";
        FileInputStream inputStream = new FileInputStream(new File(filePath));

        Workbook workbook = new HSSFWorkbook(inputStream);
        Sheet firstSheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = firstSheet.iterator();

        //Jump over the first row of column titles...
        Boolean jump = true;
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            if (!jump) {
                this.addRow(new People(nextRow.getCell(0).getStringCellValue(),
                        nextRow.getCell(1).getStringCellValue(),
                        nextRow.getCell(2).getStringCellValue(),
                        nextRow.getCell(3).getStringCellValue(),
                        nextRow.getCell(4).getStringCellValue(),
                        new BirthdayDateTime(nextRow.getCell(5).getStringCellValue())));
            }
            jump = false;
        }

        workbook.close();
        inputStream.close();
    }
}
