package stringAssignment;

public class InsertAndReplace {

	public static void main(String[] args) {
		String original = "I love Java";
        System.out.println("Original: " + original);  //I love Java

        
        String replaced = original.replace("Java", "Coding");  //Java--->Coding
        System.out.println("After Replace: " + replaced);     //I love Coding

        
        String target = "love";
        int index = original.indexOf(target); // index of love-2
        
        String inserted = original.substring(0, index) + "really " + original.substring(index);
        System.out.println("After Insert: " + inserted);
	}
          //substring(0,2)-->I +really+ ,substring(2)-->love java
}

