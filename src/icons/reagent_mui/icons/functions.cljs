(ns reagent-mui.icons.functions
  "Imports @mui/icons-material/Functions as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def functions (create-svg-icon (e "path" #js {"d" "M18 4H6v2l6.5 6L6 18v2h12v-3h-7l5-5-5-5h7z"})
                                "Functions"))
