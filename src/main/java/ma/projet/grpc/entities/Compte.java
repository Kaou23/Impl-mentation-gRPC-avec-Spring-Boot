package ma.projet.grpc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data; // Lombok génère les getters/setters automatiquement

@Entity
@Data
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // Génération automatique d'ID en String
    private String id;
    private float solde;
    private String dateCreation;
    private String type;
}