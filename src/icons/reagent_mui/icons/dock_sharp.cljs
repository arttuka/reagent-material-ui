(ns reagent-mui.icons.dock-sharp
  "Imports @mui/icons-material/DockSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def dock-sharp (create-svg-icon (e "path" #js {"d" "M8 23h8v-2H8v2zM18 1.01 6 1v18h12V1.01zM16 15H8V5h8v10z"})
                                 "DockSharp"))
