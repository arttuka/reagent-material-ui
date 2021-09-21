(ns reagent-mui.icons.water-damage-sharp
  "Imports @mui/icons-material/WaterDamageSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def water-damage-sharp (create-svg-icon (e "path" #js {"d" "M12 3 2 12h3v8h14v-8h3L12 3zm0 13c-1.1 0-2-.9-2-2s2-4 2-4 2 2.9 2 4-.9 2-2 2z"})
                                         "WaterDamageSharp"))
