package Packaging;

public abstract class Box {
    private Object content;

    public Box(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return content;
    }
}
