package com.sergeevoa.paymentgateway.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "payments")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "payment_id", updatable = false)
    private UUID paymentId;

    @Column(name = "terminal_id", nullable = false, length = 20)
    private String terminalId;

    @Column(name = "order_id", nullable = false, length = 36)
    private String orderId;

    @Column(name = "customer_id", length = 36)
    private String customerId;

    @Column(name = "amount", nullable = false)
    private Long amount;

    @Column(name = "status", nullable = false, length = 20)
    private String status;

    @Column(name = "description", length = 140)
    private String description;

    @Column(name = "is_recurrent", nullable = false)
    private boolean recurrent;

    @Column(name = "rebill_id")
    private UUID rebillId;

    @Column(name = "card_id")
    private UUID cardId;

    @Column(name = "language", nullable = false, length = 2)
    private String language;

    @Column(name = "payment_url")
    private String paymentUrl;

    @Column(name = "notification_url")
    private String notificationUrl;

    @Column(name = "success_url")
    private String successUrl;

    @Column(name = "fail_url")
    private String failUrl;

    @Column(name = "redirect_due_date")
    private OffsetDateTime redirectDueDate;

    @Column(name = "send_email")
    private Boolean sendEmail;

    @Column(name = "info_email", length = 255)
    private String infoEmail;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private OffsetDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;
}
