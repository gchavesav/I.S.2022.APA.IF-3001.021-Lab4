/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package domain;

import java.util.logging.Level;
import java.util.logging.Logger;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Profesor Gilberth Chaves A <gchavesav@ucr.ac.cr>
 */
public class SinglyLinkedListNGTest {
    
    public SinglyLinkedListNGTest() {
    }

    @Test
    public void test() {
        try {
            SinglyLinkedList list = new SinglyLinkedList();
            list.add(10);
            list.add(20);
            for (int i = 0; i < 10; i++) {
                //list.add(new java.util.Random().nextInt(99));
                list.add(util.Utility.random(99));
            }
            System.out.println(list.toString());
            System.out.println("The first element in the list is: "
                    +list.getFirst());
            System.out.println("The last element in the list is: "
                    +list.getLast());
            System.out.println("The size of the list is: "+list.size());
            
            for (int i = 0; i < 10; i++) {
                int value = util.Utility.random(99);
                System.out.println(list.contains(value)
                        ?"The value ["+value+"] exists in the list"
                        :"The value ["+value+"] does not in the list"
                );
                if(list.contains(value)){
                    list.remove(value);
                    System.out.println("The value ["+value+"] was deleted");
                }
            }
            System.out.println(list.toString());
            
        } catch (ListException ex) {
            System.out.println(ex.getMessage());
            //Logger.getLogger(SinglyLinkedListNGTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
