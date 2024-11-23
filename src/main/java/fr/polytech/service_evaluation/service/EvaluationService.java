package fr.polytech.service_evaluation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.polytech.service_evaluation.model.Evaluation;
import fr.polytech.service_evaluation.repository.EvaluationRepository;

@Service
public class EvaluationService {
    
    private final EvaluationRepository evaluationRepository;

    @Autowired
    public EvaluationService(EvaluationRepository evaluationRepository) {
        this.evaluationRepository = evaluationRepository;
    }

    public Evaluation createEvaluation(Evaluation evaluation) {
        return evaluationRepository.save(evaluation);
    }

    public Evaluation getEvaluation(Long id) {
        return evaluationRepository.findById(id).orElse(null);
    }

    public Evaluation updateEvaluation(Evaluation evaluation) {
        return evaluationRepository.save(evaluation);
    }

    public void deleteEvaluation(Long id) {
        evaluationRepository.deleteById(id);
    }

    public List<Evaluation> getAllEvaluations() {
        return evaluationRepository.findAll();
    }

    public Integer getAverageNoteByHoteId(Long hoteId) {
        return evaluationRepository.findByHoteId(hoteId).stream().mapToInt(Evaluation::getNote).sum() / evaluationRepository.findByHoteId(hoteId).size();
    }

    public Integer getAverageNoteByVoyageurId(Long voyageurId) {
        return evaluationRepository.findByVoyageurId(voyageurId).stream().mapToInt(Evaluation::getNote).sum() / evaluationRepository.findByVoyageurId(voyageurId).size();
    }

    public Integer getAverageNoteByReservationId(Long reservationId) {
        return evaluationRepository.findByReservationId(reservationId).stream().mapToInt(Evaluation::getNote).sum() / evaluationRepository.findByReservationId(reservationId).size();
    }

    public Integer getAverageNoteByEmplacementId(Long emplacementId) {
        return evaluationRepository.findByEmplacementId(emplacementId).stream().mapToInt(Evaluation::getNote).sum() / evaluationRepository.findByEmplacementId(emplacementId).size();
    }

}
