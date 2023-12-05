package Ex_3.Entities;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SingleContect {

    private String name;
    private String number;


    public SingleContect(String name) {
        this.name = name;
        Random rnd= new Random();
        int num= rnd.nextInt(100000000,999999999);
        String string= Integer.toString(num);
        this.number = string;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "SingleContect{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    //methods

    public  void addContact(Map library){
        library.put(this.number,this.name);
    }



}
