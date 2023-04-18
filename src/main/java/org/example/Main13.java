package org.example;

import java.util.*;

public class Main13 {
    public static void main(String[] args) {
        Map<String, Post> map = new HashMap<>();
        Post post1 = new Post("title1");
        Post post2 = new Post("title2");
        Post post3 = new Post("title4");
        Post post4 = new Post("title3");
        Post post5 = new Post("title6");
        Post post6 = new Post("title5");

        map.put("post1", post1);
        map.put("post2", post2);
        map.put("post3", post3);
        map.put("post4", post5);
        map.put("post5", post4);

        map.remove("post4");
        map.remove(10);

        Post post = map.containsKey("post3erer")? map.get("post3erer"): new Post("Test");
        Post orDefault = map.getOrDefault("wasegdrh", new Post("Awesge"));
        System.out.println(post.name);

        Set<Map.Entry<String, Post>> entries = map.entrySet();


        TreeSet<Post> posts = new TreeSet<>();

        posts.add(post);

        TreeMap<String, Post> stringPostTreeMap = new TreeMap<String, Post>();


        for (Map.Entry<String, Post> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


        List<String> post11 = List.of("post1", "post3", "post5");

        for (String s: post11){
            System.out.println(map.get(s).name);
        }


    }

    private static class Post {
        String name;
        public Post(String name) {
            this.name = name;
        }
    }

    public static String test(){
        return "Test";
    }
}
