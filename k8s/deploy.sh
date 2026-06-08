#!/usr/bin/env bash
set -euo pipefail
kubectl apply -f k8s/namespace.yaml
kubectl apply -f k8s/configmap.yaml
kubectl apply -f k8s/secrets.yaml
kubectl apply -f k8s/storage/
kubectl apply -f k8s/infrastructure/
kubectl wait --for=condition=ready pod -l app=mysql -n lams-prod --timeout=120s || true
kubectl apply -f k8s/services/
kubectl apply -f k8s/ingress.yaml
echo "LAMS deployed. Run: kubectl get pods -n lams-prod"
