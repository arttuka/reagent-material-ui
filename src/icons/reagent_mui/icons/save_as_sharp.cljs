(ns reagent-mui.icons.save-as-sharp
  "Imports @mui/icons-material/SaveAsSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def save-as-sharp (create-svg-icon (e "path" #js {"d" "M21 12.4V7l-4-4H3v18h9.4l8.6-8.6zM15 15c0 1.66-1.34 3-3 3s-3-1.34-3-3 1.34-3 3-3 3 1.34 3 3zM6 6h9v4H6V6zm13.99 10.25 1.77 1.77L16.77 23H15v-1.77l4.99-4.98zm3.62-.09-1.2 1.2-1.77-1.77 1.2-1.2 1.77 1.77z"})
                                    "SaveAsSharp"))
