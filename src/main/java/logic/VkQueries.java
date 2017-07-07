package logic;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import entities.Friend;
import intf.VKApiMethods;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class VkQueries implements VKApiMethods {
    private BufferedReader reader;

    public String getAllFriendsByUid(String uid) throws Exception {
        String query = "https://api.vk.com/method/friends.get?user_id=" + uid + "&v=5.52&fields=first_name&fields=photo";
        URL url = new URL(query);
        reader = new BufferedReader(new InputStreamReader(url.openStream()));

        StringBuffer stringBuffer = new StringBuffer();
        int read;
        char[] characters = new char[1024];

        while ((read = reader.read(characters)) != -1) {
            stringBuffer.append(characters, 0, read);
        }

        return stringBuffer.toString();
    }
}
