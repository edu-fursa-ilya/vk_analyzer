package logic;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import entities.Friend;
import intf.VKApiMethods;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class VkQueries implements VKApiMethods {

    @Override
    public String generateRequestURL(int uid, String version, String method) {
        String request = "https://api.vk.com/method/" +
                method + "?user_id=" + uid + "&v=" +
                version +"&fields=first_name&fields=last_name&fields=city&fields=photo";
        return request;
    }
}
