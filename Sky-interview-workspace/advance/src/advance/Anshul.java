package advance;

public class Anshul {

	Integer id;
	Integer salary;
	String name;

	public Anshul(Integer id, Integer salary, String name) {

		this.id = id;
		this.salary = salary;
		this.name = name;

	}

	public boolean equals(Anshul obj) {
		if (getClass() != obj.getClass()) {

			return false;

		} else {

			return this.id.equals(obj.id) && this.salary.equals(obj.salary) && this.name.equals(obj.name);

		}
	}

	public int hashCode() {

		String key = id + salary + name;

		return key.hashCode();
	}

}
