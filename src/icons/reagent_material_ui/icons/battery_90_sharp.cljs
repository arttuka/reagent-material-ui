(ns reagent-material-ui.icons.battery-90-sharp
  "Imports @material-ui/icons/Battery90Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def battery-90-sharp (create-svg-icon (e "React.Fragment" nil (e "path" #js {"fillOpacity" ".3", "d" "M17 4h-3V2h-4v2H7v4h10V4z"}) (e "path" #js {"d" "M7 8v14h10V8H7z"}))
                                       "Battery90Sharp"))
