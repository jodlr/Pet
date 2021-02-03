package com.tts;

public class Main {

    public static void main(String[] args) {

        Pet pet = new Pet("Riley",1,"Austin","dog");
        System.out.println(pet.getName()+", Pet Age:"+pet.getAge()+",Location:"+pet.getLocation()+",Pet Type:"+pet.getType());
    }
}
