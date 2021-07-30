(ns reagent-material-ui.icons.battery-20-sharp
  "Imports @material-ui/icons/Battery20Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def battery-20-sharp (create-svg-icon (e "React.Fragment" nil (e "path" #js {"d" "M7 17v5h10v-5H7z"}) (e "path" #js {"fillOpacity" ".3", "d" "M17 4h-3V2h-4v2H7v13h10V4z"}))
                                       "Battery20Sharp"))
