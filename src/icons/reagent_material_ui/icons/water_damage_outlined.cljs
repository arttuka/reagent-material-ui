(ns reagent-material-ui.icons.water-damage-outlined
  "Imports @material-ui/icons/WaterDamageOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def water-damage-outlined (create-svg-icon (e "path" #js {"d" "M12 3L2 12h3v8h14v-8h3L12 3zM7 18v-7.81l5-4.5 5 4.5V18H7zm7-4c0 1.1-.9 2-2 2s-2-.9-2-2 2-4 2-4 2 2.9 2 4z"})
                                            "WaterDamageOutlined"))
