

public class Mein {
public static void main(String[] args) {
	Prodessor P1 = new Prodessor();
	P1.name = "Nandkumar";
	P1.department = "CS";
	System.out.println("Professor name: " + P1.name + "yes" );
	System.out.println("Department name: " + P1.department + "EC");
	P1.introduce();
	P1.conductLecture();
}
}
