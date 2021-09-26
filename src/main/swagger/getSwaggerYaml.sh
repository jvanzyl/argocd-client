#!/usr/bin/env bash

version=2.1.2
curl -L -o argocd-swagger-${version}.json https://raw.githubusercontent.com/argoproj/argo-cd/v${version}/assets/swagger.json
