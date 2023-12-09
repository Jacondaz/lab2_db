import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public void addStudent(Student student, Connection conn) throws SQLException{
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO USERS (id, name, adress, age) VALUES (?, ?, ?, ?");
        stmt.setInt(1, student.getId());
        stmt.setString(2, student.getName());
        stmt.setString(3, student.getAdress());
        stmt.setInt(4, student.getAge());
        stmt.executeUpdate();
        System.out.println("Студент добавлен");
    }

    public void deleteStudent(int id, Connection conn) throws SQLException{
        PreparedStatement stmt = conn.prepareStatement("DELETE FROM USERS WHERE id = ?");
        stmt.setInt(1, id);
        stmt.executeUpdate();
        System.out.println("Студент удалён");
    }

    public Student infoStudent(int id, Connection conn) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM USERS WHERE id = ?");
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        if(rs.next()) {
            Student result = new Student(rs.getInt("id"), rs.getString("name"), rs.getString("adress"), rs.getInt("age"));
            return result;
        }
        return null;

    }

    public List<Student> infoStudents(int AgeMin, int AgeMax, Connection conn) throws SQLException{
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM USERS WHERE (AGE >= ? AND Age <= ?)");
        stmt.setInt(1, AgeMin);
        stmt.setInt(2, AgeMax);
        ResultSet rs = stmt.executeQuery();
        List<Student> ans = new ArrayList<>();
        while (rs.next()) {
            Student temp = new Student(rs.getInt("id"), rs.getString("name"), rs.getString("adress"), rs.getInt("age"));
            ans.add(temp);
        }
        return ans;
    }

    public List<Student> infoAllStudents(Connection conn) throws SQLException{
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM USERS");
        ResultSet rs = stmt.executeQuery();
        List<Student> ans = new ArrayList<>();
        while (rs.next()) {
            Student temp = new Student(rs.getInt("id"), rs.getString("name"), rs.getString("adress"), rs.getInt("age"));
            ans.add(temp);
        }
        return ans;
    }

}
