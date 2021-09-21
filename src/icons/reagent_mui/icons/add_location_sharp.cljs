(ns reagent-mui.icons.add-location-sharp
  "Imports @mui/icons-material/AddLocationSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def add-location-sharp (create-svg-icon (e "path" #js {"d" "M13 6h-2v3H8v2h3v3h2v-3h3V9h-3V6zm-1-4c4.2 0 8 3.22 8 8.2 0 3.32-2.67 7.25-8 11.8-5.33-4.55-8-8.48-8-11.8C4 5.22 7.8 2 12 2z"})
                                         "AddLocationSharp"))
