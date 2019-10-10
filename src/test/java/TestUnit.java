import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import entity.Bill;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestUnit {

    @Test
    public void exportExcel() throws Exception {
        List<Bill> billList = new ArrayList<>();
        billList.add(new Bill(1, 10000, 1000, 1500, 1200, 100, 200, 100, "余额充足"));
        billList.add(new Bill(2, 10000, 1200, 1000, 1200, 100, 200, 100, "余额不足"));
        billList.add(new Bill(3, 14000, 1300, 1200, 1200, 100, 200, 100, "无"));
        billList.add(new Bill(4, 14000, 1100, 1300, 1200, 100, 200, 100, "无"));
        billList.add(new Bill(5, 14000, 1200, 1400, 1200, 100, 200, 100, "无"));
        billList.add(new Bill(6, 14000, 1500, 1500, 1200, 100, 200, 100, "无"));
        billList.add(new Bill(7, 15000, 1800, 100, 1200, 100, 200, 100, "还贷"));
        billList.add(new Bill(8, 14000, 1200, 1400, 1200, 100, 200, 100, "无"));
        billList.add(new Bill(9, 14000, 1500, 1500, 1200, 100, 200, 100, "无"));
        billList.add(new Bill(10, 14000, 1200, 1400, 1200, 100, 200, 100, "无"));
        billList.add(new Bill(11, 14000, 1500, 1500, 1200, 100, 200, 100, "余额不足"));
        billList.add(new Bill(12, 14000, 1200, 1400, 1200, 100, 200, 100, "余额不足"));

        ExportParams params = new ExportParams();
        params.setTitle("年度账单");
        params.setSheetName("年度账单表");
        params.setType(ExcelType.XSSF);

        Workbook workbook = ExcelExportUtil.exportExcel(params, Bill.class, billList);
        FileOutputStream fileOutputStream = new FileOutputStream("Bill.xls");
        workbook.write(fileOutputStream);

    }

    @Test
    public void importExcel() throws Exception {
        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(2);
        List<Bill> bills = ExcelImportUtil.importExcel(new File("Bill.xls"), Bill.class, params);
        for (Bill bill : bills) {
            System.out.println(bill.toString());
        }
    }
}
