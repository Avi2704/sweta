# Product Requirements Document (PRD)

## Goal
Centralized enterprise laptop lifecycle management with RBAC, auditability, SLA tracking, and production deployment.

## Personas
- Employee
- IT Technician
- IT Admin
- Super Admin

## Core Workflow
Login → Request → Approve/Reject → Assign → Use → Ticket (optional) → Return → Verify → Available.

## Non-Functional
- Availability: HA deploy, rolling updates
- Security: JWT RS256, RBAC, rate limits, lockout, sanitization
- Observability: metrics/logging/dashboards
