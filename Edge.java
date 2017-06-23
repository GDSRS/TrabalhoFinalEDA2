
public class Edge {
	
	private Node source;
	private Node target;
	private int weight;
	private String relation;
	private boolean isEdgePlotted;
	
	public Edge(Node source, Node target, String relation) {
		super();
		this.source = source;
		this.target = target;
		this.relation = relation;
		this.isEdgePlotted = false;
	}
	
	public boolean isEdgePlotted() {
		return isEdgePlotted;
	}

	public void setEdgePlotted(boolean isEdgePlotted) {
		this.isEdgePlotted = isEdgePlotted;
	}

	public Node getSource() {
		return source;
	}
	public void setSource(Node source) {
		this.source = source;
	}
	public Node getTarget() {
		return target;
	}
	public void setTarget(Node target) {
		this.target = target;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	

}
