(ns reagent-mui.icons.wb-twilight-rounded
  "Imports @mui/icons-material/WbTwilightRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wb-twilight-rounded (create-svg-icon (e "path" #js {"d" "m19.07 9.37.71-.71c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0l-.71.71c-.39.39-.39 1.02 0 1.41.38.39 1.02.39 1.41 0zM21 18H3c-.55 0-1 .45-1 1s.45 1 1 1h18c.55 0 1-.45 1-1s-.45-1-1-1zM12 7c.56 0 1-.45 1-1V5c0-.55-.45-1-1-1s-1 .45-1 1v1c0 .55.45 1 1 1zM4.96 9.34c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-.71-.71a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l.71.71zM19 16c0-3.87-3.13-7-7-7s-7 3.13-7 7h14z"})
                                          "WbTwilightRounded"))
