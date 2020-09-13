package com.hotelreservationdet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HotelReservationDetApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelReservationDetApplication.class, args);
	}
}
