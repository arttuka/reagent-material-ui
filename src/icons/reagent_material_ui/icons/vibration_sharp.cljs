(ns reagent-material-ui.icons.vibration-sharp
  "Imports @material-ui/icons/VibrationSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def vibration-sharp (create-svg-icon (e "path" #js {"d" "M0 15h2V9H0v6zm3 2h2V7H3v10zm19-8v6h2V9h-2zm-3 8h2V7h-2v10zM18 3H6v18h12V3zm-2 16H8V5h8v14z"})
                                      "VibrationSharp"))
