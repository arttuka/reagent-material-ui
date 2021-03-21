(ns reagent-material-ui.icons.bedroom-child-sharp
  "Imports @material-ui/icons/BedroomChildSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def bedroom-child-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M9 8.5h6v2H9zM7.51 12h9v2h-9z"}) (e "path" #js {"d" "M22 2H2v20h20V2zm-4 15h-1.5v-1.5h-9V17H6v-6.32l1.5-.01V7h9v3.67H18V17z"}))
                                          "BedroomChildSharp"))
