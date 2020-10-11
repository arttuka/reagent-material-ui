#!/bin/bash

set -euxo pipefail

lein cljfmt check
npm test
npm run build
lein deploy clojars
