import entities.Friend;
import logic.VkQueries;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        VkQueries queries = new VkQueries();
        String query = queries.generateRequestURL(69687163, "5.52", "friends.get");
        System.out.println(query);
    }
}
