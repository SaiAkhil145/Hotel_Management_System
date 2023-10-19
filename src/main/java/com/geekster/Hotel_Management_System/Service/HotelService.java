package com.geekster.Hotel_Management_System.Service;

import com.geekster.Hotel_Management_System.Model.Room;
import com.geekster.Hotel_Management_System.Model.Type;
import com.geekster.Hotel_Management_System.Repo.IHotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    @Autowired
    IHotelRepo hotelRepo;

    public String addRoom(Room room) {
        hotelRepo.save(room);
        return "room saved";
    }

    public Room getRoomById(Integer id) {
        return hotelRepo.findById(id).get();
    }

    public List<Room> getAllRooms() {
        return (List<Room>) hotelRepo.findAll();
    }

    public String updateRoomStatusById(Integer id, boolean status) {
        Room room = hotelRepo.findById(id).orElse(null);
        if(room!=null){
            room.setRoomAvailability(status);
            hotelRepo.save(room);
            return "room status updated";
        }
        return "invalid id";
    }

    public String deleteRoomById(Integer id) {
        hotelRepo.deleteById(id);
        return "room deleted";
    }


    public String updateRoomById(Integer id, Integer roomNumber, Type type, double price) {
        Room room = hotelRepo.findById(id).get();
        if(room!=null){
            room.setRoomNumber(roomNumber);
            room.setRoomType(type);
            room.setRoomPrice(price);
            hotelRepo.save(room);
            return "updated";
        }
        return "invalid id";
    }
}
