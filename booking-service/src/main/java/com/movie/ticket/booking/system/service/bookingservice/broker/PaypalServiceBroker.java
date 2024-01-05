package com.movie.ticket.booking.system.service.bookingservice.broker;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="paypal-service")
public interface PaypalServiceBroker {

    @GetMapping
    public String testPayPalService();

}
