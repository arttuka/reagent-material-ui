(ns reagent-mui.icons.arrow-left-rounded
  "Imports @mui/icons-material/ArrowLeftRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-left-rounded (create-svg-icon (e "path" #js {"d" "M12.29 8.71 9.7 11.3c-.39.39-.39 1.02 0 1.41l2.59 2.59c.63.63 1.71.18 1.71-.71V9.41c0-.89-1.08-1.33-1.71-.7z"})
                                         "ArrowLeftRounded"))
