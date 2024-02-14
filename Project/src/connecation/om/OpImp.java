package connecation.om;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pojo.empPoJo;

public class OpImp implements operation {

	@Override
	public void insertData(empPoJo emp) {
		PreparedStatement ps;
		try {
			ps=GetConnection.getConnection().prepareStatement("insert into jerry values(?,?)");
			ps.setInt(1,emp.getId() );
			ps.setString(2, emp.getUsername());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Display() {
		Statement s = null;
		try {
			s = GetConnection.getConnection().createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs = s.executeQuery("select * from jerry");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(rs.next()){
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
