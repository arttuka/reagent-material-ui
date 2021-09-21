(ns reagent-mui.icons.north-west-rounded
  "Imports @mui/icons-material/NorthWestRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def north-west-rounded (create-svg-icon (e "path" #js {"d" "M6 15c.56 0 1-.45 1-1V8.41L17.89 19.3c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L8.41 7H14c.55 0 1-.45 1-1s-.45-1-1-1H6c-.55 0-1 .45-1 1v8c0 .55.45 1 1 1z"})
                                         "NorthWestRounded"))
