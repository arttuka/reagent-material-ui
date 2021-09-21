(ns reagent-mui.icons.roofing-two-tone
  "Imports @mui/icons-material/RoofingTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def roofing-two-tone (create-svg-icon [(e "path" #js {"d" "M11 16h2v2h-2z", "opacity" ".3"}) (e "path" #js {"d" "M13 18h-2v-2h2v2zm2-4H9v6h6v-6zm4-4.7V4h-3v2.6L12 3 2 12h3l7-6.31L19 12h3l-3-2.7z"})]
                                       "RoofingTwoTone"))
