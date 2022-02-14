package com.kosa;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class JdbcConnection {
    public static void main(String[] args) throws SQLException {
        OracleDataSource ods = new OracleDataSource();
        Connection conn5 = DBConnection.getConnection();
    }
}