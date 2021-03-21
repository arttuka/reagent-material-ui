(ns reagent-material-ui.icons.add-two-tone
  "Imports @material-ui/icons/AddTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def add-two-tone (create-svg-icon (e "path" #js {"d" "M19 13h-6v6h-2v-6H5v-2h6V5h2v6h6v2z"})
                                   "AddTwoTone"))
