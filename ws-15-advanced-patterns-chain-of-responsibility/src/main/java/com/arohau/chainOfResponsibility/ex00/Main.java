package com.arohau.chainOfResponsibility.ex00;

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

        TeamMember managerObject = initManagerObject();

        managerObject.workOnStory(jiraStory1);
        managerObject.workOnStory(jiraStory2);
        managerObject.workOnStory(jiraStory3); // default action happened
    }

    private static TeamMember initManagerObject() {
        TeamChain managerObject = new TeamChain();
        managerObject.addFirst(new TeamLeader());
        managerObject.addLast(new BusinessAnalyst());
        managerObject.addLast(new BackendDeveloper());
        managerObject.addLast(new FrontendDeveloper());
        managerObject.addLast(new Tester());
        managerObject.addLast(new DevelopmentOperations());
        return managerObject;
    }
}
