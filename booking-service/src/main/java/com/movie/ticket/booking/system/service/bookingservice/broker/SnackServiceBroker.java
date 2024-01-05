package com.movie.ticket.booking.system.service.bookingservice.broker;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="snack-service")
public interface SnackServiceBroker {

    @GetMapping
    public String testSnackApi();
}
