package com.Age_Calculator.Age_Calculator;

public class fbirthaygetclass {
    private String name, birthday, next_birthday, imageUrl, age_txt, key, c_id;

    public fbirthaygetclass() {}

    public fbirthaygetclass(String key, String name, String birthday, String next_birthday, String imageUrl, String age_txt, String c_id) {
        this.name = name;
        this.birthday = birthday;
        this.next_birthday = next_birthday;
        this.imageUrl = imageUrl;
        this.age_txt = age_txt;
        this.key = key;
        this.c_id = c_id;
    }

    public String getKey() { return key; }
    public void setKey(String key) { this.key = key; }
    public String getC_id() { return c_id; }
    public void setC_id(String c_id) { this.c_id = c_id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getBirthday() { return birthday; }
    public void setBirthday(String birthday) { this.birthday = birthday; }
    public String getNext_birthday() { return next_birthday; }
    public void setNext_birthday(String next_birthday) { this.next_birthday = next_birthday; }
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    public String getAge_txt() { return age_txt; }
    public void setAge_txt(String age_txt) { this.age_txt = age_txt; }
}