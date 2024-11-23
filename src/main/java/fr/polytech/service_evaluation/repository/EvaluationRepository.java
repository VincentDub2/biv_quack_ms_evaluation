package fr.polytech.service_evaluation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.polytech.service_evaluation.model.Evaluation;

@Repository
public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {

    List<Evaluation> findByHoteId(Long hoteId);
    List<Evaluation> findByVoyageurId(Long voyageurId);
    List<Evaluation> findByReservationId(Long reservationId);
    List<Evaluation> findByEmplacementId(Long emplacementId);
    List<Evaluation> findByNote(int note);
    List<Evaluation> findByCommentaire(String commentaire);
    
}
