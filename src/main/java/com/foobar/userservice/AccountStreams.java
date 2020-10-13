package com.foobar.userservice;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface AccountStreams {
    String INPUT = "accounts-in";

    @Input(INPUT)
    SubscribableChannel inboundAccounts();
}
