import java.io.Serializable;

public class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;
    int row;
    int col;

    Person[] persons;

    public SerializableObject(int row, int col, Person[] persons) {
        this.row = row;
        this.col = col;
        this.persons = persons;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }
}
