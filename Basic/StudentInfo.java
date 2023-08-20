
import java.util.*;

class Student{
	private String name;
	private int age;
	private int mark;
	Student(String name,int age,int mark){
		this.name=name;
		this.age=age;
		this.mark=mark;
		}
	public String getName() {
		return name;
		}
	public void setName(String name) {
		this.name=name;
		}
	public int getAge() {
		return age;
		}
	public void setAge(int age) {
		this.age=age;
		}
	public int getMark() {
		return mark;
		}
	public void setMark(int mark) {
		this.mark=mark;
		}
	/*@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student other = (Student) obj;

        return name.equals(other.name) &&
                age == other.age &&
                Integer.compare(other.mark, mark) == 0;
    }*/
	public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student other = (Student) obj;
            return this.name.equals(other.name) && this.age == other.age && this.mark == other.mark;
        }
        return false;
    }
	}
public class StudentInfo {
	static void print(LinkedList<Student> st) {
		for(Student student:st) {
			System.out.println("Name:"+student.getName()+", Age:"+student.getAge()+", Mark:"+student.getMark());
		}
	}
	public static void main(String[] args) {
		LinkedList<Student> st=new LinkedList<Student>();
		st.add(new Student("John",10,90));
		st.add(new Student("Alice", 19, 92));
		print(st);
		 
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        System.out.print("Enter student mark: ");
        int mark = scanner.nextInt();

        Student search = new Student(name, age, mark);
	        System.out.println("Students exists in the list? " + st.contains(search));
	        
        Student d = new Student("Alice", 19, 92);
        st.remove(d);
        System.out.println(st.size());
	}

}
