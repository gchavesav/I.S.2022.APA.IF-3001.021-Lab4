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

//            SinglyLinkedList list = new SinglyLinkedList();
//            list.add(10);
//            list.add(20);
//            for (int i = 0; i < 10; i++) {
//                //list.add(new java.util.Random().nextInt(99));
//                list.add(util.Utility.random(99));
//            }
//            System.out.println(list.toString());
//            System.out.println("The first element in the list is: "
//                    +list.getFirst());
//            System.out.println("The last element in the list is: "
//                    +list.getLast());
//            System.out.println("The size of the list is: "+list.size());
//            
//            for (int i = 0; i < 10; i++) {
//                int value = util.Utility.random(99);
//                System.out.println(list.contains(value)
//                        ?"The value ["+value+"] exists in the list"
//                        :"The value ["+value+"] does not in the list"
//                );
//                if(list.contains(value)){
//                    list.remove(value);
//                    System.out.println("The value ["+value+"] was deleted");
//                }
//            }
//            System.out.println(list.toString());

            SinglyLinkedList list = new SinglyLinkedList();
            Student st1 = new Student("1", "Maria", 20, "Cartago");

            //agrego los objetos a la lista
            list.add(st1);
            list.add(new Student("2", "Carlos", 22, "San José"));
            list.add(new Student("3", "Laura", 20, "Paraíso"));
            list.add(new Student("4", "Paula", 18, "Turrialba"));
            list.add(new Student("5", "Carlos", 21, "Limón"));
            list.add(new Student("6", "Fabiana", 19, "Paraíso"));
            list.add(new Student("7", "María", 23, "Guanacaste"));
            list.add(new Student("8", "Carlos", 25, "San Carlos"));
            list.add(new Student("9", "Laura", 20, "Turrialba"));
            list.add(new Student("10", "Pedro", 24, "Heredia"));
            System.out.println(list.toString());
            
//¿Existe Paula, Id=4? true
//¿Existe Carlos, Id=5? true
//¿Existe Carlos, Id=8? true
        try {
            System.out.println("¿Existe Pedro, Id=20? "
                    +list.contains(new Student("20","",0, "")));
            System.out.println("¿Existe Paula, Id=4? "
                    +list.contains(new Student("4","",0, "")));
            
            list.sort(); //ordenamos la lista por nombre
            System.out.println("Ordenamos la lista con sort");
            System.out.println(list.toString());
            System.out.println("Cuántos Carlos tenemos en la lista? "
                    +countNames(list, "Carlos"));
             System.out.println("Cuántas Fabianas tenemos en la lista? "
                    +countNames(list, "Fabiana"));
                    
        }catch (ListException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(SinglyLinkedListNGTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private int countNames(SinglyLinkedList list, String name) throws ListException {
        int counter= 0; //contar
        for (int i = 1; i <= list.size(); i++) {
            Student st = (Student) list.getNode(i).data;
            if(st.getName().equals(name)) 
                counter++;
        }
        return counter;
    }
    
}
