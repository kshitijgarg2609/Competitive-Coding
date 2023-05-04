import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;

class Student {
    
    private int id;
    private String name;
    private double cgpa;
    
    public Student(int id, String name, double cgpa) {
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
    
    public int getID() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {
    List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.comparingDouble(Student::getCGPA).reversed().thenComparing(Student::getName).thenComparingInt(Student::getID));
        List<Student> list = new ArrayList<>();
        for(String str : events) {
            String query[] = str.split(" ");
            switch(query[0]) {
                case "ENTER": {
                    pq.add(new Student(Integer.parseInt(query[3]), query[1], Double.parseDouble(query[2])));
                    break;
                }
                case "SERVED": {
                    pq.poll();
                    break;
                }
            }
        }
        while(!pq.isEmpty()) {
            list.add(pq.poll());
        }
        return list;
    }
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
