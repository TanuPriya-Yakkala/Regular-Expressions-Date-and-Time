import java.util.regex.Pattern;

// Main class
class PatternClass {

	// Main driver method
	public static void main(String args[])
	{
		System.out.println(Pattern.matches(
			"geeksforge*ks", "geeksforgeeks"));
		System.out.println(
			Pattern.matches("g*geeks*", "geeksfor"));
	}
}
