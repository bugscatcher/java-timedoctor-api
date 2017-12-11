package com.timedoctor.worklogs.dto;

public class WorklogsResponse {
    String start_time;
    String end_time;
    long total;
    String url;
    Worklogs worklogs;

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Worklogs getWorklogs() {
        return worklogs;
    }

    public void setWorklogs(Worklogs worklogs) {
        this.worklogs = worklogs;
    }
}
