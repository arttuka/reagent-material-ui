(ns reagent-mui.icons.expand-circle-down-rounded
  "Imports @mui/icons-material/ExpandCircleDownRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def expand-circle-down-rounded (create-svg-icon (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm3.79 9.71-3.08 3.08c-.39.39-1.02.39-1.42 0l-3.08-3.08c-.39-.39-.39-1.03 0-1.42.39-.39 1.02-.39 1.41 0L12 12.67l2.38-2.38c.39-.39 1.02-.39 1.41 0 .39.39.39 1.03 0 1.42z"})
                                                 "ExpandCircleDownRounded"))
