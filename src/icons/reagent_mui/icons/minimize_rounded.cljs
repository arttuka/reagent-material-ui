(ns reagent-mui.icons.minimize-rounded
  "Imports @mui/icons-material/MinimizeRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def minimize-rounded (create-svg-icon (e "path" #js {"d" "M7 19h10c.55 0 1 .45 1 1s-.45 1-1 1H7c-.55 0-1-.45-1-1s.45-1 1-1z"})
                                       "MinimizeRounded"))
