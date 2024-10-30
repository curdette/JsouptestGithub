module Jsouptest {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jsoup; // assure-toi que Jsoup est bien ajouté au projet

    opens application to javafx.graphics, javafx.fxml; // ouvre le package pour JavaFX
}
