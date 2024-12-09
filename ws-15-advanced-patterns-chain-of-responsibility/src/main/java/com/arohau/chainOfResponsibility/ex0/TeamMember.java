package com.arohau.chainOfResponsibility.ex0;

// Handler Interface
public abstract class TeamMember {

    public TeamMember nextTeamMember;

    public TeamMember(TeamMember nextTeamMember) {
        this.nextTeamMember = nextTeamMember;
    }

    public abstract void workOnStory(JiraStory jiraStory);

    public void defaultAction(JiraStory jiraStory) {
        System.out.println("Default action happened. " +
                "No options: need to set another JiraStoryType for your story with id=" + jiraStory.getId());
    }
}
