# Deployment Guide

## Local
1. `cp .env.example .env`
2. `docker compose up -d --build`

## Kubernetes
1. `chmod +x k8s/deploy.sh`
2. `./k8s/deploy.sh`
3. `kubectl get pods -n lams-prod`
