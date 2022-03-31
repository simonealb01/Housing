package com.generation.housing.controller.main;

import com.generation.housing.model.entities.Room;

public class Main 
{
        public static void main(String[] args) 
        {
            Room r1 = new Room(5,6);
            int sqm = 800;

            System.out.println(r1.getArea()*sqm);
        }
}
