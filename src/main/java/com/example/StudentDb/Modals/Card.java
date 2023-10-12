package com.example.StudentDb.Modals;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "id_card")
@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "card_id")
    private String id;

    @Column(name = "card_status")
    private CardStatus cardStatus;

    @Column(name = "dues")
    private int dues;

    @OneToOne
    @JoinColumn
    private Student studentVariableName;

}
