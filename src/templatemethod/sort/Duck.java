package templatemethod.sort;

@SuppressWarnings("rawtypes")
public class Duck implements Comparable {

	String name;
	int weight;

	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String toString() {
		return name + " weighs " + weight;
	}

	@Override
	public int compareTo(Object arg0) {

		Duck otherDuck = (Duck) arg0;

		if (this.weight < otherDuck.weight)
			return -1;
		else if (this.weight == otherDuck.weight)
			return 0;
		else // this.weight > otherDuck.weight
			return 1;
	}

}
