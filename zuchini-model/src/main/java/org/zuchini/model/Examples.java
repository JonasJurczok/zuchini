package org.zuchini.model;

import java.util.ArrayList;
import java.util.List;

public class Examples implements Named, Tagged, Commented, LocationAware, RowContainer {
    private final Outline outline;
    private final int lineNumber;
    private final String keyword;
    private final String name;
    private final List<String> comments = new ArrayList<>();
    private final List<String> tags = new ArrayList<>();
    private final List<Row> rows = new ArrayList<>();

    public Examples(Outline outline, int lineNumber, String keyword, String name) {
        this.outline = outline;
        this.lineNumber = lineNumber;
        this.keyword = keyword;
        this.name = name;
    }

    @Override
    public String getUri() {
        return outline.getUri();
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

    public List<Row> getRows() {
        return rows;
    }
}
