package cannot.touch;

import org.postgresql.jdbc3.Jdbc3PoolingDataSource;

import javax.sql.DataSource;
import java.util.UUID;

public class DataSourceFactory {

    public static DataSource create(int port) {
        Jdbc3PoolingDataSource source = new Jdbc3PoolingDataSource();

        source.setDataSourceName(UUID.randomUUID().toString());
        source.setServerName("localhost");
        source.setDatabaseName("postgres");
        source.setPortNumber(port);
        source.setUser("postgres");
        source.setPassword("mysecretpassword");
        source.setMaxConnections(10);

        return source;
    }
}

