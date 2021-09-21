(ns reagent-mui.icons.house-two-tone
  "Imports @mui/icons-material/HouseTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def house-two-tone (create-svg-icon [(e "path" #js {"d" "M7 10.19V18h2v-6h6v6h2v-7.81l-5-4.5-5 4.5zm7-.19h-4c0-1.1.9-2 2-2s2 .9 2 2z", "opacity" ".3"}) (e "path" #js {"d" "M19 9.3V4h-3v2.6L12 3 2 12h3v8h6v-6h2v6h6v-8h3l-3-2.7zM17 18h-2v-6H9v6H7v-7.81l5-4.5 5 4.5V18z"}) (e "path" #js {"d" "M10 10h4c0-1.1-.9-2-2-2s-2 .9-2 2z"})]
                                     "HouseTwoTone"))
