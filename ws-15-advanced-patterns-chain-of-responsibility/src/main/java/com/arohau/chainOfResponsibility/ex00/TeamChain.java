package com.arohau.chainOfResponsibility.ex00;

import java.util.LinkedList;
import java.util.Optional;

public class TeamChain implements TeamMember {
    private final LinkedList<TeamMember> teamMembers = new LinkedList<>();

    @Override
    public Optional<Object> workOnStory(JiraStory jiraStory) {
        Optional<Object> result = Optional.empty();
        for (TeamMember member: teamMembers) {
            result = member.workOnStory(jiraStory);
            if (result.isPresent()) {
                break;
            }
        }
        if (result.isEmpty()) {
            defaultAction(jiraStory);
        }
        return Optional.empty();
    }

    public void addFirst(TeamMember teamMember) {
        teamMembers.addFirst(teamMember);
    }

    public void addLast(TeamMember teamMember) {
        teamMembers.addLast(teamMember);
    }
}
