#!/usr/bin/env bash

helm repo add argo https://argoproj.github.io/argo-helm
helm repo update
helm upgrade argocd argo/argo-cd --install --namespace argocd --version 3.21.0 --values values.yaml
