package Maxgen.JournalApp.controller.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class JournalEntity {

    @Id
    private String id;
    private String title;
    private String message;
    private Date date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "JournalEntity{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }
}
