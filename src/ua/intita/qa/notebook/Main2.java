package ua.intita.qa.notebook;

public class Main2 {
    public static void main(String[] args) {
        NotebookForDrawing note = new NotebookForDrawing();
        note.setPapers(96);
        note.setQuality('A');
        note.setType('B');
        System.out.println(note);
        note.draw();
    }
}
