(ns reagent-mui.icons.switch-left-rounded
  "Imports @mui/icons-material/SwitchLeftRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def switch-left-rounded (create-svg-icon (e "path" #js {"d" "M8.5 8.62v6.76L5.12 12 8.5 8.62m-4.79 2.67c-.39.39-.39 1.02 0 1.41l4.59 4.59c.62.63 1.7.19 1.7-.7V7.41c0-.89-1.08-1.34-1.71-.71l-4.58 4.59zM14 7.41v9.17c0 .89 1.08 1.34 1.71.71l4.59-4.59c.39-.39.39-1.02 0-1.41L15.71 6.7c-.63-.62-1.71-.18-1.71.71z"})
                                          "SwitchLeftRounded"))
