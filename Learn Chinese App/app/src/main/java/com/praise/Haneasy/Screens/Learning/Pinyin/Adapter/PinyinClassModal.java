package com.praise.Haneasy.Screens.Learning.Pinyin.Adapter;

public class PinyinClassModal {
    int id;
    String name;
    String img_url;

    public PinyinClassModal(int id, String name, String img_url) {
        this.id = id;
        this.name = name;
        this.img_url = img_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
}
