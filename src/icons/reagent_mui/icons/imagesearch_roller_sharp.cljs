(ns reagent-mui.icons.imagesearch-roller-sharp
  "Imports @mui/icons-material/ImagesearchRollerSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def imagesearch-roller-sharp (create-svg-icon (e "path" #js {"d" "M20 2v6H6V6H4v4h10v5h2v8h-6v-8h2v-3H2V4h4V2h14z"})
                                               "ImagesearchRollerSharp"))
