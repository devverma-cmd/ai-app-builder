package com.devendraverma.ai_app_builder.entity;

import com.devendraverma.ai_app_builder.enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {
    Long id;

    User user;

    Plan plan;

    SubscriptionStatus status;

    String stripeCustomerId;
    String stripeSubriptionId;

    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Boolean cancelAtPeriodEnd;

    Instant createdAt;

    Instant updatedAt;

}
