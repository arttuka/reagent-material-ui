(ns reagent-mui.icons.crop-169-sharp
  "Imports @mui/icons-material/Crop169Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def crop-169-sharp (create-svg-icon (e "path" #js {"d" "M21 6H3v12h18V6zm-2 10H5V8h14v8z"})
                                     "Crop169Sharp"))
