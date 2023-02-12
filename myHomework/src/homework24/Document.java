package homework24;

public class Document {
    private final String name;
    private final int pageCount;

    public Document(String name, int pageCount) {
        this.name = name;
        this.pageCount = pageCount;
    }

    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pageCount;
    }
}