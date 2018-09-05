package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string
 *
 * @author Bradley Dover
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
    /**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	public Person2(String pname) {
        name = pname;
    }
    /**
     * This method should take the string
     * input and return its characters in
     * random order.
     * given "gtg123b" it should return
     * something like "g3tb1g2".
     *
     * @param input the string to be modified
     * @return the modified string
     */
	private String calc(String input) {
        //Person 2 put your implementation here
        String remaining = input;
        input = "";
        int index;
        while (remaining.length() != 0) {
            index = (int) (Math.random() * remaining.length());
            input += remaining.charAt(index);
            if (index != remaining.length() - 1) {
                remaining = remaining.substring(0, index) + remaining.substring(index + 1, remaining.length());
            } else {
                remaining = remaining.substring(0, index);
            }
        }
        return input;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
        return name + calc(input);
	}
}
