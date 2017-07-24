package pat.factory;

public class FirstFactory {
	protected String type;
	
	public FirstFactory(String t) {
		type = t;
	}
	
	public Connection createConnection() {
		if(type.equalsIgnoreCase("Oracle")) {
			return new OracleConnection();
		} else if(type.equalsIgnoreCase("SQL server")){
			return new SQLServerConnection();
		} else {
			return new MySQLConnection();
		}
	}
}