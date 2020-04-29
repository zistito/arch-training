package com.group3.archtraining.ack.infra;

import com.group3.archtraining.ack.domain.AckFacade;
import com.group3.archtraining.ack.domain.CreateQack;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AckController {

    AckFacade facade;

    @PostMapping("/doCreateQack")
    public String doCreate(@RequestBody CreateQack command) {
        facade.handle(command);
        return "";
    }
}
