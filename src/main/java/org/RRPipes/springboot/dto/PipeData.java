package org.RRPipes.springboot.dto;
public class PipeData {
    private int id,ppb;
    private String name,desc,category,pipeClass,size,image;

    public PipeData() {

    }

    public PipeData(int id, int ppb, String name, String desc, String category, String pipeClass, String size, String image) {
        this.id = id;
        this.ppb = ppb;
        this.name = name;
        this.desc = desc;
        this.category = category;
        this.pipeClass = pipeClass;
        this.size = size;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPpb() {
        return ppb;
    }

    public void setPpb(int ppb) {
        this.ppb = ppb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPipeClass() {
        return pipeClass;
    }

    public void setPipeClass(String pipeClass) {
        this.pipeClass = pipeClass;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
