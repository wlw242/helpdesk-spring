package edu.vwcc.itp220mod4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Exercise 3: summarize tickets with a Map.
 */
public class TicketStats {

    /**
     * Instructions:
     * Return a Map whose keys are the category names in tickets and whose
     * values are the number of tickets in each category. An empty List produces
     * an empty Map. Do not change the List supplied by the caller.
     */
    public static Map<String, Integer> countByCategory(List<Ticket> tickets) {
        Map<String, Integer> counts = new HashMap<>();
        for (Ticket ticket : tickets) {
            String category = ticket.category();
            counts.put(category, counts.getOrDefault(category, 0) + 1);
        }
        return counts;
    }
}
