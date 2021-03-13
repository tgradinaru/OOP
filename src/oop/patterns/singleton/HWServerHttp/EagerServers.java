package oop.patterns.singleton.HWServerHttp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EagerServers {

    private static EagerServers instance;

    //singleton Eager type
    //Functioneaza in mediu neconcurential - nu functioneaza in multiThread

    public static EagerServers getInstance() {
        if (instance == null) {
            synchronized (EagerServers.class) {
                if (instance == null) {
                    instance = new EagerServers();
                }
            }
        }
        return instance;
    }

    private final List<String> serverList;

    private EagerServers() {
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
