#!/bin/bash

set -euo pipefail

main_version=$(head -n1 "./project.clj" | cut -d' ' -f3)
sub_version=$(head -n1 "./reagent-material-ui-js/project.clj" | cut -d' ' -f3)

if [[ "$main_version" == "$sub_version" ]]; then
  (cd reagent-material-ui-js; lein deploy;)
fi

lein deploy
