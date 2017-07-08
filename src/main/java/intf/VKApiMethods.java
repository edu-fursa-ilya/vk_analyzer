package intf;

import entities.Friend;

import java.net.MalformedURLException;
import java.util.List;

public interface VKApiMethods {

    public String generateRequestURL(int uid, String version, String method);

}
