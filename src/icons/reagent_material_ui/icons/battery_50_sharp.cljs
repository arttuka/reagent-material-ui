(ns reagent-material-ui.icons.battery-50-sharp
  "Imports @material-ui/icons/Battery50Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def battery-50-sharp (create-svg-icon (e "React.Fragment" nil (e "path" #js {"fillOpacity" ".3", "d" "M17 4h-3V2h-4v2H7v9h10V4z"}) (e "path" #js {"d" "M7 13v9h10v-9H7z"}))
                                       "Battery50Sharp"))
