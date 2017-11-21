package Assistant;
import java.sql.*;
import java.util.StringTokenizer;

public class DatabaseHandler extends SameSoundingWordDetector{
    private static final String Driver = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String JDBC_URL = "jdbc:derby:Database;create=true";
    private final Connection connection;
    private final Statement statement;
    
    DatabaseHandler() throws SQLException, ClassNotFoundException {
        Class.forName(Driver);
        connection = DriverManager.getConnection(JDBC_URL);
        statement = connection.createStatement();
        System.out.println("Connected to Database.");
    }
    
    boolean InsertIntoCodeDictionary(String data) throws SQLException {
        //codeDictionary
        StringTokenizer stk = new StringTokenizer(data, " ");
        
        while(stk.hasMoreTokens()) {
            String temp = stk.nextToken();
            statement.execute("insert into codedictionary values ('"+temp.toUpperCase()+"', '"+generateSoundCode(temp.toUpperCase())+"')");
        }
        return true;
    }
    
    public boolean fasterDataInput(String Q, String A) throws SQLException {
        statement.execute("insert into modelbasedtable values ( '"+Q.toLowerCase()+"', '"+A.toLowerCase()+"')");
        
        InsertIntoCodeDictionary(Q.toUpperCase());
        return true;
    }
    
    String getCodeOfWord(String word) throws SQLException {
        ResultSet r = statement.executeQuery("select code from codeDictionary where ward ='"+word+"'");
        String code = "";
        while(r.next())
            code = r.getString(1);
        
        return code;
    }
    
    String getWordOfCode(String word) throws SQLException {
        ResultSet r = statement.executeQuery("select ward from codeDictionary where code ='"+word+"'");
        String code = "";
        while(r.next())
            code = r.getString(1);
        
        return code;
    }
    
    public void CloseConnection() throws SQLException {
        connection.close();
    }
    
    public boolean executeStatement(String sql) throws SQLException {
        if(sql.toUpperCase().contains("UPDATE"))
            statement.executeUpdate(sql);
        else
            statement.execute(sql);
        
        return true;
    }
    
    public String getResultOfQueryModelBasedTable(String sql) throws SQLException {
        String str = null;
        ResultSet r = statement.executeQuery("select answer from ModelBasedTable where question ='"+sql+"'");
        while(r.next())
            str = r.getString(1);
        
        return str;
    }
    
    public ResultSet getTemporaryData() throws SQLException {
        ResultSet resultset = statement.executeQuery("select * from tempdata");
        return resultset;
    }
    
    public void deleteFromTempDataSet(String data) throws SQLException {
        statement.executeUpdate("delete from tempdata where data ='"+data+"'");
    }
    
    public void insertDataOnTempDatSet(String data) throws SQLException {
        statement.execute("insert into tempdata values('"+data+"')");
    }
    
    public String getResultOfQueryLikeOperation(String sql) throws SQLException {
        StringTokenizer stk = new StringTokenizer(sql, " ");
        String[] string = new String[stk.countTokens()];
        int i = 0;
        while(stk.hasMoreTokens()) {
            string[i] = stk.nextToken();
            i++;
        } 
        
        String finalWord = "%";
    
        for(int k = 0; k < string.length; k++)
            finalWord += string[k]+"%";
        
        System.out.println(finalWord);
        
        String str = null;
        ResultSet r = statement.executeQuery("select question from modelbasedtable where question like '"+finalWord+"'");
        while(r.next())
            str = r.getString(1);
        
        return str;
    }
    
    ResultSet getAllTheResultSet(String sql) throws SQLException {
        ResultSet R = statement.executeQuery(sql);
        
        return R;
    }
    
}

//select questain from modelbasedtable where question likr '%what%name%'