/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.test;


public interface IStudent {

    void uczysie(Integer wiedza);
        
}
/**
 *
 * @author Mateusz
 */
public class StudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student s1 = new Student();
        
        System.out.println(s1);
        
        s1.uczysie(10);
        System.out.println(s1);
        
        Student s2 = s1.clone();
        
        System.out.println(s2);
        
        s1.uczysie(10);
        
        System.out.println(s2);
        System.out.println(s1);
        
             
        
    }
    
}




public class Student implements IStudent, Cloneable{
        private double w = 0; 
        
        public void uczysie(Integer wiedza){
            w+= wiedza;
        }
        
public Student clone() {
            Student cloned = new Student();
            cloned.w = this.w;
            return cloned;
    
}
    
public String toString() {
        return "Student [w=" + W + "]";
}    
}