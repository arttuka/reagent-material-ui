(ns reagent-mui.icons.energy-savings-leaf-sharp
  "Imports @mui/icons-material/EnergySavingsLeafSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def energy-savings-leaf-sharp (create-svg-icon (e "path" #js {"d" "M12 3c-4.8 0-9 3.86-9 9 0 2.12.74 4.07 1.97 5.61L3 19.59 4.41 21l1.97-1.97C7.93 20.26 9.88 21 12 21c2.3 0 4.61-.88 6.36-2.64C20.12 16.61 21 14.3 21 12V3h-9zm-1.5 14-.5-.5 2.5-3.5-5-.5 6-5.5.5.5-2.5 3.5 5 .5-6 5.5z"})
                                                "EnergySavingsLeafSharp"))
