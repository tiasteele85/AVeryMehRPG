package co.grandcircus.aVeryMehRPG.entity;

import javax.persistence.*;

@Entity
public class SaveData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 300)
	private String name;
	@Column(length = 300)
	private String description;
	@Column(length = 300)
	private String enemy;
	@Column(length = 100)
	private int punchCount;
	@Column(length = 100)
	private int kickCount;

	public SaveData(Long id, String name, String description, String enemy, int punchCount, int kickCount) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.enemy = enemy;
		this.punchCount = punchCount;
		this.kickCount = kickCount;
	}

	public SaveData() {
		description = "";
	}

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
		this.description += description + " ";
	}

	public String getEnemy() {
		return enemy;
	}

	public void setEnemy(String enemy) {
		this.enemy = enemy;
	}

	public int getPunchCount() {
		return punchCount;
	}

	public void setPunchCount(int punchCount) {
		this.punchCount = punchCount;
	}

	public int getKickCount() {
		return kickCount;
	}

	public void setKickCount(int kickCount) {
		this.kickCount = kickCount;
	}

	public void addPunch() {
		punchCount++;
	}

	public void addKick() {
		kickCount++;
	}

	@Override
	public String toString() {
		return "SaveData [id=" + id + ", name=" + name + ", description=" + description + ", enemy="
				+ enemy + ", punchCount=" + punchCount + ", kickCount=" + kickCount + "]";
	}

}
