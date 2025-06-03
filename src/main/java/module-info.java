module org.example.jxcel {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;

    opens org.example.jxcel to javafx.fxml;
    exports org.example.jxcel;
}