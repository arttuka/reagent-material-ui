(ns reagent-mui.icons.bungalow-two-tone
  "Imports @mui/icons-material/BungalowTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def bungalow-two-tone (create-svg-icon [(e "path" #js {"d" "m12 6.78-3 4.8V19h2v-3h2v3h2v-7.42l-3-4.8zM13 14h-2v-2h2v2z", "opacity" ".3"}) (e "path" #js {"d" "M13 14h-2v-2h2v2zm5.1 2.56L17 14.79V21H7v-6.2l-1.1 1.76-1.7-1.06L12 3l7.8 12.5-1.7 1.06zM15 11.59l-3-4.8-3 4.8V19h2v-3h2v3h2v-7.41z"})]
                                        "BungalowTwoTone"))
