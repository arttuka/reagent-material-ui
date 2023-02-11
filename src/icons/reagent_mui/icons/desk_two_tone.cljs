(ns reagent-mui.icons.desk-two-tone
  "Imports @mui/icons-material/DeskTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def desk-two-tone (create-svg-icon [(e "path" #js {"d" "M16 8h4v2h-4zm0 4h4v2h-4z", "opacity" ".3"}) (e "path" #js {"d" "M2 6v12h2V8h10v10h2v-2h4v2h2V6H2zm18 8h-4v-2h4v2zm0-4h-4V8h4v2z"})]
                                    "DeskTwoTone"))
