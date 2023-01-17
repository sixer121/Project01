package com.example.miniproject03;

public class Visitor {
    int id;
    String name;
    String time_stamp;
    public Visitor(String name, String time_stamp) {
        this.name = name;
        this.time_stamp = Utility.get_ts();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTime_stamp() {
        return time_stamp;
    }
    public void setTime_stamp() {
        this.time_stamp = Utility.get_ts();
    }
}