package tesString;

public class StringOperations {
	public static void main (String[] args) {
		String string1 = "Hello";
		String string2 = "Lisa";
		String string3 = "";
		//empty String or null
		string3 = "How are you ".concat(string2);
		System.out.println("String3: "+ string3);
		//get length
		System.out.println("Length: "+ string1.length());
		//get substring beginning with character 0, up to, but not
		//including character 5
		System.out.println("Sub: "+ string3.substring(0,5));
		//uppercase
		System.out.println("Upper: "+ string3.toUpperCase()+"\n");
		
		String string4 = "How are you "+ string2;
		System.out.println("String4 : "+ string4);
		System.out.println("String : "+ (string1 += string2));
		System.out.println("Index 'a' : "+ string2.indexOf('a'));
		System.out.println("Index 2 : "+ string2.charAt (2));
		
		System.out.println("\nCompare : "+ string1.compareTo(string2));
		System.out.println("Equals : "+ string1.equals(string2));
	}
}