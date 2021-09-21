(ns reagent-mui.icons.beenhere
  "Imports @mui/icons-material/Beenhere as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def beenhere (create-svg-icon (e "path" #js {"d" "M19 1H5c-1.1 0-1.99.9-1.99 2L3 15.93c0 .69.35 1.3.88 1.66L12 23l8.11-5.41c.53-.36.88-.97.88-1.66L21 3c0-1.1-.9-2-2-2zm-9 15-5-5 1.41-1.41L10 13.17l7.59-7.59L19 7l-9 9z"})
                               "Beenhere"))
