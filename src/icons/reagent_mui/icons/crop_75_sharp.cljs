(ns reagent-mui.icons.crop-75-sharp
  "Imports @mui/icons-material/Crop75Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def crop-75-sharp (create-svg-icon (e "path" #js {"d" "M21 5H3v14h18V5zm-2 12H5V7h14v10z"})
                                    "Crop75Sharp"))
