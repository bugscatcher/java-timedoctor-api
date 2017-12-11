package com.timedoctor.worklogs;

import com.timedoctor.AbstractURIBuilder;

public class WorklogsURIBuilder extends AbstractURIBuilder {
    int offset;
    int limit;
    String start_date;
    String end_date;
    String user_ids;
    String task_ids;
    String project_ids;
    String fields;
    boolean breaks_only;
    boolean consolidated;
    String last_modified;

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getUser_ids() {
        return user_ids;
    }

    public void setUser_ids(String user_ids) {
        this.user_ids = user_ids;
    }

    public String getTask_ids() {
        return task_ids;
    }

    public void setTask_ids(String task_ids) {
        this.task_ids = task_ids;
    }

    public String getProject_ids() {
        return project_ids;
    }

    public void setProject_ids(String project_ids) {
        this.project_ids = project_ids;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public boolean isBreaks_only() {
        return breaks_only;
    }

    public void setBreaks_only(boolean breaks_only) {
        this.breaks_only = breaks_only;
    }

    public boolean isConsolidated() {
        return consolidated;
    }

    public void setConsolidated(boolean consolidated) {
        this.consolidated = consolidated;
    }

    public WorklogsURIBuilder addStartDateParameter(String start_date) {
        setStart_date(start_date);
        this.addParameter("start_date", start_date);
        return this;
    }

    public WorklogsURIBuilder addEndDateParameter(String end_date) {
        setEnd_date(end_date);
        this.addParameter("end_date", end_date);
        return this;
    }

    public WorklogsURIBuilder addUserIdsParameter(String user_ids) {
        setUser_ids(user_ids);
        this.addParameter("user_ids", user_ids);
        return this;
    }
}
