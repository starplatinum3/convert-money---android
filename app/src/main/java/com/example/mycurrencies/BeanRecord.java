package com.example.mycurrencies;

public class BeanRecord {
    String forCode;
    String homCode;
    String forAmount;
    String homAmount;
    String time;
    public BeanRecord(){

    }

    public String getForCode() {
        return forCode;
    }

    public void setForCode(String forCode) {
        this.forCode = forCode;
    }

    public String getHomCode() {
        return homCode;
    }

    public void setHomCode(String homCode) {
        this.homCode = homCode;
    }

    public String getForAmount() {
        return forAmount;
    }

    public void setForAmount(String forAmount) {
        this.forAmount = forAmount;
    }

    public String getHomAmount() {
        return homAmount;
    }

    public void setHomAmount(String homAmount) {
        this.homAmount = homAmount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public BeanRecord(String forCode, String homCode, String forAmount, String homAmount, String time) {
        this.forCode = forCode;
        this.homCode = homCode;
        this.forAmount = forAmount;
        this.homAmount = homAmount;
        this.time = time;
    }
}
