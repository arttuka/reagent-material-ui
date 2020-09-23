(ns reagent-material-ui.icons.check-box-outline-blank-sharp
  "Imports @material-ui/icons/CheckBoxOutlineBlankSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def check-box-outline-blank-sharp (create-svg-icon (e "path" #js {"d" "M19 5v14H5V5h14m2-2H3v18h18V3z"})
                                                    "CheckBoxOutlineBlankSharp"))
