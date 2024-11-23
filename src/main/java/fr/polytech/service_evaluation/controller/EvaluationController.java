package fr.polytech.service_evaluation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.polytech.service_evaluation.model.Evaluation;
import fr.polytech.service_evaluation.service.EvaluationService;

@RestController
@RequestMapping("/")
public class EvaluationController {
    
    private static final Logger logger = LoggerFactory.getLogger(EvaluationController.class);

    private final EvaluationService evaluationService;

    @Autowired
    public EvaluationController(EvaluationService evaluationService) {
        this.evaluationService = evaluationService;
    }

    @GetMapping("/{id}")
    public Evaluation getEvaluation(@PathVariable Long id) {
        logger.info("Get evaluation with id {}", id);
        return evaluationService.getEvaluation(id);
    }

    @PutMapping
    public Evaluation updateEvaluation(@RequestBody Evaluation evaluation) {
        logger.info("Update evaluation with id {}", evaluation.getId());
        return evaluationService.updateEvaluation(evaluation);
    }

    @DeleteMapping("/{id}")
    public void deleteEvaluation(@PathVariable Long id) {
        logger.info("Delete evaluation with id {}", id);
        evaluationService.deleteEvaluation(id);
    }

    @GetMapping("/hote/{hoteId}/average-note")
    public Integer getAverageNoteByHoteId(@PathVariable Long hoteId) {
        logger.info("Get average note by hote id {}", hoteId);
        return evaluationService.getAverageNoteByHoteId(hoteId);
    }

    @GetMapping("/voyageur/{voyageurId}/average-note")
    public Integer getAverageNoteByVoyageurId(@PathVariable Long voyageurId) {
        logger.info("Get average note by voyageur id {}", voyageurId);
        return evaluationService.getAverageNoteByVoyageurId(voyageurId);
    }

    @GetMapping("/reservation/{reservationId}/average-note")
    public Integer getAverageNoteByReservationId(@PathVariable Long reservationId) {
        logger.info("Get average note by reservation id {}", reservationId);
        return evaluationService.getAverageNoteByReservationId(reservationId);
    }

    @GetMapping("/emplacement/{emplacementId}/average-note")
    public Integer getAverageNoteByEmplacementId(@PathVariable Long emplacementId) {
        logger.info("Get average note by emplacement id {}", emplacementId);
        return evaluationService.getAverageNoteByEmplacementId(emplacementId);
    }

}   




