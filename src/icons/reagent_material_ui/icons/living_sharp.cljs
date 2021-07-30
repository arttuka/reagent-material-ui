(ns reagent-material-ui.icons.living-sharp
  "Imports @material-ui/icons/LivingSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def living-sharp (create-svg-icon [(e "path" #js {"d" "M15.5 12v2.5h-7V12h-2v4.5h11V12z"}) (e "path" #js {"d" "M10 10v3h4v-3l2.25-.01V7.5h-8.5v2.49z"}) (e "path" #js {"d" "M22 2H2v20h20V2zm-3 7.99V18H5v-8l1.25-.01V6h11.5v3.99H19z"})]
                                   "LivingSharp"))
