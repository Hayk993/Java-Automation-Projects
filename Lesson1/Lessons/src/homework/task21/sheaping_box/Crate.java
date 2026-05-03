package homework.task21.sheaping_box;

public class Crate<T> {
    private T item;

    public void pack(T item) {
        this.item = item;
    }

    public T unpack() {
        T temp = item;
        item = null; // optional՝ արկղը դատարկելու համար
        return temp;
    }
}
