public class Project {
    public static enum Difficulty{
        TRIVIAL,
        CHALLENGE,
        DIFFICULT,
        BEYOND
    }
    private String name;
    private String description;
    private int startDate;
    private int endDate;
    private boolean active;
    private Difficulty diff;

    public Project(String name, String description, int startDate, Difficulty diff){
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = 0;
        this.active = true;
        this.diff = diff;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getStartDate() {
        return startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public Difficulty getDiff() {
        return diff;
    }

    public void updateDescription(boolean append, String update){
        if(append){
            description = description + " " + update;
        }
        else
            description = update;

    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", active=" + active +
                ", diff=" + diff +
                '}';
    }
}
