package com.maven;

import java.util.*;
import com.maven.dao.*;
import com.maven.model.*;
public class App 
{
    public static void main( String[] args )
    {
    	StudentDao studentDao = new StudentDao(); 

        // test saveStudent
      
    	
        Student stud =new Student("Manju","S","manju@gmail.com");
        Student student1 =new Student("Ajay","Z","ajay@gmail.com");
        Student student2 =new Student("Niki","A","niki@gmail.com");
        Student student3 =new Student("Snehal","B","snehal@gmail.com");
        Student student4 =new Student("Puja","C","puja@gmail.com");
        
        
        
        //passing value in parameterized constructor
        studentDao.saveStudent(stud);
        studentDao.saveStudent(student1); 
        studentDao.saveStudent(student2);
        
        studentDao.saveStudent(student3);
        studentDao.saveStudent(student4);
            
        // test updateStudent 
        stud.setFirstName("Nikita");
        studentDao.updateStudent(stud);
        stud.setFirstName("Payal");
        studentDao.updateStudent(student1);
        
        // test getStudentById
        //Student student2 = studentDao.getStudentById(student.getId());

        // test getAllStudents
        List < Student > students = studentDao.getAllStudents();
        students.forEach(student10 -> System.out.println(student10.getId()));
        // -> lambda expression left side of arrow:parameter ; right:value
        
        // test deleteStudent
        studentDao.deleteStudent(1);

    }
    }



