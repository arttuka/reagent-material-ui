(ns reagent-mui.icons.switch-right-rounded
  "Imports @mui/icons-material/SwitchRightRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def switch-right-rounded (create-svg-icon (e "path" #js {"d" "M15.5 15.38V8.62L18.88 12l-3.38 3.38m4.79-2.67c.39-.39.39-1.02 0-1.41L15.7 6.71c-.62-.63-1.7-.19-1.7.7v9.17c0 .89 1.08 1.34 1.71.71l4.58-4.58zM10 16.59V7.41c0-.89-1.08-1.34-1.71-.71L3.7 11.29c-.39.39-.39 1.02 0 1.41l4.59 4.59c.63.63 1.71.19 1.71-.7z"})
                                           "SwitchRightRounded"))
