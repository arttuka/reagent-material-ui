(ns reagent-mui.icons.castle-sharp
  "Imports @mui/icons-material/CastleSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def castle-sharp (create-svg-icon (e "path" #js {"d" "M21 9v2h-2V3h-2v2h-2V3h-2v2h-2V3H9v2H7V3H5v8H3V9H1v12h9v-5h4v5h9V9h-2zm-10 3H9V9h2v3zm4 0h-2V9h2v3z"})
                                   "CastleSharp"))
