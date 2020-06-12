package org.gosky.executor;

import io.vertx.core.Future;
import io.vertx.mysqlclient.MySQLPool;
import io.vertx.sqlclient.Row;
import io.vertx.sqlclient.RowSet;
import io.vertx.sqlclient.Tuple;

import java.util.List;

/**
 * @Auther: guozhong
 * @Date: 2019-03-10 23:25
 * @Description:
 */
public class SimpleExecutor implements Executor {

    private final MySQLPool tConnectionPool;

    public SimpleExecutor(MySQLPool tConnectionPool) {
        this.tConnectionPool = tConnectionPool;
    }

    @Override
    public Future<RowSet<Row>> query(String sql, List<Object> values) {
        Future<RowSet<Row>> future = Future.future();
        if (values != null && values.size() > 0) {
            tConnectionPool.preparedQuery(sql).execute(Tuple.tuple(values), future);
        } else {
            tConnectionPool.query(sql).execute(future);
        }
        return future;
    }

}

