(ns reagent-material-ui.icons.remember-me-sharp
  "Imports @material-ui/icons/RememberMeSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def remember-me-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 1H5v22h14V1zm-2 14.21c-1.5-.77-3.2-1.21-5-1.21s-3.5.44-5 1.21V6h10v9.21z"}) (e "circle" #js {"cy" "10", "r" "3", "cx" "12"}))
                                        "RememberMeSharp"))
