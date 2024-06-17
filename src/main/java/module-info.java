module com.main.UMMLibrary {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jbcrypt;

    opens com.main.UMMLibrary to javafx.fxml;
    exports com.main.UMMLibrary.seeder;
    opens com.main.UMMLibrary.seeder to javafx.fxml;
    exports com.main.UMMLibrary.pages.admin;
    opens com.main.UMMLibrary.pages.admin to javafx.fxml;
    exports com.main.UMMLibrary.pages.student;
    opens com.main.UMMLibrary.pages.student to javafx.fxml;
    exports com.main.UMMLibrary.pages.book;
    opens com.main.UMMLibrary.pages.book to javafx.fxml;
    exports com.main.UMMLibrary.pages.latefee;
    opens com.main.UMMLibrary.pages.latefee to javafx.fxml;
    exports com.main.UMMLibrary.pages.admin.student;
    exports com.main.UMMLibrary.dto.admin;
    exports com.main.UMMLibrary.dto.admin.student;
    exports com.main.UMMLibrary.dto.book;
    exports com.main.UMMLibrary.dto.latefee;
    exports com.main.UMMLibrary.dto.student;
    exports com.main.UMMLibrary.session;
    exports com.main.UMMLibrary.pages.admin.book;
    opens com.main.UMMLibrary.pages.admin.book to javafx.fxml;
}