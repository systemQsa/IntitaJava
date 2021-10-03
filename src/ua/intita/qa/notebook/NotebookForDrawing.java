package ua.intita.qa.notebook;

public class NotebookForDrawing extends Notebook implements Paper{
    @Override
    void draw() {
        System.out.println("drawing in notebook");
    }

    @Override
    void paint() {
        System.out.println("painting the picture");
    }

    @Override
    public void overturn() {
        System.out.println("turn next page");
    }

    @Override
    public void tear() {
        System.out.println("tear the notebook");
    }
}
