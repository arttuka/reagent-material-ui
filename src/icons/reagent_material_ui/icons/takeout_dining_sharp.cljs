(ns reagent-material-ui.icons.takeout-dining-sharp
  "Imports @material-ui/icons/TakeoutDiningSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def takeout-dining-sharp (create-svg-icon (e "path" #js {"d" "M22 7.46l-1.41-1.41L19 7.63l.03-.56L14.98 3H9.02L4.97 7.07l.03.5-1.59-1.56L2 7.44 4.66 10h14.69zM5.93 20h12.14l.63-8.45H5.3z"})
                                           "TakeoutDiningSharp"))
