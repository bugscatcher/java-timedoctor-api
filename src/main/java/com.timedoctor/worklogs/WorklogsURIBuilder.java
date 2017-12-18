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

    public WorklogsURIBuilder addStartDateParameter(String start_date) {
        this.addParameter("start_date", start_date);
        return this;
    }

    public WorklogsURIBuilder addEndDateParameter(String end_date) {
        this.addParameter("end_date", end_date);
        return this;
    }

    public WorklogsURIBuilder addUserIdsParameter(String user_ids) {
        this.addParameter("user_ids", user_ids);
        return this;
    }
}
