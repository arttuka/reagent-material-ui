(ns reagent-mui.icons.navigate-before-rounded
  "Imports @mui/icons-material/NavigateBeforeRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def navigate-before-rounded (create-svg-icon (e "path" #js {"d" "M14.91 6.71a.9959.9959 0 0 0-1.41 0L8.91 11.3c-.39.39-.39 1.02 0 1.41l4.59 4.59c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L11.03 12l3.88-3.88c.38-.39.38-1.03 0-1.41z"})
                                              "NavigateBeforeRounded"))
