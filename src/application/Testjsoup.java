package application;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Testjsoup {
    public static void main(String[] args) {
        try {
            String url = "https://archiveofourown.org/tags/Harry%20Potter%20-%20J*d*%20K*d*%20Rowling/works";
            Document doc = Jsoup.connect(url).get();
            String htmlContent = doc.html();
            System.out.println(htmlContent); // Affiche le titre de la page pour vérifier la connexion
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}