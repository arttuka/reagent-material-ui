(ns reagent-mui.icons.functions-two-tone
  "Imports @mui/icons-material/FunctionsTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def functions-two-tone (create-svg-icon (e "path" #js {"d" "M18 17h-7l5-5-5-5h7V4H6v2l6.5 6L6 18v2h12z"})
                                         "FunctionsTwoTone"))
