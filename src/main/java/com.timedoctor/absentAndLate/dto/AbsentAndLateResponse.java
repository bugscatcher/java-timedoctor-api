package com.timedoctor.absentAndLate.dto;

public class AbsentAndLateResponse {
    private String fullname;
    private Schedules[] schedules;
    private CompanyReasons[] companyReasons;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Schedules[] getSchedules() {
        return schedules;
    }

    public void setSchedules(Schedules[] schedules) {
        this.schedules = schedules;
    }

    public CompanyReasons[] getCompanyReasons() {
        return companyReasons;
    }

    public void setCompanyReasons(CompanyReasons[] companyReasons) {
        this.companyReasons = companyReasons;
    }
}
