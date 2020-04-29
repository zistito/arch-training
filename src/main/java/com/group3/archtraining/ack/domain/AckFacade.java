package com.group3.archtraining.ack.domain;

import com.group3.archtraining.ack.infra.InMemoryQackRepo;

public class AckFacade {

    QackRepo repo = new InMemoryQackRepo();

    public Qack handle(CreateQack command) {
        Qack generatedQack = command.qDoc.generateQack();

        return repo.save(generatedQack);
    }

    public void handle(ExpireQack command) {
        Qack expireCandidate = command.qack;
        expireCandidate.expire();

        repo.save(expireCandidate);
    }

    public void handle(DeactivateQack command) {

    }

    public void handle(SignQack command) {

    }

    public void handle(SignQackOnBehalf command) {

    }

    public QackReadModel execute(FindQackDetails query) {
        Qack detailsOwner = repo.load(query.qackId);

        return detailsOwner.toReadModel();
    }
}
