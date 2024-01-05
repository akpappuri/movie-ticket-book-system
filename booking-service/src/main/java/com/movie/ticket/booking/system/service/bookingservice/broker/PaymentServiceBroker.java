package com.movie.ticket.booking.system.service.bookingservice.broker;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name="payment-service")
public interface PaymentServiceBroker {

    @GetMapping
    public String payment();

}
