(ns reagent-mui.icons.switch-left-sharp
  "Imports @mui/icons-material/SwitchLeftSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def switch-left-sharp (create-svg-icon (e "path" #js {"d" "M8.5 8.62v6.76L5.12 12 8.5 8.62M10 5l-7 7 7 7V5zm4 0v14l7-7-7-7z"})
                                        "SwitchLeftSharp"))
