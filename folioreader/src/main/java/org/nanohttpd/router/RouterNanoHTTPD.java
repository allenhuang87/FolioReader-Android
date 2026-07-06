package org.nanohttpd.router;

import fi.iki.elonen.router.RouterNanoHTTPD;

/**
 * Bridge class to resolve package name mismatch.
 * r2-streamer-kotlin (JitPack build) references org.nanohttpd.router.RouterNanoHTTPD,
 * but Maven Central's nanohttpd-nanolets uses fi.iki.elonen.router.RouterNanoHTTPD.
 * This class provides the expected package name by extending the actual implementation.
 */
public class RouterNanoHTTPD extends fi.iki.elonen.router.RouterNanoHTTPD {

    public RouterNanoHTTPD(int port) {
        super(port);
    }

    public RouterNanoHTTPD(String hostname, int port) {
        super(hostname, port);
    }
}
