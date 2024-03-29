package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Глубокое клонирование карты
*/

public class Solution implements Cloneable {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable {
        int age;
        String name;

        public User() {
        }

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected Object clone() {
            User user = new User();
            user.age = this.age;
            user.name = this.name;
            return user;
            // return new User(this.age, this.name);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            //if(!(obj instanceof User)) return false;
            User u = (User) obj;
            if (age != u.age) return false;
            return name == u.name;
        }

        @Override
        public int hashCode() {
            int result = name == null ? 0 : name.hashCode();
            result = 31 * result + age;
            return result;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Solution solution = new Solution();
        for (Map.Entry<String, User> para : this.users.entrySet()) {
            User user = (User) para.getValue().clone();
            solution.users.put(para.getKey(), user);
        }

        return solution;
    }
}
