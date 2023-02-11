(ns reagent-mui.icons.view-comfy
  "Imports @mui/icons-material/ViewComfy as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-comfy (create-svg-icon (e "path" #js {"d" "M2 4v7h20V4H2zm8 16h12v-7H10v7zm-8 0h6v-7H2v7z"})
                                 "ViewComfy"))
