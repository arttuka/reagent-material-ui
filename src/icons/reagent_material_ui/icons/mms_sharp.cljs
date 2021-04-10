(ns reagent-material-ui.icons.mms-sharp
  "Imports @material-ui/icons/MmsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def mms-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v20l4-4h16V2zM5 14l3.5-4.5 2.5 3.01L14.5 8l4.5 6H5z"})
                                "MmsSharp"))
