package com.gigaspaces.rmi;

import java.rmi.RemoteException;

/**
 * Created by Barak Bar Orion
 * on 8/10/16.
 *
 * @since 12.0
 */
@SuppressWarnings("ALL")
public class ServerImpl implements Server {
    public int rnd() throws RemoteException {
        return (int)Math.floor(Math.random() * Integer.MAX_VALUE);
    }
}
