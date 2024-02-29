import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }
    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(7, counter);
    }
    @Test
    void testSelectUsersAndPosts() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();

        // When
        String sqlQuery = "SELECT USERS.ID, USERS.FIRSTNAME, USERS.LASTNAME " +
                "FROM USERS " +
                "JOIN POSTS ON USERS.ID = POSTS.USER_ID " +
                "GROUP BY USERS.ID, USERS.FIRSTNAME, USERS.LASTNAME " +
                "HAVING COUNT(POSTS.ID) >= 2;";

        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        // Then
        int usersWithTwoOrMorePosts = 0;
        while (resultSet.next()) {
            System.out.println(resultSet.getString("FIRSTNAME"));
            usersWithTwoOrMorePosts++;
        }

        resultSet.close();
        statement.close();
        assertEquals(2, usersWithTwoOrMorePosts);
    }


}