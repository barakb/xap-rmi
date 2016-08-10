package com.gigaspaces.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Barak Bar Orion
 * on 8/10/16.
 *
 * @since 12.0
 */
interface Server extends Remote{
    int rnd() throws RemoteException;
}
