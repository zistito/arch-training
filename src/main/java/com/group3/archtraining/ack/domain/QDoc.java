package com.group3.archtraining.ack.domain;

import java.util.UUID;

public class QDoc {

    UUID id;

    public Qack generateQack() {
        return new Qack(UUID.randomUUID());
    }
}
