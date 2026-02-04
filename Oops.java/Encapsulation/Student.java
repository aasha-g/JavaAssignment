
package encapsulation;

	public class Student {
	   
	    private String name; // Private variables (cannot be accessed directly from outside)
	    	    
	    public String getName() {     // returns the value of the variable name
	        return name;
	    }
	   
	    public void setName(String name) {     //  takes a name and assigns it to the name variable
	        this.name = name;
	    }

}
