(ns reagent-mui.icons.crop-169-sharp
  "Imports @mui/icons-material/Crop169Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def crop-169-sharp (create-svg-icon (e "path" #js {"d" "M21 7H3v10h18V7zm-2 8H5V9h14v6z"})
                                     "Crop169Sharp"))
