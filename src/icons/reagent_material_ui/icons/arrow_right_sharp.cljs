(ns reagent-material-ui.icons.arrow-right-sharp
  "Imports @material-ui/icons/ArrowRightSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-right-sharp (create-svg-icon (e "path" #js {"d" "m10 17 5-5-5-5v10z"})
                                        "ArrowRightSharp"))
