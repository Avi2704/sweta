# System Design

## Patterns
- Microservices with bounded contexts
- REST sync + RabbitMQ async events
- Immutable audit event sink
- Stateless services with externalized session/token state in Redis

## State Machine
`AVAILABLE -> REQUESTED -> APPROVED -> ASSIGNED -> IN_USE -> UNDER_MAINTENANCE -> RETURNED -> AVAILABLE`

Invalid transitions return HTTP 409.
