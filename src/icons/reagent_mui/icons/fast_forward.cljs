(ns reagent-mui.icons.fast-forward
  "Imports @mui/icons-material/FastForward as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def fast-forward (create-svg-icon (e "path" #js {"d" "m4 18 8.5-6L4 6v12zm9-12v12l8.5-6L13 6z"})
                                   "FastForward"))
