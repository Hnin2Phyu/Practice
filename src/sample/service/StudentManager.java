package sample.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import sample.dao.jdbc.DBUtility;
import sample.dao.jdbc.StudentDao;
import sample.dao.jdbc.StudentDaoImpl;
import sample.model.Student;

public class StudentManager {
	public ArrayList<Student> findall () throws SQLException {
		StudentDao sdao = new StudentDaoImpl();
		Connection conn = new DBUtility().getConnection();
		return (ArrayList<Student>)sdao.loadAll(conn);
		
	}
}
