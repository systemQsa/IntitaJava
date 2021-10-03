package ua.intita.qa.notebook;

public abstract class Notebook {
    private int papers;
    private char type;
    private char quality;

    abstract void draw();
    abstract void paint();

    public int getPapers() {
        return papers;
    }

    public void setPapers(int papers) {
        this.papers = papers;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public char getQuality() {
        return quality;
    }

    public void setQuality(char quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "papers=" + papers +
                ", type=" + type +
                ", quality=" + quality +
                '}';
    }
}
