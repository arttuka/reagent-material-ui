(ns reagent-mui.icons.waterfall-chart
  "Imports @mui/icons-material/WaterfallChart as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def waterfall-chart (create-svg-icon (e "path" #js {"d" "M18 4h3v16h-3zM3 13h3v7H3zm11-9h3v3h-3zm-4 1h3v4h-3zm-3 5h3v4H7z"})
                                      "WaterfallChart"))
