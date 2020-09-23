(ns reagent-material-ui.icons.water-damage-sharp
  "Imports @material-ui/icons/WaterDamageSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def water-damage-sharp (create-svg-icon (e "path" #js {"d" "M12 3L2 12h3v8h14v-8h3L12 3zm0 13c-1.1 0-2-.9-2-2s2-4 2-4 2 2.9 2 4-.9 2-2 2z"})
                                         "WaterDamageSharp"))
