import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "stresses")
public class Stress {
	
	/*
	 * Criando os atributos
	 * 
	 * int id = identificador único.
	 * String creationDate = Data de controle para o banco de dados.
	 * String description = Descrição da situação causadora do estresse.
	 * String selfControl = Descrição do que fez para ter autocontrole.
	 * int level = Avalição do nível de estresse (1 a 5).
	 * 
	 * */
	
	@PrimaryKey(autoGenerate = true)
	@NonNull
	@ColumnInfo(name = "id")
	private int id;
	
	@Nullable
	@ColumnInfo(name = "creationDate")
	private String creationDate;
	
	@Nullable
	@ColumnInfo(name = "description")
	private String description;

	@Nullable
	@ColumnInfo(name = "selfControl")
	private String selfControl;
	
	@ColumnInfo(name = "level")
	private int level;

	/* Construtor da classe 'Stress' */
	
	public Stress(@Nullable String creationDate, @Nullable String description, @Nullable String selfControl, int level) {
		this.creationDate = creationDate;
		this.description = description;
		this.selfControl = selfControl;
		this.level = level;
	}
	
	/* Getters & Setters */

	public int getId() {
		return id;
	}

	public void setId(@NonNull int id) {
		this.id = id;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(@Nullable String creationDate) {
		this.creationDate = creationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(@Nullable String description) {
		this.description = description;
	}

	public String getSelfControl() {
		return selfControl;
	}

	public void setSelfControl(@Nullable String selfControl) {
		this.selfControl = selfControl;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
