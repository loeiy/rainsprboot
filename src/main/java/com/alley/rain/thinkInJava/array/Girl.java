package com.alley.rain.thinkinjava.array;

/**
 * Description:
 * User: dyf
 * Date: 2019-04-12
 * Time: 23:25
 */
public class Girl {
    private String name;
    private String age;
    private String cellPhone;

    private int agee = 10;

    public int getAgee() {
        return agee;
    }

    public void setAgee(int agee) {
        this.agee = agee;
    }

    public Girl() {
    }

    public Girl(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Girl(String name, String age, String cellPhone) {
        this.name = name;
        this.age = age;
        this.cellPhone = cellPhone;
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

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", agee=" + agee +
                '}';
    }
}
