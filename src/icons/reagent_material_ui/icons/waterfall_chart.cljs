(ns reagent-material-ui.icons.waterfall-chart
  "Imports @material-ui/icons/WaterfallChart as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def waterfall-chart (create-svg-icon (e "path" #js {"d" "M18 4h3v16h-3zM3 13h3v7H3zm11-9h3v3h-3zm-4 1h3v4h-3zm-3 5h3v4H7z"})
                                      "WaterfallChart"))
