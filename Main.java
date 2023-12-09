import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = StudentDb.getConnection();
//			Student student = new Student(15, "Иван", "Жмыхово", 21);
        StudentDao studentDao = new StudentDao();

//	    studentDao.addStudent(student, conn);

//	    studentDao.deleteStudent(15, conn);

//	    Student info = studentDao.infoStudent(1, conn);
//	    System.out.println("Информация о студенте: \n" + "Id: " + info.getId() + "\nName: " + info.getName() + "\nAdress: " + info.getAdress() + "\nAge: " + info.getAge());
//
//      List<Student> students = studentDao.infoStudents(10, 20, conn);
//      System.out.println("Информация о студентах");
//      for (Student student : students) {
//          System.out.println("Id: " + student.getId() + " Name: " + student.getName() + " Adress: " + student.getAdress() + " Age: " + student.getAge());
//      }

//      List<Student> allstudents = studentDao.infoAllStudents(conn);
//      System.out.println("Информация о студентах");
//      for (Student student : allstudents) {
//          System.out.println("Id: " + student.getId() + " Name: " + student.getName() + " Adress: " + student.getAdress() + " Age: " + student.getAge());
//      }
    }
}


