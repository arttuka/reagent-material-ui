(ns reagent-material-ui.icons.legend-toggle-two-tone
  "Imports @material-ui/icons/LegendToggleTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def legend-toggle-two-tone (create-svg-icon (e "path" #js {"d" "M20 15H4v-2h16v2zm0 2H4v2h16v-2zm-5-6 5-3.55V5l-5 3.55L10 5 4 8.66V11l5.92-3.61L15 11z"})
                                             "LegendToggleTwoTone"))
