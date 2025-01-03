package com.arohau.chainOfResponsibility.ex00;

import java.util.List;
import java.util.Optional;

// Concrete handlers
public class FrontendDeveloper implements TeamMember {

    private final List<JiraStory.JiraStoryType> managedStoryTypes = List.of(JiraStory.JiraStoryType.FRONTEND);

    @Override
    public Optional<Object> workOnStory(JiraStory jiraStory) {
        if (managedStoryTypes.contains(jiraStory.getType())) {
            try {
                System.out.println(this.getClass().getSimpleName() + " started working on this story");
                return Optional.of(this);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            return Optional.empty();
        }
    }
}
