# payment-service

Core service of the payment gateway responsible for payment processing and lifecycle management.

## Overview

`payment-service` owns the payment aggregate and its state machine. It orchestrates the full payment flow: initialization, confirmation, cancellation.

## Architecture

The service follows a layered internal structure (domain / application / infrastructure) and is designed to scale horizontally. It is part of the [payment-gateway](https://github.com/sergeevoa/payment-gateway) microservice application.

---

> ⚠️ **This microservice is currently under development. Interfaces and behavior may change.**