package AirlineManagementSystem;

import java.sql.*;
import java.util.ArrayList;

public class Database {

    private final String url="jdbc:mysql://localhost/airline management system";
    private final String user ="user";
    private  final String pass ="lakshmivasan74";

    private Statement statement;

    public Database() throws SQLException
    {
      Connection connection= DriverManager.getConnection(url,user,pass);
      statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    }


//    public void AddPassenger(Passenger p) throws SQLException {
//        String insert="INSERT INTO `passengers`(`id`, `firstName`, `lastName`," +
//                " `Tel`, `email`) VALUES ('"+p.getId()+"','"+p.getFirstName()+"','"+p.getLastName()+"','"+p.getTel()+"','"+p.getEmail()+"')";
//        statement.execute(insert);
//    }
//
//    public Passenger getPassenger(int id) throws SQLException {
//        String get ="SELECT `id`, `firstName`, `lastName`, `Tel`, `email` FROM `passengers` WHERE `id` = "+id+";";
//        ResultSet rs =  statement.executeQuery(get);
//
//        Passenger p=new Passenger();
//        p.setId(Integer.parseInt(rs.getString("id")));
//        p.setFirstName(rs.getString("firstName"));
//        p.setLastName(rs.getString("lastName"));
//        p.setTel(rs.getString("Tel"));
//        p.setEmail(rs.getString("email"));
//        return p;
//    }
//
//    public ArrayList<Passenger> getAllPassengers() throws SQLException
//    {
//        String get ="SELECT * FROM `passengers`;";
//      ResultSet rs =  statement.executeQuery(get);
//      ArrayList<Passenger>passengers = new ArrayList<>();
//      while(rs.next())
//      {
//           Passenger p=new Passenger();
//           p.setId(Integer.parseInt(rs.getString("id")));
//           p.setFirstName(rs.getString("firstName"));
//           p.setLastName(rs.getString("lastName"));
//           p.setTel(rs.getString("Tel"));
//           p.setEmail(rs.getString("email"));
//           passengers.add(p);
//
//      }
//      return  passengers;
//    }
    public Statement getStatement() {
        return statement;
    }

}
