package com.geekster.Hotel_Management_System.Repo;

import com.geekster.Hotel_Management_System.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHotelRepo extends JpaRepository<Room,Integer> {
}
