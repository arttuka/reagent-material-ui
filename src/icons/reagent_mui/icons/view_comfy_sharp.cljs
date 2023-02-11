(ns reagent-mui.icons.view-comfy-sharp
  "Imports @mui/icons-material/ViewComfySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-comfy-sharp (create-svg-icon (e "path" #js {"d" "M2 4v7h20V4H2zm8 16h12v-7H10v7zm-8 0h6v-7H2v7z"})
                                       "ViewComfySharp"))
