package db.connection12;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.connection.GetConnection;
import db.connection.operation;

public class OpImp implements operation {
	public void insertData() {
		PreparedStatement ps;
		try {
			ps = GetConnection.getConnection().prepareStatement("insert into jerry values(?,?)");
			ps.setString(1, "ghhy");
			ps.setString(2, "ghhy");
			ps.executeUpdate("inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateData() {
	

	}

	@Override
	public void deleteData() {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayData() {
		Statement s;

		try {
			s = GetConnection.getConnection().createStatement();
			ResultSet rs = s.executeQuery("select * from jerry");
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}
			System.out.println("done");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// TODO Auto-generated method stub
	public static void main(String[] args) {
		OpImp op = new OpImp();
		op.insertData();
	//	op.deleteData();
		//op.updateData();
		//op.displayData();

	}
}
