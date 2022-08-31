import java.util.LinkedList;

public class Bucket {
    private final LinkedList<Fruits> fruits = new LinkedList<>();

    // Добавление фруктов должно происходить всегда в конец
    //Добавить логику, при которой корзина может хранить до 8 объектов включительно.
    public void putFruit(Fruits fruits) {
        if (this.fruits.size() < 8) {
            this.fruits.addLast(fruits);
        } else {
            System.out.println("No more place for fruits");
        }
    }

    // Удаление всегда из начала
    public void takeFruit() {
        this.fruits.removeFirst();
    }

    // Просмотр корзины
    public void showBucket() {
        System.out.println(this.fruits);
    }
}
