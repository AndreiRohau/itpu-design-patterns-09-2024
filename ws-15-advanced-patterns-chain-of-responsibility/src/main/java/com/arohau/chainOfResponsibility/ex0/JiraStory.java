package com.arohau.chainOfResponsibility.ex0;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JiraStory {
    private long id;
    private JiraStoryType type;
    private String title;
    private String storyDescription;
    private int storyPoints;

    public enum JiraStoryType {
        TEAM_LEADER,
        FRONTEND,
        BACKEND,
        DEVOPS,
        TESTER,
        BUSINESS_ANALYST,
        NO_TYPE
    }
}
