package com.generation.housing.model.entities;

public class Room 
{
    int s1, s2;

    public Room(int s1, int s2) 
    {
        this.s1 = s1;
        this.s2 = s2;
    }

    public int getArea()
    {
        return s1*s2;
    }
    
}
