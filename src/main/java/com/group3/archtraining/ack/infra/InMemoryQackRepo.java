package com.group3.archtraining.ack.infra;

import com.group3.archtraining.ack.domain.Qack;
import com.group3.archtraining.ack.domain.QackRepo;

import java.util.UUID;

public class InMemoryQackRepo implements QackRepo {
    @Override
    public Qack save(Qack qack) {
        // save or update in database

        return qack;
    }

    @Override
    public Qack load(UUID qackId) {
        return new Qack(qackId);
    }
}
