import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcConnection.MYSQL_JAVA6.getConnection();
        Statement createTable = connection.createStatement();
        JdbcRowSet set = new JdbcRowSetImpl(connection);
        set.setCommand("select * from kursanci;");
        Statemend dropTable = connection.createStatement();

        dropTable.execute("drop table kursanci;");
        boolean result =createTable.execute("create table kursanci(email varchar(25) primary key, nick varchar(15));");
        System.out.println(" Polecenie poprawnie wykonane? " + result);
        Statement insertRow= connection.createStatement();

        int count= insertRow.executeUpdate("insert into kursanci values('karol@op.pl.','karole')," +
                "('ewa@gmail.com', 'ewa'),('marek@sda.pl', 'marek');");
        System.out.println(count);

    }
}
