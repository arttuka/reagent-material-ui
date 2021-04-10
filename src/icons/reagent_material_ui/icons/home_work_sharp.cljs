(ns reagent-material-ui.icons.home-work-sharp
  "Imports @material-ui/icons/HomeWorkSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def home-work-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M8.17 5.7L1 10.48V21h5v-8h4v8h5V10.25z"}) (e "path" #js {"d" "M10 3v1.51l2 1.33L13.73 7H15v.85l2 1.34V11h2v2h-2v2h2v2h-2v4h6V3H10zm9 6h-2V7h2v2z"}))
                                      "HomeWorkSharp"))
