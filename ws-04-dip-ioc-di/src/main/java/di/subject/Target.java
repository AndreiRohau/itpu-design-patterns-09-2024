package di.subject;

import javax.inject.Inject;

public class Target {
    @Inject
    @Favourites
    Subject subject;
}