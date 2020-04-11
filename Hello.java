package TekwillCourses;

public class Hello {
	public static void main(String args[]) {
		System.out.println("Hello World!");
		System.out.print("(. | .)\n");
		String s = "Yaaay";
		System.out.printf("%s\n", s);

		if (args.length > 0) {
			System.out.println("Received following args > " + args[0]);
		}

		for (int i = 1; i < args.length; i++) {
			System.out.println("Received following args > " + args[i]);
		}
	}
}