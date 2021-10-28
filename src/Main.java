import java.io.*;

public class Main {


    public static void main(String[] args) {
        int row = 1;
        int col = 0;
        Person p1 = new Person("Alice", "Smith", 23);
        Person p2 = new Person("Bob", "Jones", 44);
        Person p3 = new Person("Carl", "Anderson", 19);
        Person p4 = new Person("Dina", "Huges", 25);
        Person[] persons = {p1, p2, p3, p4};
        SerializableObject so = new SerializableObject(row, col, persons);

        saveData(so);
        SerializableObject so2 = loadData();
        Person[] persons2 = so2.getPersons();
        System.out.println();

//        SerializableObject so2 = loadData();
//        int row2 = so2.getRow();
//        int col2 = so2.getCol();
//        String[] names2 = so2.getNames();
//        System.out.println();
    }

    private static void saveData(SerializableObject so) {
        try {
            FileOutputStream fileOut = new FileOutputStream("./save/data.bin");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(so);
            objectOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static SerializableObject loadData() {
        SerializableObject so = null;
        try {
            FileInputStream fileIn = new FileInputStream("./save/data.bin");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            so = (SerializableObject) objectIn.readObject();
            objectIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return so;
    }
}
