/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package domain;

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
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(10);
        System.out.println(list.toString());
    }
    
}
