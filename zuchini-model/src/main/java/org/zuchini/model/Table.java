package org.zuchini.model;

import java.util.*;

class Table {
    private Table() {

    }

    static String[][] getData(List<Row> rows) {
        int size = rows.size();
        String[][] data = new String[size][];
        for (int i = 0; i < size; i++) {
            List<String> cells = rows.get(i).getCells();
            data[i] = cells.toArray(new String[cells.size()]);
        }
        return data;
    }

    static List<Map<String, String>> tableToMap(List<Row> table) {
        List<String> headerCells = table.get(0).getCells();
        return tableToMap(headerCells, table.subList(1, table.size()));
    }

    static List<Map<String, String>> tableToMap(List<String> headerCells, List<Row> rows) {
        List<Map<String, String>> result = new ArrayList<>(rows.size());
        for (Row row : rows) {
            result.add(rowToMap(headerCells, row));
        }
        return result;
    }

    static Map<String, String> rowToMap(List<String> headerCells, Row row) {
        List<String> cells = row.getCells();
        Map<String, String> map = new LinkedHashMap<>(cells.size());
        for (int i = 0; i <cells.size(); i++) {
            map.put(headerCells.get(i), cells.get(i));
        }
        return map;
    }
}
