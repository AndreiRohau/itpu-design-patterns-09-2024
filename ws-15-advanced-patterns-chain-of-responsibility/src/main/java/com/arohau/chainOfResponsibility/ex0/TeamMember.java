package com.arohau.chainOfResponsibility.ex0;

public abstract class TeamMember {

    public TeamMember nextTeamMember;

    public TeamMember(TeamMember nextTeamMember) {
        this.nextTeamMember = nextTeamMember;
    }

    public abstract void workOnStory(JiraStory jiraStory);
}
