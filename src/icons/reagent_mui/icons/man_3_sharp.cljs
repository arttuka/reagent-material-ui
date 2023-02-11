(ns reagent-mui.icons.man-3-sharp
  "Imports @mui/icons-material/Man3Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def man-3-sharp (create-svg-icon (e "path" #js {"d" "M16 7H8v8h2v7h4v-7h2zm-4.0001-5.2487L14.2485 4l-2.2486 2.2486L9.7513 4z"})
                                  "Man3Sharp"))
