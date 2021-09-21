(ns reagent-mui.icons.tablet-sharp
  "Imports @mui/icons-material/TabletSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def tablet-sharp (create-svg-icon (e "path" #js {"d" "M23 4H1v16h21.99L23 4zm-4 14H5V6h14v12z"})
                                   "TabletSharp"))
