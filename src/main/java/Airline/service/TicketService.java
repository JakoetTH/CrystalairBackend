package Airline.service;

import Airline.domain.Ticket;

import java.util.List;

/**
 * Created by student on 2015/05/24.
 */
public interface TicketService {
    public List<Ticket> getPassengerTickets(String ID);

}
