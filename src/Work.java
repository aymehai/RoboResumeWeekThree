import java.sql.*;
import java.util.Scanner;

public class Work{

	private String work_name = "";
	private int id;

	public void setWork() {
		try {
			String userInput = "go";
			Scanner keyboard = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resume?useSSL=false", "root", "password");
			PreparedStatement prepst;

			String query = ("INSERT INTO Work (work_name) Values (?)");
			prepst = con.prepareStatement(query);
			prepst.setInt(1, id);
			int i = 0;
			System.out.println("Please enter your work. press q to quit");
			while (!userInput.equals("q")) {
				userInput = keyboard.nextLine();
				if (!userInput.equals("q") && i <= 10) {
					work_name = work_name + "\n" + userInput;
					i++;
				} 
				else if (userInput.equals("q") || i > 10){
					prepst.setString(1, work_name);
					prepst.executeUpdate();
					userInput = "q";
				}
			}

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public void getWork() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resume?useSSL=false", "root", "password");
			PreparedStatement prepst;
			String query = ("SELECT * FROM Work");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getString(2));
			}
			con.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
