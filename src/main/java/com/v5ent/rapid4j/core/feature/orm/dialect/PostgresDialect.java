package com.v5ent.rapid4j.core.feature.orm.dialect;

/**
 * Postgres 数据库 方言
 * 
 * @since 2014年7月2日 上午10:30:24
 **/
public class PostgresDialect extends Dialect {

    protected static final String SQL_END_DELIMITER = ";";

    @Override
    public String getLimitString(String sql, int offset, int limit) {
        return PostgresPageHepler.getLimitString(sql, offset, limit);
    }

    @Override
    public String getCountString(String sql) {
        return PostgresPageHepler.getCountString(sql);
    }
}
