(ns reagent-mui.icons.delete-sharp
  "Imports @mui/icons-material/DeleteSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def delete-sharp (create-svg-icon (e "path" #js {"d" "M6 21h12V7H6v14zM19 4h-3.5l-1-1h-5l-1 1H5v2h14V4z"})
                                   "DeleteSharp"))
