(ns reagent-mui.icons.keyboard-double-arrow-right-rounded
  "Imports @mui/icons-material/KeyboardDoubleArrowRightRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-double-arrow-right-rounded (create-svg-icon [(e "path" #js {"d" "M5.7 6.71c-.39.39-.39 1.02 0 1.41L9.58 12 5.7 15.88c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l4.59-4.59c.39-.39.39-1.02 0-1.41L7.12 6.71c-.39-.39-1.03-.39-1.42 0z"}) (e "path" #js {"d" "M12.29 6.71c-.39.39-.39 1.02 0 1.41L16.17 12l-3.88 3.88c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l4.59-4.59c.39-.39.39-1.02 0-1.41L13.7 6.7c-.38-.38-1.02-.38-1.41.01z"})]
                                                          "KeyboardDoubleArrowRightRounded"))
