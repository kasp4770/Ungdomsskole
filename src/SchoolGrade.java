public enum SchoolGrade { sixth("6th grade"), seventh("7th grade"), eighth("8th grade"), ninth("9th grade"), tenth("10th");

    private String grade;

    SchoolGrade(String grade){
        this.grade = grade;
    }

    public String gradeString(){
        return this.grade;
    }
}
