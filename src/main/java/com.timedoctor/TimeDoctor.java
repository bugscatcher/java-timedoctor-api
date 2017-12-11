package com.timedoctor;

import com.timedoctor.utils.RetrieveUtil;
import com.timedoctor.worklogs.WorklogsURIBuilder;
import com.timedoctor.worklogs.dto.Items;
import com.timedoctor.worklogs.dto.WorklogsResponse;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.net.URISyntaxException;

import static com.timedoctor.CommonConstants.HOST;
import static com.timedoctor.CommonConstants.SCHEME;

public class TimeDoctor {
    public static long getLengthOfTheAllTasks(String companyId,
                                              String startDate,
                                              String endDate,
                                              String userId,
                                              String accessToken) throws URISyntaxException, IOException {
        WorklogsURIBuilder builder = new WorklogsURIBuilder();
        builder.setScheme(SCHEME)
                .setHost(HOST)
                .setPath("v1.1/companies/" + companyId + "/worklogs");
        builder.addStartDateParameter(startDate);
        builder.addEndDateParameter(endDate);
        builder.addUserIdsParameter(userId);
        builder.addAccessToken(accessToken);
        HttpUriRequest request = new HttpGet(builder.build());
        HttpResponse response = HttpClientBuilder.create().build().execute(request);
        WorklogsResponse worklogsResponse = RetrieveUtil.retrieveResourceFromResponse(response, WorklogsResponse.class);
        long totalLength = 0;
        for (Items item : worklogsResponse.getWorklogs().getItems()) {
            totalLength += item.getLength();
        }
        return totalLength;
    }
}
