import java.sql.*;
import java.util.Scanner;

public class Skills {

	private String skills_name = "";
	private int id;

	public void setSkills() {
		try {
			String userInput = "go";
			Scanner keyboard = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resume?useSSL=false", "root", "password");
			PreparedStatement prepst;

			String query = ("INSERT INTO Skills (skills_name) Values (?)");
			prepst = con.prepareStatement(query);
			prepst.setInt(1, id);
			int i = 0;
			System.out.println("Please enter your Skills. press q to quit");
			while (!userInput.equals("q")) {
				userInput = keyboard.nextLine();
				if (!userInput.equals("q") && i <= 19) {
					skills_name = skills_name + "\n" + userInput;
					i++;
				} else if (userInput.equals("q") || i > 19) {
					prepst.setString(1, skills_name);
					prepst.executeUpdate();
					userInput = "q";
				}
			}

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public void getSkills() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resume?useSSL=false", "root", "password");
			PreparedStatement prepst;
			String query = ("SELECT * FROM Skills");
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
