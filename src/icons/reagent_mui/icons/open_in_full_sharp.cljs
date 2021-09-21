(ns reagent-mui.icons.open-in-full-sharp
  "Imports @mui/icons-material/OpenInFullSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def open-in-full-sharp (create-svg-icon (e "path" #js {"d" "M21 11V3h-8l3.29 3.29-10 10L3 13v8h8l-3.29-3.29 10-10z"})
                                         "OpenInFullSharp"))
