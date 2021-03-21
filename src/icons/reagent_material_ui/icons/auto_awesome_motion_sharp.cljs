(ns reagent-material-ui.icons.auto-awesome-motion-sharp
  "Imports @material-ui/icons/AutoAwesomeMotionSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def auto-awesome-motion-sharp (create-svg-icon (e "path" #js {"d" "M14 2H2v12h2V4h10V2zm4 4H6v12h2V8h10V6zm4 4H10v12h12V10z"})
                                                "AutoAwesomeMotionSharp"))
