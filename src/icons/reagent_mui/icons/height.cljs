(ns reagent-mui.icons.height
  "Imports @mui/icons-material/Height as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def height (create-svg-icon (e "path" #js {"d" "M13 6.99h3L12 3 8 6.99h3v10.02H8L12 21l4-3.99h-3z"})
                             "Height"))
