public enum SchoolGrade { sixth("6. Klasse"), seventh("7. Klasse"), eighth("8. Klasse"), ninth("9. Klasse"), tenth("10. Klasse");

    private String grade;

    SchoolGrade(String grade){
        this.grade = grade;
    }

    public String gradeString(){
        return this.grade;
    }
}
