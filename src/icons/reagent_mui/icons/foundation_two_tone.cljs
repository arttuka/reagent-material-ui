(ns reagent-mui.icons.foundation-two-tone
  "Imports @mui/icons-material/FoundationTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def foundation-two-tone (create-svg-icon [(e "path" #js {"d" "M7 15v-4.81l4-3.6V15H7zm6 0V6.59l4 3.6V15h-4z", "opacity" ".3"}) (e "path" #js {"d" "M19 12h3L12 3 2 12h3v3H3v2h2v3h2v-3h4v3h2v-3h4v3h2v-3h2v-2h-2v-3zM7 15v-4.81l4-3.6V15H7zm6 0V6.59l4 3.6V15h-4z"})]
                                          "FoundationTwoTone"))
