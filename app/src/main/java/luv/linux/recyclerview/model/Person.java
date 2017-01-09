package luv.linux.recyclerview.model;

/**
 * Created by linuxluv on 1/5/17.
 *
 * class POJO untuk mewakili bject Person
 * memiliki atribut: nama, usia, id foto
 */

public class Person {
    private String name;
    private String age;
    private int photoId;

    public Person(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }
}
