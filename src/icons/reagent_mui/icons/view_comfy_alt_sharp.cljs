(ns reagent-mui.icons.view-comfy-alt-sharp
  "Imports @mui/icons-material/ViewComfyAltSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-comfy-alt-sharp (create-svg-icon (e "path" #js {"d" "M2 4v16h20V4H2zm9 13H7v-4h4v4zm0-6H7V7h4v4zm6 6h-4v-4h4v4zm0-6h-4V7h4v4z"})
                                           "ViewComfyAltSharp"))
