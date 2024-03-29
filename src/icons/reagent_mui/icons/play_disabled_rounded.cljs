(ns reagent-mui.icons.play-disabled-rounded
  "Imports @mui/icons-material/PlayDisabledRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def play-disabled-rounded (create-svg-icon (e "path" #js {"d" "M2.1 3.51c-.39.39-.39 1.02 0 1.41l5.9 5.9v6.35c0 .79.87 1.27 1.54.84l3.45-2.2 6.08 6.08c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L3.51 3.51a.9959.9959 0 0 0-1.41 0zm15.58 9.33c.62-.39.62-1.29 0-1.69L9.54 5.98c-.27-.17-.57-.19-.84-.11l7.75 7.75 1.23-.78z"})
                                            "PlayDisabledRounded"))
