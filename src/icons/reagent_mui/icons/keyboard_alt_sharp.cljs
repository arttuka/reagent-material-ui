(ns reagent-mui.icons.keyboard-alt-sharp
  "Imports @mui/icons-material/KeyboardAltSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-alt-sharp (create-svg-icon (e "path" #js {"d" "M23 4H1v17h22V4zM7 12v2H5v-2h2zm-2-2V8h2v2H5zm6 2v2H9v-2h2zm-2-2V8h2v2H9zm7 6v1H8v-1h8zm-1-4v2h-2v-2h2zm-2-2V8h2v2h-2zm4 4v-2h2v2h-2zm2-4h-2V8h2v2z"})
                                         "KeyboardAltSharp"))
