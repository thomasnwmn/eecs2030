public class student {
    public static void main(String[] args) {
        Course course = new Course();
        course.setCode(2030);
        course.setDesc("This is a course");
        System.out.println(course.getCode());
        System.out.println(course.getDesc());
    }
}
class Course {
    private int code;
    private String desc;
    public Course() {
        this.code = 0;
        this.desc = null;
    }
    public Course (int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    public int getCode () {
        return this.code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getDesc() {
        return this.desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
}