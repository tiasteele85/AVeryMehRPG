package co.grandcircus.aVeryMehRPG.entity;

import javax.persistence.*;

@Entity
@Table(name="SaveData")
public class SaveData {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 300)
	private String name;
	@Column(length = 300)
	private String description;
	@Column(length = 300)
	private String attackButton;
	@Column(length = 100)
	private int punchCount;
	
	public SaveData(Long id, String name, String description, String attackButton, int punchCount) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.attackButton = attackButton;
		this.punchCount = punchCount;
	}
	
	public SaveData() {}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description += " " + description;
	}
	public String getAttackButton() {
		return attackButton;
	}
	public void setAttackButton(String attackButton) {
		this.attackButton = attackButton;
	}
	public int getPunchCount() {
		return punchCount;
	}
	public void setPunchCount(int punchCount) {
		this.punchCount = punchCount;
	}
	
	
	
}
