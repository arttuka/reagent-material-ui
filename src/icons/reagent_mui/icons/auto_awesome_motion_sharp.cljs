(ns reagent-mui.icons.auto-awesome-motion-sharp
  "Imports @mui/icons-material/AutoAwesomeMotionSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def auto-awesome-motion-sharp (create-svg-icon (e "path" #js {"d" "M14 2H2v12h2V4h10V2zm4 4H6v12h2V8h10V6zm4 4H10v12h12V10z"})
                                                "AutoAwesomeMotionSharp"))
