(ns reagent-mui.icons.pentagon
  "Imports @mui/icons-material/Pentagon as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def pentagon (create-svg-icon (e "path" #js {"d" "m2 9 4 12h12l4-12-10-7z"})
                               "Pentagon"))
