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

    public void getByPriority(int priority) {
        queue.get(priority).poll();
    }

    @Override
    public void run() {
        while (true) {
            Person aux = null;
            if (!queue.get(0).isEmpty()) {
                queue.get(0).poll();
                continue;
            } else if (!queue.get(0).isEmpty()) {
                queue.get(0).poll();
                continue;
            } else if (!queue.get(0).isEmpty()) {
                queue.get(0).poll();
                continue;
            }
            System.out.println(aux);
        }
    }

}
