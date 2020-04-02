/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.emon.dao;

import info.emon.domain.Student;
import java.util.List;

/**
 *
 * @author Emon
 */
public interface StudentDao {
    public void save(Student s);
    public void update(Student s);
    public void delate(int id);
    public Student getStudent(int id);
    public List<Student> getstudents();
    
    
    
}
