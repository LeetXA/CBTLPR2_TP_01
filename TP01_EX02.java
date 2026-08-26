
// ADS 471 - Fernanda Cristina Oliveira Pinheiro e Letícia Amaral Xavier
// Exercicío 02: Um livro pode ser escrito por um ou muitos autores, por esta razão a classe Book deve ter um array de autores, 
// conforme o modelo abaixo:

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}

class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this(name, authors, price, 0);
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors.clone();
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors.clone();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("Book[name=")
              .append(name)
              .append(",authors={");

        for (int i = 0; i < authors.length; i++) {
            result.append(authors[i]);

            if (i < authors.length - 1) {
                result.append(",");
            }
        }

        result.append("},price=")
              .append(price)
              .append(",qty=")
              .append(qty)
              .append("]");

        return result.toString();
    }

    public String getAuthorNames() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < authors.length; i++) {
            result.append(authors[i].getName());

            if (i < authors.length - 1) {
                result.append(",");
            }
        }

        return result.toString();
    }
}

class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];

        authors[0] = new Author(
                "Autor 01",
                "autor01@somewhere.com.br",
                'm'
        );

        authors[1] = new Author(
                "Autor 02",
                "autor02@nowhere.com.br",
                'm'
        );

        System.out.println("=== TESTE DO CONSTRUTOR ===");

        Book testeBook = new Book(
                "Java for Dummy",
                authors,
                19.99,
                99
        );

        System.out.println(testeBook);

        System.out.println("\n=== TESTE DOS GETTERS ===");
        System.out.println("Nome: " + testeBook.getName());
        System.out.println("Preço: " + testeBook.getPrice());
        System.out.println("Quantidade: " + testeBook.getQty());
        System.out.println("Nomes dos autores: " + testeBook.getAuthorNames());

        System.out.println("\n=== TESTE DO getAuthors() ===");
        Author[] autoresObtidos = testeBook.getAuthors();
        for (Author autor : autoresObtidos) {
            System.out.println(autor);
        }

        System.out.println("\n=== TESTE DOS SETTERS ===");
        testeBook.setPrice(24.99);
        testeBook.setQty(120);

        System.out.println("Novo preço: " + testeBook.getPrice());
        System.out.println("Nova quantidade: " + testeBook.getQty());

        System.out.println("\n=== TESTE DO toString() ===");
        System.out.println(testeBook.toString());

        System.out.println("\n=== TESTE: AUTORES NÃO PODEM SER ADICIONADOS/REMOVIDOS ===");
        int quantidadeAntes = testeBook.getAuthors().length;

        // O array retornado é uma cópia, então esta alteração não muda o Book.
        autoresObtidos[0] = new Author(
                "Outro Autor",
                "outro@email.com",
                'm'
        );

        int quantidadeDepois = testeBook.getAuthors().length;

        System.out.println("Quantidade antes: " + quantidadeAntes);
        System.out.println("Quantidade depois: " + quantidadeDepois);
        System.out.println("Autores do livro: " + testeBook.getAuthorNames());
    }
}

public class TP01_EX02 {
    public static void main(String[] args) {
        TestBook.main(args);
    }
}
