package project.personal.java.template.kcrs.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

@Entity
@Data
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class UserBasic {
    @Id
    private int id;
    private String numberId;
    private String firstName;
    private String lastName;
    private Date   birtDate;
    private String information;

}
