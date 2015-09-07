package Airline.service;

import Airline.domain.Passenger;
import Airline.domain.Ticket;

import java.util.List;

/**
 * Created by student on 2015/05/24.
 */
public interface TicketService {
    public List<Ticket> getPassengerTickets(Passenger passenger);

}
