/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://7yue.pro
 * @免费专栏 $ http://course.7yue.pro
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2020/5/27 10:56
 */
package com.miaosha;

import java.util.ArrayList;
import java.util.List;

public class TestDemo1<T> {
    public static void main(String[] args) {
        // 获取String类型
        TestDemo1<String> TestDemo1 = new TestDemo1<>();  // 限制"T"为String类型
        List<String> array = new ArrayList<>();
        array.add("aaa");
        array.add("bbb");
        String str =  TestDemo1.getListFirst(array);
        System.out.println(str);

        // 获取Number类型
        TestDemo1<Integer> TestDemo11 = new TestDemo1<>();  // 限制"T"为Integer类型
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        Integer num = TestDemo11.getListFirst(nums);
        System.out.println(num);
    }

    private T getListFirst(List<T> data){
        if(data == null || data.size() == 0){
            return null;
        }
        return data.get(0);
    }



}
