package com.v5ent.rapid4j.core.entity;

/**
 * UserException : 用户自定义异常
 *
 * @author Mignet
 * @since 2014-09-27 18:12
 */
public class UserException extends RuntimeException {

    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6338795859789028988L;
	/**
     * 异常发生时间
     */
    private long date = System.currentTimeMillis();

    public long getDate() {
        return date;
    }
}
