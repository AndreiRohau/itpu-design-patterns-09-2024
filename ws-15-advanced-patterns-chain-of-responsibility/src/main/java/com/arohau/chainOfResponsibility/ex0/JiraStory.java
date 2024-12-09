package com.arohau.chainOfResponsibility.ex0;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JiraStory {
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
        BUSINESS_ANALYST
    }
}
