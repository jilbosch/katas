package tasks;

public class saveTask (String title) {
    Task task = new Task();
     var repository = new MySqlRepository();
     this.repository.save(task)
}
