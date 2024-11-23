package fr.polytech.service_evaluation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "evaluations")
public class Evaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long hoteId;
    private Long voyageurId;
    private Long reservationId;
    private Long emplacementId;
    private int note;
    private String commentaire;

    public Evaluation() {
    }

    public Evaluation(Long hoteId, Long voyageurId, Long reservationId, Long emplacementId, int note, String commentaire) {
        this.hoteId = hoteId;
        this.voyageurId = voyageurId;
        this.reservationId = reservationId;
        this.emplacementId = emplacementId;
        this.note = note;
        this.commentaire = commentaire;
    }


    public Long getId() {
        return id;
    }   

    public Long getHoteId() {
        return hoteId;
    }

    public void setHoteId(Long hoteId) {
        this.hoteId = hoteId;
    }

    public Long getVoyageurId() {
        return voyageurId;
    }

    public void setVoyageurId(Long voyageurId) {
        this.voyageurId = voyageurId;
    }   

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public Long getEmplacementId() {
        return emplacementId;
    }

    public void setEmplacementId(Long emplacementId) {
        this.emplacementId = emplacementId;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

}

    


