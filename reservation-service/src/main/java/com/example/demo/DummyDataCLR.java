package com.example.demo;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.demo.entity.Reservation;
import com.example.demo.repository.controller.ReservationRepository;

//@Component
public class DummyDataCLR implements CommandLineRunner {

	@Autowired
	private ReservationRepository reservationRepository;

	@Override
	public void run(String... args) throws Exception {
		Stream.of("Ruchira", "Abby", "Dave").forEach(n -> this.reservationRepository.save(new Reservation(n)));
	}
}
