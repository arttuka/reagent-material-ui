(ns reagent-mui.icons.vertical-align-top-two-tone
  "Imports @mui/icons-material/VerticalAlignTopTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def vertical-align-top-two-tone (create-svg-icon (e "path" #js {"d" "M4 3h16v2H4zm4 8h3v10h2V11h3l-4-4z"})
                                                  "VerticalAlignTopTwoTone"))
