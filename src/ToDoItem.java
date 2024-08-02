public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field
    public ToDoItem(String description){
        setDescription(description);
        isDone = false;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setisDone(boolean status){
        isDone = status;
    }

    public String getDescription(){
        return this.description;
    }

    public boolean isDone(){
        return this.isDone;
    }
}