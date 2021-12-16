(ns reagent-mui.icons.rectangle-rounded
  "Imports @mui/icons-material/RectangleRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def rectangle-rounded (create-svg-icon (e "path" #js {"d" "M2 6v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2z"})
                                        "RectangleRounded"))
