package Inheritance;

public class Student extends Person {

    private String dep;
    private int level;

    public void setDep(String dep) {
        this.dep = dep;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDep() {
        return dep;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Student Name :" + getName()// لا نستطيع الوصول للمتغيرات الخاصة الا من خلال الميثودالعامة
                + "\nStudent ID :" + getId()
                + "\nDepartment :" + dep
                + "\nlevel :" + level;
    }

}
