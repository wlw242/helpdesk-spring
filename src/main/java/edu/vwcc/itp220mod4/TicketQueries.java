package edu.vwcc.itp220mod4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Exercise 2: answer questions about an in-memory ticket collection.
 */
public class TicketQueries {

    /**
     * Instructions:
     * Return a new List containing only OPEN tickets, preserving their original
     * order. Do not change the List supplied by the caller.
     */
    public static List<Ticket> openTickets(List<Ticket> tickets) {
        List<Ticket> open = new ArrayList<>();
        for (Ticket ticket : tickets) {
            if (ticket.status() == TicketStatus.OPEN) {
                open.add(ticket);
            }
        }
        return open;
    }

    /**
     * Instructions:
     * Return a Set containing each assigned technician name once. Ignore blank
     * technician names. Do not change the List supplied by the caller.
     */
    public static Set<String> technicianNames(List<Ticket> tickets) {
        Set<String> names = new HashSet<>();
        for (Ticket ticket : tickets) {
            String name = ticket.technician();
            if (name != null && !name.isBlank()) {
                names.add(name.trim());
            }
        }
        return names;
    }
}
