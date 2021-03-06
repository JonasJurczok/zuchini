package org.zuchini.model;

import java.util.ArrayList;
import java.util.List;

public class Feature implements Named, Commented, Tagged, LocationAware{
    private final String uri;
    private final int lineNumber;
    private final String keyword;
    private final String name;
    private final List<String> comments = new ArrayList<>();
    private final List<String> tags = new ArrayList<>();
    private final List<Background> background = new ArrayList<>();
    private final List<StepContainer> scenarios = new ArrayList<>();

    public Feature(String uri, int lineNumber, String keyword, String name) {
        this.uri = uri;
        this.lineNumber = lineNumber;
        this.keyword = keyword;
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getName() {
        return name;
    }

    public List<String> getComments() {
        return comments;
    }

    public List<String> getTags() {
        return tags;
    }

    public List<Background> getBackground() {
        return background;
    }

    public List<StepContainer> getScenarios() {
        return scenarios;
    }

    @Override
    public String toString() {
        return "Feature@" + uri + ":" + lineNumber + "[" + name + "]";
    }
}
