(ns reagent-mui.icons.title
  "Imports @mui/icons-material/Title as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def title (create-svg-icon (e "path" #js {"d" "M5 4v3h5.5v12h3V7H19V4z"})
                            "Title"))
