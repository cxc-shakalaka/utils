package mustry.common.utils.sql.mysql;

import mustry.common.utils.sql.BaseSqlBuilder;

public class DoSql implements BaseSqlBuilder {
	
	private String sql;
	
	public DoSql(String sql) {
		this.sql = sql;
	}
	
	@Override
	public String getSql() {
		return this.sql;
	}
}