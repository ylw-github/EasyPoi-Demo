package entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

import java.io.Serializable;

public class Bill implements Serializable {

    @Excel(name = "序号",orderNum = "0")
    private int num;

    @Excel(name="工资",orderNum = "1")
    private double salary;

    @Excel(name="车费",orderNum = "2")
    private double carFare;

    @Excel(name="伙食费",orderNum = "3")
    private double eatFare;


    @Excel(name = "合计",groupName = "房租",orderNum = "4")
    private double total;
    @Excel(name = "水费",groupName = "房租",orderNum = "5")
    private double water;
    @Excel(name = "电费",groupName = "房租",orderNum = "6")
    private double eleCharge;
    @Excel(name = "物业费",groupName = "房租",orderNum = "7")
    private double manageFee;

    @Excel(name="备注",orderNum = "8")
    private String remark;

    public Bill() {
    }

    public Bill(int num, double salary, double carFare, double eatFare, double total, double water, double eleCharge, double manageFee, String remark) {
        this.num = num;
        this.salary = salary;
        this.carFare = carFare;
        this.eatFare = eatFare;
        this.total = total;
        this.water = water;
        this.eleCharge = eleCharge;
        this.manageFee = manageFee;
        this.remark = remark;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getCarFare() {
        return carFare;
    }

    public void setCarFare(double carFare) {
        this.carFare = carFare;
    }

    public double getEatFare() {
        return eatFare;
    }

    public void setEatFare(double eatFare) {
        this.eatFare = eatFare;
    }


    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getEleCharge() {
        return eleCharge;
    }

    public void setEleCharge(double eleCharge) {
        this.eleCharge = eleCharge;
    }

    public double getManageFee() {
        return manageFee;
    }

    public void setManageFee(double manageFee) {
        this.manageFee = manageFee;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "num=" + num +
                ", salary=" + salary +
                ", carFare=" + carFare +
                ", eatFare=" + eatFare +
                ", total=" + total +
                ", water=" + water +
                ", eleCharge=" + eleCharge +
                ", manageFee=" + manageFee +
                ", remark='" + remark + '\'' +
                '}';
    }
}
