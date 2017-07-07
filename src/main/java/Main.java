import entities.Friend;
import logic.VkQueries;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String uid = reader.readLine();

        VkQueries vkQueries = new VkQueries();
        System.out.println(vkQueries.getAllFriendsByUid(uid));
    }
}
