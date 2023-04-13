package uz.testproject.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewsPayload {

    private Long id;
    private String title;
    @Column(unique = true, columnDefinition = "TEXT")
    private String body;

    private String date;
    private String img;

    public NewsPayload(String title, String body, String img, String date) {
        this.title = title;
        this.body = body;
        this.img = img;
        this.date = date;
    }

    public NewsPayload(String body) {
        this.body = body;
    }
}
