package com.group3.archtraining.ack.domain;

import com.group3.archtraining.ack.infra.InMemoryQackRepo;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class AckFacadeTest {

    AckFacade ackFacade = new AckFacade();
    QackRepo qackRepo = new InMemoryQackRepo();

    @Test
    void should_create_new_qack() {
        // given
        CreateQack command = new CreateQack();
        command.qDoc = new QDoc();

        // when
        Qack savedQack = ackFacade.handle(command);

        // then
        assertThat(qackRepo.load(savedQack.id)).isNotNull();
    }

    @Test
    void should_find_qack_details() {
        // given
        FindQackDetails query = new FindQackDetails();
        query.qackId = UUID.randomUUID();

        // when
        QackReadModel qackDetails = ackFacade.execute(query);

        // then
        assertThat(qackDetails.id).isEqualTo(query.qackId);
    }
}