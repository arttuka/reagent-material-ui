(ns reagent-mui.icons.near-me-rounded
  "Imports @mui/icons-material/NearMeRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def near-me-rounded (create-svg-icon (e "path" #js {"d" "M18.75 3.94 4.07 10.08c-.83.35-.81 1.53.02 1.85L9.43 14c.26.1.47.31.57.57l2.06 5.33c.32.84 1.51.86 1.86.03l6.15-14.67c.33-.83-.5-1.66-1.32-1.32z"})
                                      "NearMeRounded"))
