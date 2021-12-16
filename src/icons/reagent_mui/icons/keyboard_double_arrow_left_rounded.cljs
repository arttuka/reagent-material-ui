(ns reagent-mui.icons.keyboard-double-arrow-left-rounded
  "Imports @mui/icons-material/KeyboardDoubleArrowLeftRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-double-arrow-left-rounded (create-svg-icon [(e "path" #js {"d" "M18.29 17.29c.39-.39.39-1.02 0-1.41L14.42 12l3.88-3.88c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0L12.3 11.3c-.39.39-.39 1.02 0 1.41l4.59 4.59c.38.38 1.01.38 1.4-.01z"}) (e "path" #js {"d" "M11.7 17.29c.39-.39.39-1.02 0-1.41L7.83 12l3.88-3.88c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0L5.71 11.3c-.39.39-.39 1.02 0 1.41l4.59 4.59c.38.38 1.01.38 1.4-.01z"})]
                                                         "KeyboardDoubleArrowLeftRounded"))
