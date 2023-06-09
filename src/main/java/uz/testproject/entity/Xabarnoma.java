package uz.testproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import lombok.*;
import uz.testproject.entity.abstractEntity.AbstractEntity;

@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Xabarnoma extends AbstractEntity {

    @Column(unique = true, columnDefinition = "TEXT")
    private String body;

    @Column(unique = true, columnDefinition = "TEXT")
    private String answer;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

}
