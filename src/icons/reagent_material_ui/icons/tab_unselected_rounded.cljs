(ns reagent-material-ui.icons.tab-unselected-rounded
  "Imports @material-ui/icons/TabUnselectedRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def tab-unselected-rounded (create-svg-icon (e "path" #js {"d" "M14 18h2v2h-2zM8 4h2v2H8zm12 0h-8v4c0 1.1.9 2 2 2h8V6c0-1.1-.9-2-2-2zm0 14h-2v2h2c1.1 0 2-.9 2-2v-2h-2v2zm-10 0h2v2h-2zm10-6h2v2h-2zM2 14h2v2H2zm0-4h2v2H2zm2 10v-2H2c0 1.1.9 2 2 2zM6 4H4c-1.1 0-2 .9-2 2v2h2V6h2V4zm0 14h2v2H6z"})
                                             "TabUnselectedRounded"))
