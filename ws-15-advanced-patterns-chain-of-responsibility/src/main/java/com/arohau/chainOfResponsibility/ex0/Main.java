package com.arohau.chainOfResponsibility.ex0;

import com.arohau.chainOfResponsibility.ex0.teamMember.*;

public class Main {
    public static void main(String[] args) {
        JiraStory jiraStory1 = JiraStory.builder()
                .type(JiraStory.JiraStoryType.BACKEND)
                .title("Fix bug")
                .storyDescription("We have a bug in registration")
                .storyPoints(10)
                .build();

        JiraStory jiraStory2 = JiraStory.builder()
                .type(JiraStory.JiraStoryType.TESTER)
                .title("Test new feature")
                .storyDescription("We have to test new registration approach")
                .storyPoints(5)
                .build();

        TeamLeader teamLeader = initTeam();

        teamLeader.workOnStory(jiraStory1);
        teamLeader.workOnStory(jiraStory2);
    }

    private static TeamLeader initTeam() {
        return new TeamLeader(
                new BackendDeveloper(
                        new BusinessAnalyst(
                                new DevelopmentOperations(
                                        new FrontendDeveloper(
                                                new Tester(null))))));
    }
}
