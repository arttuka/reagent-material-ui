(ns reagent-material-ui.icons.terrain-two-tone
  "Imports @material-ui/icons/TerrainTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def terrain-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 16h3.04l-1.52-2.03z", "opacity" ".3"}) (e "path" #js {"d" "M9.78 11.63l1.25 1.67L14 9.33 19 16h-8.46l-4.01-5.37L1 18h22L14 6l-4.22 5.63zM5 16l1.52-2.03L8.04 16H5z"}))
                                       "TerrainTwoTone"))
