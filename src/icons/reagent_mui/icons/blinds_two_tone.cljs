(ns reagent-mui.icons.blinds-two-tone
  "Imports @mui/icons-material/BlindsTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def blinds-two-tone (create-svg-icon [(e "path" #js {"d" "M6 9h8v2H6zm0-4h8v2H6zm10 4h2v2h-2zm0-4h2v2h-2z", "opacity" ".3"}) (e "path" #js {"d" "M20 19V3H4v16H2v2h20v-2h-2zM6 5h8v2H6V5zm0 4h8v2H6V9zm12 10H6v-6h8v1.82c-.45.32-.75.84-.75 1.43 0 .97.78 1.75 1.75 1.75s1.75-.78 1.75-1.75c0-.59-.3-1.12-.75-1.43V13h2v6zm0-8h-2V9h2v2zm0-4h-2V5h2v2z"})]
                                      "BlindsTwoTone"))
