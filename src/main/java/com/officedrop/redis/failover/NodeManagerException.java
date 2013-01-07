package com.officedrop.redis.failover;

/**
 * User: Maurício Linhares
 * Date: 1/7/13
 * Time: 8:02 AM
 */
public class NodeManagerException extends IllegalStateException {

    public NodeManagerException( String message ) {
        super(message);
    }

    public NodeManagerException( String message, Throwable t ) {
        super(message, t);
    }

    public NodeManagerException(Throwable t ) {
        super(t);
    }

}
