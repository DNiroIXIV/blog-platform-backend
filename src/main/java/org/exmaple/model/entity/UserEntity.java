package org.exmaple.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    private Long id;
    @Column(name = "user_name")
    private String userName;
    private String password;
}
