package com.timedoctor.companies.dto;

public class Accounts {
    private long user_id;
    private long company_id;
    private String type;
    private String company_name;
    private String url;
    private int company_time_zone_id;
    private String company_subdomain;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(long company_id) {
        this.company_id = company_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getCompany_time_zone_id() {
        return company_time_zone_id;
    }

    public void setCompany_time_zone_id(int company_time_zone_id) {
        this.company_time_zone_id = company_time_zone_id;
    }

    public String getCompany_subdomain() {
        return company_subdomain;
    }

    public void setCompany_subdomain(String company_subdomain) {
        this.company_subdomain = company_subdomain;
    }
}
