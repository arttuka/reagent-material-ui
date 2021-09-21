(ns reagent-mui.icons.aod-sharp
  "Imports @mui/icons-material/AodSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def aod-sharp (create-svg-icon (e "path" #js {"d" "M19 1H5v22h14V1zm-2 17H7V6h10v12zm-9-8h8v1.5H8V10zm1 3h6v1.5H9V13z"})
                                "AodSharp"))
