/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio.so;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author USER
 */
public class ObligatorioSO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        OurPriorityQueue q = new OurPriorityQueue(); 
        
        File file = new File("./src/obligatorio/so/test.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String aux="";
        String st;
        while ((st = br.readLine()) != null) {
            aux += "-"+st;
        }
        
        String testFile = aux.replaceFirst("-", "");
        System.out.println(testFile);
        
        String[] lines = testFile.split("-");
        ArrayList<Person> people = new ArrayList<>();
        for(String line : lines){
            String[] props = line.split(",");
            people.add(new Person(Integer.parseInt(props[0]),props[1]));
        }
        
        people.forEach((p) -> {
            q.addPerson(p);
        });
        System.out.println("");
        q.run();
    }
}

