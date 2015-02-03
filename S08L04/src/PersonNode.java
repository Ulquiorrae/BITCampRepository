
public class PersonNode {

	private Person person;
	private PersonNode next;
	
	
	public PersonNode(Person person){
		this.person = person;
		this.next = null;
		
	}


	public Person getP() {
		return person;
	}

	public void setP(Person p) {
		this.person = p;
	}

	public PersonNode getNext() {
		return next;
	}

	public void setNext(PersonNode next) {
		this.next = next;
	}
	
	
}
