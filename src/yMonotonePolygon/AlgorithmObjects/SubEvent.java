package yMonotonePolygon.AlgorithmObjects;

/**
 * One subevent presents one line in the method of a event.
 */
public abstract class SubEvent {
	/**
	 * The line of the method for which this SubEvent is.
	 */
	int methodLine;
	
	public SubEvent(int methodLine) {
		super();
		this.methodLine = methodLine;
	}
	
	public int getLine() {
		return methodLine - 1;
	}
}
