package edu.vwcc.itp220mod4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Exercise 4: write category counts to a plain-text report.
 */
public class TicketReportWriter {

    /**
     * Instructions:
     * Write one line per category to outputPath using the exact format
     * "Category: count". Sort category names alphabetically before building the
     * lines. An empty Map writes an empty file. The output folder already exists;
     * this method only needs to create or replace the file.
     */
    public static void writeCategorySummary(
            Path outputPath,
            Map<String, Integer> categoryCounts) throws IOException {
        List<String> categories = new ArrayList<>(categoryCounts.keySet());
        Collections.sort(categories);

        List<String> lines = new ArrayList<>();
        for (String category : categories) {
            lines.add(category + ": " + categoryCounts.get(category));
        }

        // Files.write creates the file, or replaces it if it already exists
        Files.write(outputPath, lines);
    }
}
