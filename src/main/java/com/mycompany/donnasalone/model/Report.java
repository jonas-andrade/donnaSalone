package com.mycompany.donnasalone.model;

import java.util.Date;

public class Report {
        int idReport;
        String titleReport;
        Date datereport;
        String describeReport;
        String userReport;
        String totalReport;
        
        
        public Report(){
            
        }

    public Report(String titleReport, Date datereport, String describeReport, String userReport, String totalReport) {
        this.titleReport = titleReport;
        this.datereport = datereport;
        this.describeReport = describeReport;
        this.userReport = userReport;
        this.totalReport = totalReport;
    }

    public String getTitleReport() {
        return titleReport;
    }

    public Date getDatereport() {
        return datereport;
    }

    public String getDescribeReport() {
        return describeReport;
    }

    public String getUserReport() {
        return userReport;
    }

    public String getTotalReport() {
        return totalReport;
    }

    public void setTitleReport(String titleReport) {
        this.titleReport = titleReport;
    }

    public void setDatereport(Date datereport) {
        this.datereport = datereport;
    }

    public void setDescribeReport(String describeReport) {
        this.describeReport = describeReport;
    }

    public void setUserReport(String userReport) {
        this.userReport = userReport;
    }

    public void setTotalReport(String totalReport) {
        this.totalReport = totalReport;
    }
        
}
