(ns reagent-mui.icons.copy-all-sharp
  "Imports @mui/icons-material/CopyAllSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def copy-all-sharp (create-svg-icon (e "path" #js {"d" "M20 2H7v16h13V2zm-2 14H9V4h9v12zM3 15v-2h2v2H3zm0-5.5h2v2H3v-2zM10 20h2v2h-2v-2zm-7-1.5v-2h2v2H3zM5 22H3v-2h2v2zm3.5 0h-2v-2h2v2zm7 0h-2v-2h2v2zM3 6h2v2H3V6z"})
                                     "CopyAllSharp"))
