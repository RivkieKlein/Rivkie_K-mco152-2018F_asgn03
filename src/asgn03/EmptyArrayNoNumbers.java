package asgn03;

public class EmptyArrayNoNumbers extends RuntimeException{
public EmptyArrayNoNumbers(String s) {
	super(s);
}

public EmptyArrayNoNumbers() {
	super("Empty array passed. Cannot perform function.");
}
}
