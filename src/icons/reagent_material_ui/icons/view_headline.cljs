(ns reagent-material-ui.icons.view-headline
  "Imports @material-ui/icons/ViewHeadline as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-headline (create-svg-icon (e "path" #js {"d" "M4 15h16v-2H4v2zm0 4h16v-2H4v2zm0-8h16V9H4v2zm0-6v2h16V5H4z"})
                                    "ViewHeadline"))
