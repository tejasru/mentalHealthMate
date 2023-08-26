package com.demo.mhm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mhm.dto.BookSlotDTO;
import com.demo.mhm.service.SlotServiceI;


@RequestMapping("/FreeSlots")
@RestController
@CrossOrigin(origins="*")
public class FreeSlotController {
	
	@Autowired
	private SlotServiceI slotServiceI;

	@GetMapping("/show/{id}")
	public ResponseEntity<?> getAllslots(@PathVariable("id") int id)
	{
		return ResponseEntity.ok(slotServiceI.findAllslots(id));
	}
	
	
	@PostMapping("/addslot/{id}/{id2}")
	public ResponseEntity<?> addSlotId(@PathVariable("id") int id,@PathVariable("id2") int id2,HttpStatus status)
	{
		//Take 
		if(slotServiceI.addSlot(id,id2)) {
			return ResponseEntity.ok(status);	
		}
		return ResponseEntity.status(status).build();
	}

	@DeleteMapping("/{id}")
	public void deleteSlotById(@PathVariable("id") int SlotId)
	{
		slotServiceI.deleteSlotById(SlotId);
	}
}