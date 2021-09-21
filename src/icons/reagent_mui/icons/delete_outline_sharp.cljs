(ns reagent-mui.icons.delete-outline-sharp
  "Imports @mui/icons-material/DeleteOutlineSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def delete-outline-sharp (create-svg-icon (e "path" #js {"d" "M6 21h12V7H6v14zM8 9h8v10H8V9zm7.5-5-1-1h-5l-1 1H5v2h14V4h-3.5z"})
                                           "DeleteOutlineSharp"))
