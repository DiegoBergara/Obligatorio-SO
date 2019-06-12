/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio.so;

/**
 *
 * @author USER
 */
public class Person {
    private int priority;
    private int ticketsAmount;
    private int sector;
    private String event;
    private String id;
    private String place;

    public Person(int priority, String id) {
        this.priority = priority;
        this.id = id;
    }

    
    @Override
    public String toString() {
        return "Person{" + "priority=" + priority + ", id=" + id + "}";
    }
    
    public int getPriority() {
        return priority;
    }

    public String getId() {
        return id;
    }

    public String getPlace() {
        return place;
    }

    public int getTicketsAmount() {
        return ticketsAmount;
    }

    public int getSector() {
        return sector;
    }

    public String getEvent() {
        return event;
    }
    
}
