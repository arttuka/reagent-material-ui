(ns reagent-material-ui.icons.medication-sharp
  "Imports @material-ui/icons/MedicationSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def medication-sharp (create-svg-icon (e "path" #js {"d" "M6 3h12v2H6zm13 3H5v15h14V6zm-3 9h-2.5v2.5h-3V15H8v-3h2.5V9.5h3V12H16v3z"})
                                       "MedicationSharp"))
