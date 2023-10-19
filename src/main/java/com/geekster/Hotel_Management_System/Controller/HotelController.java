package com.geekster.Hotel_Management_System.Controller;

import com.geekster.Hotel_Management_System.Model.Room;

import com.geekster.Hotel_Management_System.Model.Type;
import com.geekster.Hotel_Management_System.Service.HotelService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
public class HotelController {

    @Autowired
    HotelService hotelService;

    @PostMapping("room")
    public String addRoom(@RequestBody Room room){
        return hotelService.addRoom(room);
    }
    @GetMapping("room/{id}/id")
    public Room getRoomById(@PathVariable Integer id){
        return hotelService.getRoomById(id);
    }
    @GetMapping("rooms")
    public List<Room> getAllRooms(){
        return hotelService.getAllRooms();
    }
    @PutMapping("update/{id}/status")
    public String updateRoomStatusById(@PathVariable Integer id,@RequestParam boolean status){
        return hotelService.updateRoomStatusById(id,status);
    }
    @DeleteMapping("delete/{id}/id")
    public String deleteRoomById(@PathVariable Integer id){
        return hotelService.deleteRoomById(id);
    }
    @PutMapping("update/{id}/info")
    public String updateRoomById(@PathVariable Integer id,@RequestParam Integer roomNumber,@RequestParam Type type,@RequestParam double price){
        return hotelService.updateRoomById(id,roomNumber,type,price);
    }
}
