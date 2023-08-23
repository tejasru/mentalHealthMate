package com.demo.mhm.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mhm.dto.BookSlotDTO;
import com.demo.mhm.model.Doctor_Freeslot;
import com.demo.mhm.service.AppointmentServiceI;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private final AppointmentServiceI appointmentService;

    public AppointmentController(AppointmentServiceI appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping("/slots/{doctorId}")
    public ResponseEntity<List<Doctor_Freeslot>> getAvailableSlots(@PathVariable int doctor_id) {
        List<Doctor_Freeslot> availableSlots = appointmentService.getAvailableSlotsForDoctor(doctor_id);
        return ResponseEntity.ok(availableSlots);
    }

    @PostMapping("/book")
    public ResponseEntity<String> bookSlot(@RequestBody BookSlotDTO request) {
        boolean bookingSuccess = appointmentService.bookSlot(request.getDoctor_id(), request.getSlotId());
        if (bookingSuccess) {
            return ResponseEntity.ok("Slot booked successfully.");
        } else {
            return ResponseEntity.badRequest().body("Slot booking failed.");
        }
    }
}
