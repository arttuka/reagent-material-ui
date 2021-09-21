(ns reagent-mui.icons.auto-awesome-mosaic-sharp
  "Imports @mui/icons-material/AutoAwesomeMosaicSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def auto-awesome-mosaic-sharp (create-svg-icon (e "path" #js {"d" "M3 21h8V3H3v18zM21 3h-8v8h8V3zm-8 18h8v-8h-8v8z"})
                                                "AutoAwesomeMosaicSharp"))
