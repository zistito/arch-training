package com.group3.archtraining.ack.domain;

import java.util.UUID;

public interface QackRepo {
    Qack save(Qack qack);

    Qack load(UUID qackId);
}
