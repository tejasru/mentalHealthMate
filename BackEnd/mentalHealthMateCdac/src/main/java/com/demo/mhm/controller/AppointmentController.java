package com.demo.mhm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mhm.dto.BookSlotDTO;
import com.demo.mhm.model.DoctorFreeslot;
import com.demo.mhm.service.AppointmentServiceI;

@RestController
@RequestMapping("/appointments")
@CrossOrigin("*")
public class AppointmentController {
	@Autowired
    private  AppointmentServiceI appointmentService;

    

    @GetMapping("/slots/{doctorId}")
    public ResponseEntity<List<DoctorFreeslot>> getAvailableSlots(@PathVariable int doctor_id) {
        List<DoctorFreeslot> availableSlots = appointmentService.getAvailableSlotsForDoctor(doctor_id);
        return ResponseEntity.ok(availableSlots);
    }

    @PostMapping("/book")
    public ResponseEntity<String> bookSlot(@RequestBody BookSlotDTO request) {
        boolean bookingSuccess = appointmentService.bookSlot(request.getDoctorId(), request.getSlot(), request.getUserId());
        if (bookingSuccess) {
            return ResponseEntity.ok("Slot booked successfully.");
        } else {
            return ResponseEntity.badRequest().body("Slot booking failed.");
        }
    }
}
