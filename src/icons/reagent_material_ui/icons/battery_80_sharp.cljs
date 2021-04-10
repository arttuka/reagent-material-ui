(ns reagent-material-ui.icons.battery-80-sharp
  "Imports @material-ui/icons/Battery80Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def battery-80-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 4h-3V2h-4v2H7v5h10V4z", "fillOpacity" ".3"}) (e "path" #js {"d" "M7 9v13h10V9H7z"}))
                                       "Battery80Sharp"))
