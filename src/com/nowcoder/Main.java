package com.nowcoder;

import java.util.*;

/**
 *打印对象
 * @param
 * @param
 */
public class Main {

    public static void print(int index, Object obj){
        System.out.println(String.format("{%d}, %s", index, obj.toString()));
    }

    public static void demoOperation(){
        print(1, 5 / 2);
        print(2, 5 + 2);
        print(3, 5 * 2);
        print(4, 5 - 2);
        print(5, 5 << 2);
        print(6, 5 >> 2);
        print(7, 5 & 2);
        print(8, 5 | 2);
        print(9, 5 ^ 2);
        print(10, 5 == 2);
        print(11, 5 != 2);
    }

    public static void demoControlFlow(){
        int score = 65;
        if(score >= 80){
            print(1, "A");
        }else if(score >= 60){
            print(2, "B");
        }else{
            print(3, "C");
        }

        String grade = "B";
        switch (grade){
            case "A":
                print(4, "score >= 80");
                break;
            case "B":
                print(5, "(60, 80)");
                break;
            default:
                print(6, "(0, 60)");
        }

        for (int i = 0; i < 5; i++) {
            if(i == 2){
                continue;
            }
            print(7, i);
        }

        String str = "hello";
        for(char c : str.toCharArray()){
            print(8, c);
        }

        int target = 20;
        int current = 0;
        while(current < target){
            current += 5;
            print(9, current);
            if(current == 10){
                break;
            }
        }
    }

    public static void demoString(){
        String str = "hello nowcoder";
        print(1, str.indexOf('e'));
        print(2, str.compareTo("hello mowcoder")); //1>0  n在m后
        print(3, str.compareTo("hello powcoder")); //-2<0  n在p前
    }

    public static void demoList(){
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            strList.add(String.valueOf(i));
        }
        print(1, strList);

        List<String> strListB = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            strListB.add(String.valueOf(i*i));
        }
        strList.addAll(strListB);
        print(2, strList);
        strList.remove(2);
        print(3, strList);
        Collections.sort(strList);
        print(4, strList);
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(5, strList);
        Collections.reverse(strList);
        print(6, strList);
        strList.remove(1);
        print(7, strList);
        strList.remove(String.valueOf(9));
        print(8, strList);

    }

    public static void demoSet(){
        Set<String> strSet = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            strSet.add(String.valueOf(i));
        }
        print(1, strSet);
        strSet.addAll(Arrays.asList(new String[] {"A", "B", "C"}));
        print(2, strSet);
        for(String value : strSet){
            print(3, value);
        }
    }

    public static void demoKeyValue(){
        
    }

    public static void main(String[] args) {
	    // write your code here
        //System.out.println("Hello nowcoder!!");
        //print(1, "hello noncoder");
        //demoOperation();
        //demoControlFlow();
        //demoString();
        //demoList();
        demoSet();
    }
}
