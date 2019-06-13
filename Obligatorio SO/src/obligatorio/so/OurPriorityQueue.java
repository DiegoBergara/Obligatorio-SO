/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio.so;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author USER
 */
public class OurPriorityQueue implements Runnable {

    private ArrayList<Queue<Person>> queue;

    public OurPriorityQueue() {
        queue = new ArrayList<>();
        queue.add(new LinkedList<>());
        queue.add(new LinkedList<>());
        queue.add(new LinkedList<>());
    }

    public void addPerson(Person person) {
        queue.get(person.getPriority()).add(person);
    }

    public Person getByPriority(int priority) {
        return queue.get(priority).poll();
    }

    @Override
    public void run() {
        while (true) {
            Person aux = null;
            if (!queue.get(0).isEmpty()) {
                aux=this.getByPriority(0);
                System.out.println(aux);
                continue;
            } else if (!queue.get(1).isEmpty()) {
                aux=this.getByPriority(1);
                System.out.println(aux);
                continue;
            } else if (!queue.get(2).isEmpty()) {
                aux=this.getByPriority(2);
                System.out.println(aux);
                continue;
            }
            System.out.println(aux);
        }
    }

}
