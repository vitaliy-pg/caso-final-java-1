import java.util.ArrayList;
import java.util.List;

class TaskPlanner {
    private List<String> crewMembers;
    private List<String> tasks;

    public TaskPlanner() {
        crewMembers = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    public void addCrewMember(String crewMember) {
        crewMembers.add(crewMember);
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void distributeTasks() {
        int numCrewMembers = crewMembers.size();
        int numTasks = tasks.size();

        System.out.println("Task Distribution:");

        for (int i = 0; i < numTasks; i++) {
            String crewMember = crewMembers.get(i % numCrewMembers);
            String task = tasks.get(i);
            System.out.println(crewMember + ": " + task);
        }
    }

    public int calculateWorkload() {
        int numCrewMembers = crewMembers.size();
        int numTasks = tasks.size();

        int workload = 0;

        for (int i = 0; i < numTasks; i++) {
            String task = tasks.get(i);
            workload += task.length();
        }

        return workload * numCrewMembers;
    }
}

class Main {
    public static void main(String[] args) {
        TaskPlanner taskPlanner = new TaskPlanner();

        taskPlanner.addCrewMember("John");
        taskPlanner.addCrewMember("Jane");
        taskPlanner.addCrewMember("Mike");

        taskPlanner.addTask("Task 1");
        taskPlanner.addTask("Task 2");
        taskPlanner.addTask("Task 3");
        taskPlanner.addTask("Task 4");
        taskPlanner.addTask("Task 5");

        taskPlanner.distributeTasks();

        int workload = taskPlanner.calculateWorkload();
        System.out.println("Total Workload: " + workload);
    }
}
