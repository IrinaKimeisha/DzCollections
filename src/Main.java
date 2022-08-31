public class Main {
    public static void main(String[] args) {
 /*Создать класс Bucket, который будет хранить в себе private коллекцию с фруктами.
 Реализовать методы putFruit(добавить фрукт), takeFruit(забрать фрукт), showBucket(посмотреть какие фрукты есть в корзине).
 Добавление фруктов должно происходить всегда в конец коллекции, а удаление всегда из начала.
 Создать классы апельсина, банана, яблоко. Показать работу объекта класса Bucket(добавление, удаление фруктов) в main методе.
 ВАЖНО: корзина может хранить в себе только объекты фруктов(апельсин, яблоко, банан), но не других классов.
 Это значит что методы bucket не должны принимать объекты других классов, кроме фруктов.
 Добавить логику, при которой корзина может хранить до 8 объектов включительно.
 При попытке положить больше, сообщить что в корзине нет места.*/

        Bucket bucket = new Bucket();
        bucket.putFruit(new Apple("Красное яблочко"));
        bucket.putFruit(new Orange("Кислый апельсинчик"));
        bucket.putFruit(new Apple("Зеленое яблочко"));
        bucket.putFruit(new Banana("Желтый банан"));
        bucket.putFruit(new Apple(":Желтое яблочко"));
        bucket.putFruit(new Orange("Сладкий апельсинчик"));
        bucket.putFruit(new Banana("Красный банан"));
        bucket.putFruit(new Orange("Незрелый апельсинчик"));
        bucket.showBucket();
        Fruits apple = new Apple("Отравленное яблочко");
        bucket.putFruit(apple);
        bucket.showBucket();
        bucket.takeFruit();
        bucket.showBucket();
    }
}
