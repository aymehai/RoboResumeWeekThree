import java.sql.*;
import java.util.Scanner;

public class NameAndEmail {

	private String name;
	private String email;
	private int id;

	public void setNameAndEmail() {
		try {
			Scanner keyboard = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resume?useSSL=false", "root", "password");
			PreparedStatement prepst;

			String query = ("INSERT INTO NameAndEmail (id, name, email) Values (?,?,?)");
			prepst = con.prepareStatement(query);
			prepst.setInt(1, id);
			System.out.println("Please enter your name.");
			name = keyboard.nextLine();
			prepst.setString(2, name);
			System.out.println("Please enter your email.");
			email = keyboard.nextLine();
			prepst.setString(3, email);
			
			prepst.executeUpdate();

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public void getNameAndEmail() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resume?useSSL=false", "root", "password");
			PreparedStatement prepst;

			String query = ("SELECT * FROM NameAndEmail");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
			con.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
