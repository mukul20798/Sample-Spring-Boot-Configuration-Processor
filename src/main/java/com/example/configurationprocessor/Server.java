package com.example.configurationprocessor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Server {

    /**
     * The IP of the database server
     */
    private String ip;

    /**
     * The Port of the database server.
     * The Default value is 443.
     * The allowed values are in the range 400-4000.
     */
    @Min(400)
    @Max(800)
    private int port = 443;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
