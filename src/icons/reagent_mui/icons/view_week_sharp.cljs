(ns reagent-mui.icons.view-week-sharp
  "Imports @mui/icons-material/ViewWeekSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-week-sharp (create-svg-icon (e "path" #js {"d" "M7.33 20H2V4h5.33v16zM22 20V4h-5.33v16H22zm-7.33 0V4H9.33v16h5.34z"})
                                      "ViewWeekSharp"))
