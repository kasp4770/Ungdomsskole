public enum PersonType {
    STUDENT("Elev"), FACULTY("Lærer");

    private String role;

    PersonType(String role){
        this.role = role;
    }

    public String roleString(){
        return this.role;
    }
}
