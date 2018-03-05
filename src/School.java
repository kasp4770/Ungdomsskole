public enum School {
    lille_nastved("Lille Næstved skole"), ellebaeksskolen("Ellebæksskolen"), vor_frue("Vor Frue skole"),
    kobberbakkeskolen("Kobberbakkeskolen"), kalbyrisskolen("Kalbyrisskolen");
    private String school;

    School(String school){
        this.school = school;
    }

    public String schoolString(){
        return this.school;
    }
}
