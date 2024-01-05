package com.movie.ticket.booking.system.service.bookingservice.controller;

import com.movie.ticket.booking.system.service.bookingservice.broker.PaymentServiceBroker;
import com.movie.ticket.booking.system.service.bookingservice.broker.PaypalServiceBroker;
import com.movie.ticket.booking.system.service.bookingservice.broker.SnackServiceBroker;
import jakarta.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingApi {

//    @Autowired
//    private SnackServiceBroker snackServiceBroker;

//    @Inject
//    SnackServiceBroker snackServiceBroker;
    @Autowired
    private PaymentServiceBroker paymentServiceBroker;

    @Autowired
    private SnackServiceBroker snackServiceBroker;

    @Autowired
    private PaypalServiceBroker paypalServiceBroker;

    @GetMapping("/test")
    public String test() {
        System.out.println("inside BookingApi  - payment endpoint");
       return this.paymentServiceBroker.payment();
    }

    @GetMapping("/testsnackpmt")
    public String test2() {
        System.out.println("inside BookingApi  - snack payment endpoint");
        return this.snackServiceBroker.testSnackApi();
    }
}
