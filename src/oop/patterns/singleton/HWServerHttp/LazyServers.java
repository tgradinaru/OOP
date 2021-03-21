package oop.patterns.singleton.HWServerHttp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**Create a singleton Servers of lazy type. This singleton stores the list of servers (as String).
 Implement the following functionalities:
     adding a server to the list
    a method adding the server to the list should return boolean
            (true if the server has been added to the list, false if it's otherwise)
    adding is possible, if its name starts from http or https
    adding a duplicated name is impossible.
    downloading a list of servers, that names start from http.
    downloading a list of servers, that names start from https. */


public class LazyServers {

    private static LazyServers instance;

    //singleton Lazy type
    //Functioneaza in mediu neconcurential - nu functioneaza in multiThread

    public static LazyServers getInstance() {
        if (instance == null) {
            instance = new LazyServers();
        }
        return instance;
    }

    private final List<String> serverList;

    private LazyServers() {
        serverList = new ArrayList<>();
    }

    public boolean addServer(final String server) {
        if (((server.startsWith("http")) || server.startsWith("https")) && !serverList.contains(server)) {
            return serverList.add(server);
        }
        return false;
    }

    public List<String> getHttpServers() {
        return serverList.stream().
                filter(server -> server.startsWith("http"))
                .collect(Collectors.toList());
    }

    public List<String> getHttpsServers() {
        return serverList.stream()
                .filter(server -> server.startsWith("https"))
                .collect(Collectors.toList());
    }


}