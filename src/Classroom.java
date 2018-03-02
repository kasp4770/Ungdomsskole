import java.util.ArrayList;

public class Classroom {

    private int capacity;
    private CourseType[] courseTypes;

    public Classroom(int capacity, CourseType[] courseTypes){
        this.capacity = capacity;
        this.courseTypes = courseTypes;
        new ArrayList<Person>();
    }

    public int getCapacity(){
        return capacity;
    }

    Classroom room1 = new Classroom(20, courseTypes = new CourseType[2]);
    Classroom room2 = new Classroom(10, courseTypes = new CourseType[2]);
    Classroom room3 = new Classroom(30, courseTypes = new CourseType[2]);

}


