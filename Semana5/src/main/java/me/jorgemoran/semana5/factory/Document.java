package me.jorgemoran.semana5.factory;

public class Document {
    private String title;
    private String header;
    private String content;

    // Métodos setter omitidos por brevedad
    public void setTitle(String title) { this.title = title; }
    public void setHeader(String header) { this.header = header; }
    public void setContent(String content) { this.content = content; }

    // Método para imprimir los detalles del documento
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Header: " + header);
        System.out.println("Content: " + content);
    }

    @Override
    public String toString() {
        return "Document{Title:" + title + "}";
    }

    public static abstract class DocumentBuilder {
        protected Document document;

        public DocumentBuilder() {
            document = new Document();
        }

        public DocumentBuilder setTitle(String title) {
            document.setTitle(title);
            return this;
        }

        public DocumentBuilder setHeader(String header) {
            document.setHeader(header);
            return this;
        }

        public DocumentBuilder setContent(String content) {
            document.setContent(content);
            return this;
        }

        public abstract Document build();
    }
}
