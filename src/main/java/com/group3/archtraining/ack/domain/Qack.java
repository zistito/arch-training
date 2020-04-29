package com.group3.archtraining.ack.domain;


import java.util.UUID;

public class Qack {

    UUID id;
    boolean signed;
    boolean expire;

    public Qack(UUID id) {
        this.id = id;
    }

    public void expire() {
        if (!this.signed) {
            this.expire = true;
        }
    }

    public QackReadModel toReadModel() {
        QackReadModel convertedQack = new QackReadModel();
        convertedQack.id = this.id;
        convertedQack.signed = this.signed;

        return convertedQack;
    }
}
