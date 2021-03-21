(ns reagent-material-ui.icons.medication-two-tone
  "Imports @material-ui/icons/MedicationTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def medication-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7 19h10V8H7v11zm1-7h2.5V9.5h3V12H16v3h-2.5v2.5h-3V15H8v-3z", "opacity" ".3"}) (e "path" #js {"d" "M6 3h12v2H6zm11 3H7c-1.1 0-2 .9-2 2v11c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm0 13H7V8h10v11z"}) (e "path" #js {"d" "M10.5 17.5h3V15H16v-3h-2.5V9.5h-3V12H8v3h2.5z"}))
                                          "MedicationTwoTone"))
