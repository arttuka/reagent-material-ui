(ns reagent-mui.icons.perm-media-sharp
  "Imports @mui/icons-material/PermMediaSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def perm-media-sharp (create-svg-icon (e "path" #js {"d" "M2 6H0v16h20v-2H2V6zm22-2H14l-2-2H4v16h20V4zM7 15l4.5-6 3.5 4.51 2.5-3.01L21 15H7z"})
                                       "PermMediaSharp"))
