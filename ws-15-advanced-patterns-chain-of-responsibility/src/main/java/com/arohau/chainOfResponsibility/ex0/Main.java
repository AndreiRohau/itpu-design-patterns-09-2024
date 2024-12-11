package com.arohau.chainOfResponsibility.ex0;

import com.arohau.chainOfResponsibility.ex0.teamMember.*;

public class Main {
    public static void main(String[] args) {
        JiraStory jiraStory1 = JiraStory.builder()
                .id(1)
                .type(JiraStory.JiraStoryType.BACKEND)
                .title("Fix bug")
                .storyDescription("We have a bug in registration")
                .storyPoints(10)
                .build();

        JiraStory jiraStory2 = JiraStory.builder()
                .id(2)
                .type(JiraStory.JiraStoryType.TESTER)
                .title("Test new feature")
                .storyDescription("We have to test new registration approach")
                .storyPoints(5)
                .build();

        JiraStory jiraStory3 = JiraStory.builder()
                .id(3)
                .type(JiraStory.JiraStoryType.NO_TYPE)
                .title("Test new feature")
                .storyDescription("We have to test new registration approach")
                .storyPoints(5)
                .build();

        TeamLeader teamLeader = initTeam();

        teamLeader.workOnStory(jiraStory1);
        teamLeader.workOnStory(jiraStory2);
        teamLeader.workOnStory(jiraStory3); // default action happened
    }

    private static TeamLeader initTeam() {
        Tester tester = new Tester(null);
        FrontendDeveloper frontendDeveloper = new FrontendDeveloper(tester);
        DevelopmentOperations developmentOperations = new DevelopmentOperations(frontendDeveloper);
        BusinessAnalyst businessAnalyst = new BusinessAnalyst(developmentOperations);
        BackendDeveloper backendDeveloper = new BackendDeveloper(businessAnalyst);
        TeamLeader teamLeader = new TeamLeader(backendDeveloper);
        return teamLeader;
    }
}
