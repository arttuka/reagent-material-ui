(ns reagent-mui.icons.start-two-tone
  "Imports @mui/icons-material/StartTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def start-two-tone (create-svg-icon (e "path" #js {"d" "M14.59 7.41 18.17 11H6v2h12.17l-3.59 3.59L16 18l6-6-6-6-1.41 1.41zM2 6v12h2V6H2z"})
                                     "StartTwoTone"))
