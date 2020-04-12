package xyz.srclab.untitled.easy;

import xyz.srclab.common.bean.BeanHelper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EasyApplication {

    public static void main(String[] args) {
        A a = new A();
        a.getMap().put("111", Arrays.asList("222"));
        B b = new B();
        BeanHelper.copyProperties(a, b);
        System.out.println(b.getMap().get(111L).get(0));
        System.out.println(b.getMap().get(111L).get(0) == 222);
    }

    public static class A {
        private Map<String, List<String>> map = new HashMap<>();

        public Map<String, List<String>> getMap() {
            return map;
        }

        public void setMap(Map<String, List<String>> map) {
            this.map = map;
        }
    }

    public static class B {
        private Map<Long, List<Long>> map = new HashMap<>();

        public Map<Long, List<Long>> getMap() {
            return map;
        }

        public void setMap(Map<Long, List<Long>> map) {
            this.map = map;
        }
    }
}
