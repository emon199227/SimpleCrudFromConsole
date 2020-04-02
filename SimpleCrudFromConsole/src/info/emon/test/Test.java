/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.emon.test;

import info.emon.connection.Dbconnection;
import info.emon.domain.Student;
import info.emon.service.StudentService;

/**
 *
 * @author Emon
 */
public class Test {

    public static void main(String[] args) {
        StudentService ss = new StudentService();
        //ss.save(new Student("Mr.N"));
       // ss.update(new Student(1, "Mr. Amin"));
      // ss.delate(2);
      /* 
      Student s = ss.getStudent(3);
      if(s!=null){
        System.out.println("ID : "+s.getId()+"    "+"Name : "+s.getName());  
      }
      else{
          System.out.println("::This id or name not exsited ::");
      }
      */
      for (Student s :ss.getstudents()){
          System.out.println("ID : "+s.getId()+"    "+"Name : "+s.getName()); 
      }
    }
}
