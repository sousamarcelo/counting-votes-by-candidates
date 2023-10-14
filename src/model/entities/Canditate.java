package model.entities;

import java.util.Objects;

public class Canditate {
	private String name;
	private Integer votes;
	
	public Canditate(String name, Integer votes) {
		this.name = name;
		this.votes = votes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, votes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Canditate other = (Canditate) obj;
		return Objects.equals(name, other.name) && Objects.equals(votes, other.votes);
	}	
}
