package com.amoscloud.newcoder.easy;

import java.util.*;


public class Test2 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int k = in.nextInt();
        HashMap<Character, Integer> map = new HashMap<>();

        char[] chars = line.toCharArray();
        if (chars.length == 0) {
            System.out.println(-1);
            return;
        }

        char cur = chars[0];
        int count = 1;
        map.put(cur, count);

        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];
            if (c == cur) count++;
            else {
                cur = c;
                count = 1;
            }
            map.put(cur, map.containsKey(cur) ?
                    map.get(cur) > count ? map.get(cur) : count :
                    count);
        }

        ArrayList<String> list = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            list.add(entry.getKey() + "-" + entry.getValue());
        }

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.split("-")[1].compareTo(o1.split("-")[1]);
            }
        });

        if (k > list.size()) {
            System.out.println(-1);
        } else {
            System.out.println(list.get(k - 1).split("-")[1]);
        }

        in.close();

    }
}