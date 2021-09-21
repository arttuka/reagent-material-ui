(ns reagent-mui.icons.turned-in-not-sharp
  "Imports @mui/icons-material/TurnedInNotSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def turned-in-not-sharp (create-svg-icon (e "path" #js {"d" "M19 3H5.01L5 21l7-3 7 3V3zm-2 15-5-2.18L7 18V5h10v13z"})
                                          "TurnedInNotSharp"))
