(ns reagent-material-ui.icons.e-mobiledata
  "Imports @material-ui/icons/EMobiledata as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def e-mobiledata (create-svg-icon (e "path" #js {"d" "M16 9V7H8v10h8v-2h-6v-2h6v-2h-6V9h6z"})
                                   "EMobiledata"))
