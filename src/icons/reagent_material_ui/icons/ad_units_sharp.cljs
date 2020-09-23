(ns reagent-material-ui.icons.ad-units-sharp
  "Imports @material-ui/icons/AdUnitsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def ad-units-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 1H5v22h14V1zm-2 18H7V5h10v14z"}) (e "path" #js {"d" "M8 6h8v2H8z"}))
                                     "AdUnitsSharp"))
