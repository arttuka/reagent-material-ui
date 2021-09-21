(ns reagent-mui.icons.textsms-sharp
  "Imports @mui/icons-material/TextsmsSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def textsms-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2.01L2 22l4-4h16V2zM9 11H7V9h2v2zm4 0h-2V9h2v2zm4 0h-2V9h2v2z"})
                                    "TextsmsSharp"))
