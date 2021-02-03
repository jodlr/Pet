package com.tts;

public class Pet
{
    private String name;
    private String type;
    private int age;
    private String location;

    public Pet() {
    }

    public Pet(String name, int age,String location, String type )
    {
        this.name = name;
        this.age = age;
        this.location = location ;
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String animal)
    {
        this.type = type;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String name)
    {
        this.name = location;
    }
}
