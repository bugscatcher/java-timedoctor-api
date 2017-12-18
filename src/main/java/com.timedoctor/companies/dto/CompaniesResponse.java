package com.timedoctor.companies.dto;

public class CompaniesResponse {
    private User user;
    private Accounts[] accounts;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Accounts[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts[] accounts) {
        this.accounts = accounts;
    }
}
