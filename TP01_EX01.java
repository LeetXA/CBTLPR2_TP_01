
// ADS 471 - Fernanda Cristina Oliveira Pinheiro e Letícia Amaral Xavier
// Exercicío 01: Uma classe chamada Author é desenhada para servir de modelo para autores de livros, veja abaixo:

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

public class TP01_EX01 {
    public static void main(String[] args) {
        Author author = new Author(
                "Wellington Tuler",
                "tulermoraes@yahoo.com",
                'm'
        );

        System.out.println("=== TESTE DO CONSTRUTOR ===");
        System.out.println("Objeto criado: " + author);

        System.out.println("\n=== TESTE DO toString() ===");
        System.out.println(author.toString());

        System.out.println("\n=== TESTE DO SETTER ===");
        System.out.println("Email antes: " + author.getEmail());
        author.setEmail("novoemail@email.com");
        System.out.println("Email depois: " + author.getEmail());

        System.out.println("\n=== TESTE DOS GETTERS ===");
        System.out.println("Nome: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gênero: " + author.getGender());
    }
}
