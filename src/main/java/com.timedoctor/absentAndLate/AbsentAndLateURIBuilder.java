package com.timedoctor.absentAndLate;

import com.timedoctor.AbstractURIBuilder;

public class AbsentAndLateURIBuilder extends AbstractURIBuilder {
    private static final String USER_ID = "userId";
    private static final String START_DATE = "start_date";
    private static final String END_DATE = "end_date";
    private static final String OFFSET = "offset";
    private static final String LIMIT = "limit";

    public AbsentAndLateURIBuilder addUserIdParameter(String userId) {
        this.addParameter(USER_ID, userId);
        return this;
    }

    public AbsentAndLateURIBuilder addStartDateParameter(String startDate) {
        this.addParameter(START_DATE, startDate);
        return this;
    }

    public AbsentAndLateURIBuilder addEndDateParameter(String endDate) {
        this.addParameter(END_DATE, endDate);
        return this;
    }

    public AbsentAndLateURIBuilder addOffsetParameter(int offset) {
        this.addParameter(OFFSET, String.valueOf(offset));
        return this;
    }

    public AbsentAndLateURIBuilder addLimitParameter(int limit) {
        this.addParameter(LIMIT, String.valueOf(limit));
        return this;
    }
}
