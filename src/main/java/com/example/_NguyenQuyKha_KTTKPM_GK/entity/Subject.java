package com.example._NguyenQuyKha_KTTKPM_GK.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter @Getter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Table(name = "Subject")
public class Subject  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String credit;
}
