package com.arohau.chainOfResponsibility.ex0.teamMember;

import com.arohau.chainOfResponsibility.ex0.JiraStory;
import com.arohau.chainOfResponsibility.ex0.TeamMember;

import java.util.List;

// Concrete handlers
public class BackendDeveloper extends TeamMember {

    private final List<JiraStory.JiraStoryType> managedStoryTypes = List.of(JiraStory.JiraStoryType.BACKEND);

    public BackendDeveloper(TeamMember nextTeamMember) {
        super(nextTeamMember);
    }

    @Override
    public void workOnStory(JiraStory jiraStory) {
        if (managedStoryTypes.contains(jiraStory.getType())) {
            try {
                System.out.println(this.getClass().getSimpleName() + " started working on this story");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (nextTeamMember != null) {
            nextTeamMember.workOnStory(jiraStory);
        } else {
            defaultAction(jiraStory);
        }
    }
}
