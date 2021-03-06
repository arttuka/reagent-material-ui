(ns reagent-material-ui.icons.stacked-bar-chart
  "Imports @material-ui/icons/StackedBarChart as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def stacked-bar-chart (create-svg-icon (e "path" #js {"d" "M6 10h3v10H6zm0-5h3v4H6zm10 11h3v4h-3zm0-3h3v2h-3zm-5 0h3v7h-3zm0-4h3v3h-3z"})
                                        "StackedBarChart"))
