package com.arohau.chainOfResponsibility.ex00;

import java.util.Optional;

// Handler Interface
public interface TeamMember {
    // operation(...): Optional<T>
    Optional<Object> workOnStory(JiraStory jiraStory);

    default void defaultAction(JiraStory jiraStory) {
        System.out.println("Default action happened. " +
                "No options: need to set another JiraStoryType for your story with id=" + jiraStory.getId());
    }
}
